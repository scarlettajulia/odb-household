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
public class Order implements Serializable {
	@Id @GeneratedValue
	private int order_number;
	@Temporal(TemporalType.DATE) private Date order_date;
	private Set<Quantity> quantities;
	
	//@ManyToOne Employee employee;
	@ManyToOne Customer customer;
	@ManyToOne Card card;
	@ManyToMany(mappedBy="orders")
	private Set<Card> cards;
	
}
