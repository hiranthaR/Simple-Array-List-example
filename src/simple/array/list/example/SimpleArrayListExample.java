/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.array.list.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class SimpleArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //(java.util.List) A list only can hold Integers
        List<Integer> list = new ArrayList<>();

        list.add(121);
        list.add(21);
        list.add(12);
        list.add(2123);
        list.add(13);
        list.add(115);

        //print list
        System.out.println("List -> ");
        System.out.println(list);
        System.out.println("");

        //some usefull methods
        System.out.println("3rd value in the list -> " + list.get(2));
        System.out.println("Size of the List -> " + list.size());
        System.out.println("is there 25 in list? -> " + list.contains(25));
        System.out.println("is there 21 in list? -> " + list.contains(21));

        System.out.println("");

        //(java.util.List) A list only can hold users
        List<User> users = new ArrayList<>();

        //A user
        User user = new User(0, "Hirantha", "Kurunegala", "0702693523");

        // duplicates
        User user1 = new User(1, "Rushan", "Panadura", "0702342523");
        User user2 = new User(2, "Kamal", "Rambukkana", "0723444213");
        User user3 = new User(3, "Gayan", "Colombo", "0702693523");

        //add them in to users
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        //printing a user from external
        System.out.println("printing user2");
        printUser(user2);

        //print 2nd user in the list(user id->2) (List indexing starts from 0)
        System.out.println("printing 2nd user in the list");
        printUser(users.get(1));

        //print all users
        printUsersList(users);

        //additional reffer Maps.in maps we can store key value pairs like below
        //im going to store key -> (String) user name to value -> user
        
        /* Map<String,User> usersMap = new HashMap<>(); */
        
        //same as list.but we can index for our own :D
    }

    private static void printUser(User user) {

        System.out.println("ID -> " + user.getId());
        System.out.println("username -> " + user.getUsername());
        System.out.println("address -> " + user.getAddress());
        System.out.println("number -> " + user.getPhone_number());
        System.out.println("");

    }

    public static void printUsersList(List<User> users) {

        System.out.println("printing users list");
        int i = 1;
        //for each loop
        for (User user : users) {
            System.out.println("user " + i);
            System.out.println("ID -> " + user.getId());
            System.out.println("username -> " + user.getUsername());
            System.out.println("address -> " + user.getAddress());
            System.out.println("number -> " + user.getPhone_number());
            System.out.println("");
            i++;
        }
        System.out.println("Done!");
    }

}
