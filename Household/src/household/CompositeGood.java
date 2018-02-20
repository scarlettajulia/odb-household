package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

public class CompositeGood implements Serializable {
	private int number_required;
	
	@ManyToOne Good good_contains;
	@ManyToOne Good good_contained;
}
