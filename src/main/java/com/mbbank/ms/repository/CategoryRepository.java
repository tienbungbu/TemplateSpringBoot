package com.mbbank.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbbank.ms.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
