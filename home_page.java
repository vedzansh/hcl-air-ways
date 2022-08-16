import java.util.*;

public class home_page extends Thread {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.println("\t ...........Welcome to HCL Fly Ways...........");
        System.out.println();
        System.out.println("\t\t\t .....Login.....");
        System.out.println("Press Enter to login :)");
        System.out.println("Press r to register yourself");
        
        String a = scam.nextLine();
        switch (a) {
            case "r":
            case "R":
                // call register function 
                break;
            default:
                // call login function
                break;
        }
    }
    static void lomgin() {
        System.out.println("Hemlo");
        
    }
}
