package org.example;
import java.util.Comparator;
import java.util.TreeSet;

class User {
    String name;
    int age;

    User(String n, int a) {
        name = n;
        age = a;
    }
}

class Main {
    public static void main(String[] args) {
        class UserNameComparator implements Comparator<User>{
            public int compare(User a, User b){
                return a.name.compareTo(b.name);
            }
        }

        Comparator<User> uncomp = new UserNameComparator();
        TreeSet<User> tree = new TreeSet<>(uncomp);

         User u1 = new User("user1", 25);
         User u2 = new User("user2", 30);
         User u6 = new User("user6", 50);
         User u5 = new User("user5", 45);
         User u3 = new User("user3", 35);
         User u4 = new User("user4", 40);

         tree.add(u1);
         tree.add(u2);
         tree.add(u6);
         tree.add(u5);
         tree.add(u3);
         tree.add(u4);

        for (User s : tree){
            System.out.println(s.name);
        }    }
}