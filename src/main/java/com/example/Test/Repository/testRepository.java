package com.example.Test.Repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.Test.Vo.TestVo;

public class testRepository implements testInterface{
	
private final EntityManager em;
	
	public testRepository(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public List<TestVo> findAll() {
		return em.createQuery("select m from test_tables m", TestVo.class)
				.getResultList();
	}
}
