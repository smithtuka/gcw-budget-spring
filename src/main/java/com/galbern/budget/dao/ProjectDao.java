package com.galbern.budget.dao;

import com.galbern.budget.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends PagingAndSortingRepository<Project, Long> {
}
