package com.anigna.demo;

import java.util.Arrays;
import java.util.List;
/*
 * Author: Anigna KB
 * Date: 08-Jan-2018
 * Description - Null Pointer Demo
 */

public class NullPointerDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1000, "Kumar", 25000.0f), new Employee(1001, "Vijay", 12345.5f));
		Employee found = find(11106, employees);
		System.out.println(found.getName()); // uh oh!
	}
	
	/*
	 * Returns one employee if found else empty
	 */
	public static Employee find(int empid, List<Employee> employees) {
		for (Employee emp : employees) {
			if (emp.getId() == empid) {
				return emp;
			}
		}
		return null;
	}
}
