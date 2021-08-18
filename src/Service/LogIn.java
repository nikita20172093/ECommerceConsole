package Service;

import Dao.Product;
import Dao.User;
import View.MenuAfterBrowseProduct;
import View.MenuAfterLogIn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogIn{
    private User user = new User();
    private ProductService productService = new ProductService();
    private DefaultMenu defaultMenu = new DefaultMenu();
    private CheckOut checkOut = new CheckOut();

    private boolean checkIfValidUser(String userName, String password) {
        return false;
    }

    public void homePage(String userId) {
        new MenuAfterLogIn().showMenu();
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        while (true) {
            switch (input) {
                case 1:
                    productService.browseProduct();
                    productService.doTransaction(userId);
                    break;
                case 2:
                    checkOut.totalBillAmount(userId);
                    break;
                case 3:
                    defaultMenu.showDefaultOptions();
                    break;
                default:
                    System.out.println("Incorrect input!!");
            }
        }
    }

    public void authenticateUserId() {
        System.out.println("Enter userId");
        Scanner scanner = new Scanner(System.in);
        String userId = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        if(!user.authenticateUser(userId, password)){
            System.out.println("Entered userId or password is incorrect");
            return;
        }
        homePage(userId);
    }
}
