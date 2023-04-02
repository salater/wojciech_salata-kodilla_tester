package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersMenager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
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

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersMenager::getUserName)
                .collect(Collectors.toList());                         // strumien zwraca Liste
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();

    }
}

