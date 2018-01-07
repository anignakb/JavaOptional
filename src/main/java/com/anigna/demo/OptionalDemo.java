package com.anigna.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
 * Author: Anigna KB
 * Date: 08-Jan-2018
 * Description - Preventing Null Pointer Using Optional Class
 */

public class OptionalDemo 
{
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1000, "Kumar", 25000.0f), new Employee(1001, "Vijay", 12345.5f));
		Optional<Employee> found = find(1000, employees);
		if(found.isPresent()) {
			System.out.println(found.get().getName());
		}else {
			System.out.println("Employee Not Present");
		}
	}
	/*
	 * Returns one employee if found else empty
	 */
	public static Optional<Employee> find(int empid, List<Employee> employees) {
		for (Employee emp : employees) {
			if (emp.getId() == empid) {
				return Optional.of(emp);
			}
		}
		return Optional.empty();
	}
}
