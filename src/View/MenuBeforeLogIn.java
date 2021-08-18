package View;

import View.Menu;

public class MenuBeforeLogIn implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Press 1 to SignUp");
        System.out.println("Press 2 to LogIn");
    }
}
