package com.galbern.budget.service.Impl;

import com.galbern.budget.domain.Item;
import com.galbern.budget.domain.Project;
import com.galbern.budget.domain.Stage;
import com.galbern.budget.service.ItemService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public Item addItem(Item i) {
        return null;
    }

    @Override
    public Set<Item> addItems(Set<Item> items) {
        return null;
    }

    @Override
    public Item findItem(Long id) {
        return null;
    }

    @Override
    public Set<Item> findAll() {
        return null;
    }

    @Override
    public Set<Item> retrieveItems(Stage stage) {
        return null;
    }

    @Override
    public Set<Item> retrieveItems(Project project, Stage stage) {
        return null;
    }

    @Override
    public Set<Item> retrieveItems(Project project, Set<Stage> stages) {
        return null;
    }

    @Override
    public Set<Item> retrieveItems(Project project, LocalDate date) {
        return null;
    }

    @Override
    public Boolean updateItem(Long id) {
        return null;
    }

    @Override
    public Set<Item> updateItems(Stage stage) {
        return null;
    }

    @Override
    public Set<Item> updateItems(Set<Item> items) {
        return null;
    }
}
