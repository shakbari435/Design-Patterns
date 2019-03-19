package com.phoenixdevs.designpatterns.FactorySample;

public class ProgrammerFactory {


    public static int Android_PROGRAMMER_TYPE = 0;
    public static int WEB_PROGRAMMER_TYPE = 1;


    public static Programmer getProgrammer(int type) {
        switch (type) {
            case 0:
                return new AndroidProgrammer("hossein", "akbari", "5");
            case 1:
                return new WebProgrammer("hossein", "akbari", "0");
            default:
                return null;
        }
    }

}


