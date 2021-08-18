package Service;

import Dao.User;
import Model.UserDetails;

import java.util.Scanner;

public class SignUp {


    public String registerUser() {
        User user = new User();
        System.out.println("Create a userId: ");
        Scanner scanner =  new Scanner(System.in);
        String userId = scanner.nextLine();
        while(user.checkIfUserExists(userId)){
            System.out.println("UserId already Exists, Please try another userId!!");
            System.out.println("Create a userId: ");
            userId = scanner.nextLine();
        }
        System.out.println("Enter your name: ");
        String name =  scanner.nextLine();
        System.out.println("Enter your dob: ");
        String dob =  scanner.nextLine();
        System.out.println("Enter your address: ");
        String address =  scanner.nextLine();
        System.out.println("Enter your password: ");
        String password =  scanner.nextLine();
        UserDetails userDetails = new UserDetails(name, userId, address, dob, password);
        user.addUserId(userDetails);
        System.out.println("User registered successfully!");
        return userId;
    }
}
