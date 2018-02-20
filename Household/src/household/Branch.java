package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

public class Branch implements Serializable {
	@Id @GeneratedValue private String branch_ID;
	private String name;
	private int area;
	private boolean is_headquarter;
	
	@OneToMany(mappedBy="branch") Set<Customer> customers;
	@OneToMany(mappedBy="branch") Set<Employee> employees;
	@OneToMany(mappedBy="branch") Set<Good> goods;
}
