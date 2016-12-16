package com.example.repository;

import com.example.domain.Breach;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gatomulesei on 12/14/2016.
 */

public interface BreachRepository extends JpaRepository<Breach, Long> {

}