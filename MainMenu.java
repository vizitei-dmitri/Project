package menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Collection<User> account = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        GetTheUser regg = new GetTheUser();
        regg.registration(account);
    }
}
