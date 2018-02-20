package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class RegularCustomer extends Customer implements Serializable{
	private int points;
}
