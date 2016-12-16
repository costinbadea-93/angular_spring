package com.example.service;

import com.example.domain.Breach;
import com.example.repository.BreachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gatomulesei on 12/14/2016.
 */

@Transactional
@Service("breachService")
public class BreachService {

    @Autowired
    private BreachRepository breachRepository;

    public Breach createBreach(Breach breach){
        return breachRepository.save(breach);
    }

}