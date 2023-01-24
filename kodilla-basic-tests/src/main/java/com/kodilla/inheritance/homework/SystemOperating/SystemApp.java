package com.kodilla.inheritance.homework.SystemOperating;

public class SystemApp {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1600, "iOs");
        operatingSystem.turnOn();

        Windows windows = new Windows(2000, "WindowsXp");
        windows.turnOn();

        Linux linux = new Linux(1988, "Linux");
        linux.turnOn();
    }
}
