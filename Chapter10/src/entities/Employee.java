package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	//CONSTRUTORES

	public Employee() {

	}

	public Employee(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	//GETTERS AND SETTERS
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	//FUNCOES
	
	public void increaseSalary(double percentage) {
		salary = salary +(salary * percentage/100.0);
		//Não precisa do this.. pois o salary esta na mesm a clase
	}



}