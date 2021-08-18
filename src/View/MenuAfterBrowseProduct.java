package View;

import View.Menu;

public class MenuAfterBrowseProduct implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Press 1 to add products");
        System.out.println("Press 2 to checkout");
        System.out.println("Press 3 to go to Main menu");
        System.out.println("Press 4 to logout");
    }
}
