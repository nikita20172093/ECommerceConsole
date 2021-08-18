package Dao;

import Model.UserDetails;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class User {
   public static ConcurrentHashMap<String, UserDetails> userDetailsMap = new ConcurrentHashMap<>();
   public ConcurrentHashMap<String, UserDetails> getUserMap(){
       return userDetailsMap;
   }

    public boolean checkIfUserExists(String userId){
        return userDetailsMap.containsKey(userId);
    }

    public void addUserId(UserDetails userDetails){
       userDetailsMap.put(userDetails.getUserId(), userDetails);
    }

    public boolean authenticateUser(String userId, String password){
       if(!userDetailsMap.containsKey(userId) || !userDetailsMap.get(userId).getPassword().equals(password)) {
          return false;
       }
       return true;
    }

    public void setCart(String userId, Map<Integer, Integer> cart) {
       userDetailsMap.get(userId).setCart(cart);
    }
}
