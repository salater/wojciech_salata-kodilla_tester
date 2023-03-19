package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
Book book = new Book("Franklin Josef", "Zabawy noca");
BookRcord bookRcord = new BookRcord("Franke Dolas", "Jak rozpetalem 2 W-S", 1980);
BookHacked bookHacked = new BookHacked("we", "eeee");
bookHacked.modifyTitle("ZabawaZabawa");
book.modifyTitle("nocenoce");

        System.out.println(book + "|| oraz ||" + '\n' + bookRcord +
                '\n'+ "|| hacked ||" + bookHacked );
    }
}
