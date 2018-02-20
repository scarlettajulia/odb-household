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
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long customer_ID;
    protected String name;
    protected Set<String> phone_numbers;
    @Temporal(TemporalType.DATE) protected Date birthdate;
    protected int age;
    protected Location address;

    @OneToMany(mappedBy="customer") Set<Card> cards;
    @OneToMany(mappedBy="customer") Set<Order> orders;
    @ManyToOne Branch branch;

    public Customer(String name, Set<String> phone_numbers, Date birthdate) {
        this.name = name;
        this.phone_numbers = phone_numbers;
        this.birthdate = birthdate;
    }
    
    protected int calculateAge(){
        return 10;
    }
    
    public long getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(long customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(Set<String> phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }
    
    
}
