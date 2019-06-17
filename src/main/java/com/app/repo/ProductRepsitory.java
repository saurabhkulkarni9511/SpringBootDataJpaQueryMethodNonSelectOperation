package com.app.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Integer>{

	@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
	@Modifying
	@Transactional
	public int updateCost(Double cost,Integer id);
	
	@Modifying
	@Transactional
	@Query("delete from Product p where p.prodId=:id")
	public int removeData(Integer id);
}

