package com.tts.week9day2.repository;

import com.tts.week9day2.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Good practice to state where you at
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {




}
