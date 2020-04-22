package com.galbern.budget.dao;

import com.galbern.budget.domain.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageDao extends PagingAndSortingRepository<Stage, Long> {
}
