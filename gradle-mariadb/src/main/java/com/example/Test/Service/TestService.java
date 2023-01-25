package com.example.Test.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.Test.Repository.testInterface;
import com.example.Test.Vo.TestVo;

@Transactional
public class TestService {

	public List<TestVo> findMembers(){
		return testInterface.findAll();
		
	}	 
}
