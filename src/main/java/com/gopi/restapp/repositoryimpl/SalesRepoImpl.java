package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Sales;
import com.gopi.restapp.repository.SalesRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SalesRepoImpl implements SalesRepo {

	EntityManager entityM;

	public SalesRepoImpl(EntityManager entityM) {
		super();
		this.entityM = entityM;
	}

	@Override
	public void save(Sales sales) {
		entityM.merge(sales);
	}

	@Override
	public Sales findById(int id) {
		return entityM.find(Sales.class, id);
	}

	@Override
	public List<Sales> findAll() {
		String jpql = "SELECT e FROM Sales e";
		TypedQuery<Sales> query = entityM.createQuery(jpql, Sales.class);
		return query.getResultList();
	}

	@Override
	public void update(Sales sales) {
		entityM.merge(sales);
	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM Sales WHERE customerId = " + id;
		entityM.createQuery(jpql).executeUpdate(); // not id only object
	}
}
