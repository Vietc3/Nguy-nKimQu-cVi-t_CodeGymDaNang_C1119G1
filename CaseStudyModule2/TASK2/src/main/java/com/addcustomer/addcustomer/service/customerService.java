package com.addcustomer.addcustomer.service;

import com.addcustomer.addcustomer.entity.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface customerService {

    List<CustomerEntity> search(String name);

    CustomerEntity save(CustomerEntity entity);

    List<CustomerEntity> saveAll(List<CustomerEntity> entities);

    Optional<CustomerEntity> findById(Integer integer);

    boolean existsById(Integer integer);

    List<CustomerEntity>  findAll();

    List<CustomerEntity>  findAllById(List<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(CustomerEntity entity);

    void deleteAll(List<CustomerEntity> entities);

    void deleteAll();
}
