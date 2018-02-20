/**
 * 
 */
package household;

/**
 * @author scarletta
 *
 */

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Customer implements Serializable {
	@Id @GeneratedValue
	protected String customer_ID;
	protected String name;
	protected Set<String> phone_numbers;
	@Temporal(TemporalType.DATE) protected Date birthdate;
	protected int age;
	
	@OneToMany(mappedBy="customer") Set<Card> cards;
	@OneToMany(mappedBy="customer") Set<Order> orders;
	@ManyToOne Branch branch;
}
