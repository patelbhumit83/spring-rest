package org.example.controller;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findall(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public Employee findone(@PathVariable("id") String id)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Employee update(@PathVariable("id") String id, @RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable("id") String id)
    {
    }
}
