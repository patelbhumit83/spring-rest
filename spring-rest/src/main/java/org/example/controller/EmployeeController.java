package org.example.controller;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findall(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Employee findone(String id)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Employee update(String id, Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(String id)
    {

    }
}
