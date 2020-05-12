package com.galbern.budget.service.Impl;

import com.galbern.budget.dao.ItemDao;
import com.galbern.budget.domain.Item;
import com.galbern.budget.domain.Project;
import com.galbern.budget.domain.Stage;
import com.galbern.budget.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Future;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public Item addItem(Item i) {
        return itemDao.save(i);
    }

    @Override
    public List<Item>addItems(List<Item> items) {
        var items1 = itemDao.saveAll(items);
        return (List<Item>)items1;
    }

    @Override
    public Item findItem(Long id) {
        return itemDao.findById(id).orElse(null); // throw exception
    }

    @Override
    public Set<Item> findAll() {
        return (Set<Item> )itemDao.findAll();
    }

    @Override
    public Boolean updateItem(Item iNew) {
//     controller side - save() in spring data jpa is contextually for both merge() / update() and persist()/insert()
        if(iNew.isActive()==false) return false; // better with an exception message
        Item i = findItem(iNew.getId());
        i.setActive(false);

        return true;
    }

    @Override
    public Set<Item> updateItems(Stage stage) {
        return null;
    }

    @Override
    public Set<Item> updateItems(Set<Item> items) {
        return null;
    }

    // go to Biz logic instead
    @Override
    public Set<Item> retrieveItems(Stage stage) {
        var items = findAll(); // check project and stage before retrieval
        return items;
    }
    // go to Biz logic instead
    @Override
    public Set<Item> retrieveItems(Project project, Stage stage) {
        return null;
    }
    // go to Biz logic instead
    @Override
    public Set<Item> retrieveItems(Project project, Set<Stage> stages) {
        return null;
    }
    // go to Biz logic instead
    @Override
    public Set<Item> retrieveItems(Project project, LocalDate date) {
        return null;
    }
}
