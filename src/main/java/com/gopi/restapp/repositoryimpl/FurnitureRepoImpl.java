package com.gopi.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Furniture;
import com.gopi.restapp.repository.FurnitureRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FurnitureRepoImpl implements FurnitureRepo {

	EntityManager entityM;

	public FurnitureRepoImpl(EntityManager entityM) {
		super();
		this.entityM = entityM;
	}

	@Override
	public List<Integer> fetchId() {
		String jpql = "SELECT p.furnitureId FROM Furniture p";
		TypedQuery<Integer> query = entityM.createQuery(jpql, Integer.class);
		return query.getResultList();

	}

	@Override
	public Furniture findById(int id) {
		return entityM.find(Furniture.class, id);
	}

	@Override
	public List<Furniture> findAll() {
		String jpql = "SELECT p FROM Furniture p";
		TypedQuery<Furniture> query = entityM.createQuery(jpql, Furniture.class);
		return query.getResultList();
	}

	@Override
	public void update(Furniture furniture) {
		entityM.merge(furniture);

	}

	@Override
	public void save(Furniture furniture) {
		entityM.merge(furniture);

	}

	@Override
	public void deleteById(int id) {
		String jpql = "DELETE FROM Furniture WHERE furnitureId = " + id;
		entityM.createQuery(jpql).executeUpdate();
	}
}
