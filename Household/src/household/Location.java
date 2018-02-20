package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

public class Location implements Serializable {
	@Id private String address;
	@Id private String city;
	private String province;
	private String postcode;
}
