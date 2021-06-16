package org.example.controller;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, value = "/Employees")
    public List<Employee> findall(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/Employees{id}")
    public Employee findone(@PathVariable("id") String id)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Employees")
    public Employee create(@RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Employees{id}")
    public Employee update(@PathVariable("id") String id, @RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Employees{id}")
    public void delete(@PathVariable("id") String id)
    {
    }
}
