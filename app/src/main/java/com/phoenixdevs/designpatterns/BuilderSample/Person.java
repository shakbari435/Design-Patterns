package com.phoenixdevs.designpatterns.BuilderSample;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age) {
        this(firstName, null, lastName, age);
    }
    public Person(String firstName, int age) {
        this(firstName, null, age);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public static class Builder {
        private String firstNames;
        private String middleNames;
        private String lastNames;
        private int ages;
        private String fathersNames;
        private String mothersNames;
        private double heights;
        private double weights;

        public Builder(int age){
            this.ages =age;
        }

        public Builder setFirstName(String firstName) {
            this.firstNames = firstName;
            return this;
        }


        public Builder setLastName(String lastName) {
            this.lastNames = lastName;
            return this;
        }


        public Person build() {
            return new Person(firstNames,lastNames, ages);
        }
    }
}
