package menu;


import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class GetTheUser{
    public void registration(Collection<User> account) {

        System.out.println ("enter username");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        if (account.contains(new User(username, null, null, null, null, null))) {
            System.out.println (" username is occupied ");
        } else {
            System.out.println ("enter password:");
            String password = scan.nextLine();
            System.out.println ("enter name:");
            String name = scan.nextLine();
            System.out.println ("enter lastname:");
            String lastname = scan.nextLine();
            System.out.println ("enter age:");
            int age = scan.nextInt();
            System.out.println ("enter money:");
            int money = scan.nextInt();

            account.add(new User(username, password, name, lastname, age, money));
            System.out.println ("the registration is completed");
            Object[] NewUser = account.toArray();
            System.out.println ("в этой коллекции:");
        }
    }
}