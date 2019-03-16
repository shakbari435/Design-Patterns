package com.phoenixdevs.designpatterns.SingletonSample;

public class Singleton {
    private static Singleton Instance;

    private String name;
    private String family;


    private Singleton() {

    }

    public static Singleton getInstance() {
        if (Instance == null)
            Instance = new Singleton();
        return Instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
