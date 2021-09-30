package com.wsiz.company.service;

import com.wsiz.company.model.Employee;
import com.wsiz.company.model.EmployeeEntity;
import com.wsiz.company.model.OfficeEntity;
import com.wsiz.company.repository.EmployeeRepository;
import com.wsiz.company.repository.EmpsalaryRepository;
import com.wsiz.company.repository.OfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final OfficeRepository officeRepository;
    private final EmpsalaryRepository empsalaryRepository;

    public EmployeeEntity createEmployee(Employee employee) {
        OfficeEntity savedOffice = officeRepository.save(employee.getEmployee().getOffice());
        employee.getEmployee().setOffice(savedOffice);

        EmployeeEntity savedEmployee = employeeRepository.save(employee.getEmployee());
        employee.getSalary().setEmployeeEntity(savedEmployee);
        empsalaryRepository.save(employee.getSalary());

        return savedEmployee;
    }
}
