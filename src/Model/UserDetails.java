package Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserDetails {
   private String name;
   private String userId;
   private String address;
   private String dob;

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getPassword() {
        return password;
    }

    public Map<Integer, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, Integer> cart) {
        this.cart = cart;
    }

    private String password;
   private Map<Integer, Integer> cart;

    public UserDetails(String name, String userId, String address, String dob, String password) {
        this.name = name;
        this.userId = userId;
        this.address = address;
        this.dob = dob;
        this.password = password;
        this.cart = new HashMap<>();
    }
}
