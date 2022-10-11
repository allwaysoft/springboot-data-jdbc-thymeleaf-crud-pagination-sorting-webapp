package net.javaguides.springboot.repository;

import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
