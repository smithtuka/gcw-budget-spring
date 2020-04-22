package com.galbern.budget.dao;

import com.galbern.budget.domain.Item;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao  extends PagingAndSortingRepository<Item, Long> {

//    Spring-data-jpa supports update operation.
//    You have to define the method in Repository interface.and annotated it with @Query and @Modifying.
//
//    @Modifying
//    @Query("update User u set u.firstname = ?1, u.lastname = ?2 where u.id = ?3")
//    void setUserInfoById(String firstname, String lastname, Integer userId);
//    @Query is for defining custom query and @Modifying is for telling spring-data-jpa that this query is an update operation and
//    it requires executeUpdate() not executeQuery()

}
