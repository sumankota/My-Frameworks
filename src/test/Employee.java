package test;

import java.math.BigDecimal;

public class Employee {

    String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	Integer age;
    BigDecimal salary;

    // generated by IDE, getters, setters, constructor, toString
}
