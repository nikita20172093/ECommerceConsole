package Service;

import Dao.Product;
import Dao.User;
import Model.ProductDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {

    public void totalBillAmount(String userId) {
        Map<Integer, ProductDetails> productDetailsMap = new Product().getProductDetailsMap();
        Map<Integer, Integer> cart = new User().getUserMap().get(userId).getCart();
        Float totalAmount = 0F;
        for(Integer entry: cart.keySet()){
            totalAmount += (cart.get(entry)*productDetailsMap.get(entry).getPrice());
        }
        if(cart.isEmpty()){
            System.out.println("-------There is no item in cart-------");
        }else {
            System.out.println("-------Total Payable amount is: " + totalAmount);
            // emptying cart
            new User().getUserMap().get(userId).setCart(new HashMap<>());
        }
    }
}
