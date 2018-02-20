package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Employee implements Serializable {
	@Id @GeneratedValue
	private int employee_ID;
	private String name;
	private Set<String> phone_numbers;
	@Temporal(TemporalType.DATE) private Date starting_date;
	private int base_salary;
	@Temporal(TemporalType.DATE) private Date birthdate;
	private int age;
	
	@OneToMany(mappedBy="employee") Set<ExecutiveCustomer> executive_customers;
	@ManyToOne Branch branch;
}
