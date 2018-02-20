package household;

import java.io.Serializable;

public class ExecutiveCustomer extends Customer implements Serializable {
	private int discount_rate;
	@ManyToOne Employee employee;
}
