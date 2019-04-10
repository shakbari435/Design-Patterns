package com.phoenixdevs.designpatterns.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
    public static final String FIRSTNAME = "firstName";
    public static final String LASTNAME = "lastName";

    private List<Persons> persons = new ArrayList<Persons>();
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    public class Persons {

        private String firstName;

        private String lastName;

        public Persons(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {

            return firstName;
        }

        public void setFirstName(String firstName) {
            notifyListeners(
                    this,
                    FIRSTNAME,
                    this.firstName,
                    this.firstName = firstName);

        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            notifyListeners(
                    this,
                    LASTNAME,
                    this.lastName,
                    this.lastName = lastName);
        }
    }

    public List<Persons> getPersons() {
        return persons;
    }

    public MyModel() {
        // just for testing we hard-code the persons here:
        persons.add(new Persons("Lars", "Vogel"));
        persons.add(new Persons("Jim", "Knopf"));
    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }

}
