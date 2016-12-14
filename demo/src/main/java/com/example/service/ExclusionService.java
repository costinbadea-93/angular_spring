package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Exclusion;
import com.example.repository.ExclusionRepository;

@Transactional
@Service("exclusionService")
public class ExclusionService {

	@Autowired
	private ExclusionRepository exclusionRepository;
	
	public Exclusion createExclusion(Exclusion exclusion) {
		return exclusionRepository.save(exclusion);	
	}
	
	public Object retrieveAllExclusion(){
		return exclusionRepository.findAll();	
	}
}
