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
public class Card implements Serializable {
	@Id
	private String card_number;
	private String type;
	private String issuing_bank;
	@Temporal(TemporalType.DATE) private Date last_transaction;
	private int total_transaction;
	@Temporal(TemporalType.DATE) private Date expiry_date;
	
	@ManyToOne Customer customer;
	@ManyToMany
	@JoinTable(name="CARD_ORDERS")
	private Set<Order> orders;
}
