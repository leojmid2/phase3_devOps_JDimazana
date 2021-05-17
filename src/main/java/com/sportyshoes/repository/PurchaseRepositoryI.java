package com.sportyshoes.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sportyshoes.model.LineItem;
import com.sportyshoes.model.Purchase;
import com.sportyshoes.model.User;

public interface PurchaseRepositoryI extends JpaRepository<Purchase,Long>{

	public List<Purchase> findByPurchaseDate(Date date);
	
	
	/*@Query(value="SELECT p.purchase_date, p.purchase_num, p.total, pr.name, pr.price, l.quantity FROM PURCHASE p "
			+ "INNER JOIN LINE_ITEM l ON p.purchase_id = l.purchase_purchase_id "
			+ "INNER JOIN PRODUCT pr on l.product_product_id = pr.product_id "
			+ "WHERE pr.category_cat_id=:id",nativeQuery=true)
	public List<Purchase> findByCategory(@Param("id") Long categoryid);
	*/
	
	@Query(value="SELECT p.purchase_id, p.purchase_date, pr.name, pr.price FROM PURCHASE p INNER JOIN LINE_ITEM l on p.purchase_id=l.purchase_purchase_id INNER JOIN PRODUCT pr on l.product_product_id = pr.product_id WHERE pr.category_cat_id=:id",nativeQuery=true)
	public List<Object[]> findByCategory(@Param("id") Long categoryid);


}
