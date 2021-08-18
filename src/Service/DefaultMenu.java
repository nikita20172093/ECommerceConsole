package Service;

import Dao.Product;
import View.MenuBeforeLogIn;

import java.util.Scanner;

public class DefaultMenu {
    public void showDefaultOptions(){
        new Product().populateProducts();
        new MenuBeforeLogIn().showMenu();
        Scanner scanner = new Scanner(System.in);
        switch(scanner.nextInt()) {
            case 1:
                String userId = new SignUp().registerUser();
                new LogIn().homePage(userId);
                break;
            case 2:
                new LogIn().authenticateUserId();
                break;
            default:
                System.out.println("--------Incorrect input!!-------");
        }
    }
}
