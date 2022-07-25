package com.assignment.restapi.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.restapi.dao.EmployeeDao;
import com.assignment.restapi.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeManagementService {
	@Autowired
	private EmployeeDao employeeDao;
	
	/*List <Employee> list;
	
	public EmployeeServiceImpl()
	{
		list =new ArrayList<>();	
		list.add(new Employee( 1, "Mouni", 70000, "developer"))	;
		list.add(new Employee( 2, "Ganani", 80000, "manager"))	;
		list.add(new Employee( 3, "Shannu", 90000, "tester"))	;
		
	}*/

	@Override
	public List<Employee> getEmployees() {
		
		//return list;
		return employeeDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployee(int employeeId) {
		/*Employee e=null;
		for(Employee k:list) {
			if(k.getId()==employeeId){
				e=k;
				break;
			}
		}*/
		return employeeDao.getOne(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		//list.add(employee);
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		/*list.forEach(e -> {
			if(e.getId()==employee.getId()) {
				e.setName(employee.getName());
				e.setSalary(employee.getSalary());
				e.setDesignation(employee.getDesignation());
			}
		});*/
		employeeDao.save(employee);
		return employee;
	}


}
