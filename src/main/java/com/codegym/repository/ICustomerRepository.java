package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

   Customer save(Customer customer);

    void deleteById(Long id);
}
