package View;

import View.Menu;

public class MenuAfterLogIn implements Menu {
    @Override
    public void showMenu() {
            System.out.println("Press 1 to browse products");
            System.out.println("Press 2 to checkout");
            System.out.println("Press 3 to logout");
    }
}
