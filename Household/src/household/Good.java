package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

public class Good implements Serializable {
	@Id @GeneratedValue private int good_ID;
	private String description;
	private String color;
	private int size;
	private int quantity_contained_in_one_good;
	private int stock_quantity;
	
	@ManyToOne Branch branch;
	@OneToMany(mappedBy="good") Set<CompositeGood> composite_goods_contains;
	@OneToMany(mappedBy="good") Set<CompositeGood> composite_goods_contained;
}
