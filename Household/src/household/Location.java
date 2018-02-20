package household;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Embeddable
public class Location{
    private String address;
    private String city;
    private String province;
    private String postcode;

    public Location(String address, String city, String province, String postcode) {
        this.address = address;
        this.city = city;
        this.province = province;
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    
}
