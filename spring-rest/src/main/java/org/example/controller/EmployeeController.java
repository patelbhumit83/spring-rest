package org.example.controller;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, value = "/Employees")
    @ResponseBody
    public List<Employee> findall(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/Employees{id}")
    @ResponseBody
    public Employee findone(@PathVariable("id") String id)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Employees")
    @ResponseBody
    public Employee create(@RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Employees{id}")
    @ResponseBody
    public Employee update(@PathVariable("id") String id, @RequestBody Employee employee)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Employees{id}")
    @ResponseBody
    public void delete(@PathVariable("id") String id)
    {
    }
}
