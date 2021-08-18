package Service;

import Dao.Product;
import Dao.User;
import Model.ProductDetails;
import View.MenuAfterBrowseProduct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    private Product product = new Product();
    private User user = new User();
    public void browseProduct(){
        Map<Integer, ProductDetails> productDetailsMap = product.getProductDetailsMap();
        System.out.println("Product details: ");
        for(Map.Entry entry: productDetailsMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void doTransaction(String userId) {
        new MenuAfterBrowseProduct().showMenu();
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1: //add item to cart
                addProductToCart(userId);
                break;
            case 2: //checkout
                new CheckOut().totalBillAmount(userId);
                break;
            case 3: // go to main menu
                new LogIn().homePage(userId);
                break;
            default:
                System.out.println("-------Incorrect input!!---------");
        }
    }

    private void addProductToCart(String userId) {
        System.out.println("Enter product Id");
        Scanner scanner = new Scanner(System.in);
        Integer productId = scanner.nextInt();
        if(product.getProductDetailsMap().containsKey(productId)) {
            Map<Integer, Integer> userCart = user.getUserMap().get(userId).getCart();
            userCart.put(productId, userCart.getOrDefault(productId,0)+1);
        }
        System.out.println("------Product added successfully to cart!-------");
        doTransaction(userId);
    }
}
