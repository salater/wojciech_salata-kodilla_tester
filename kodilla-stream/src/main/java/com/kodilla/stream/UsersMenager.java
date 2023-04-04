package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersMenager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println("chemists" + chemistGroupUsernames);
        System.out.println("AGE" + filterAgeTo());

/*
         processUsersStream();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                //.map(user -> user.getUsername())
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .forEach(username -> System.out.println(username));

 */ //strumien zwraca String
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                //.filter(user -> user.getAge() > 45)
                .map(UsersMenager::getUserName)
                .collect(Collectors.toList());                         // strumien zwraca Liste
        return usernames;
    }



    public static String getUserName(User user) {
        return user.getUsername();

    }

   private static List<String> filterAgeTo() {
        List<String> userNamesAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .map(UsersMenager::getUserName)
                .collect(Collectors.toList());                         // strumien zwraca Liste

        return userNamesAge;
    }
}

