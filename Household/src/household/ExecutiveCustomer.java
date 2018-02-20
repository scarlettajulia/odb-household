package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

public class ExecutiveCustomer extends Customer implements Serializable {
	private int discount_rate;
	
	@ManyToOne Employee employee;
}
