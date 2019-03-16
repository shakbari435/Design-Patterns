package com.phoenixdevs.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.phoenixdevs.designpatterns.BuilderSample.Person;
import com.phoenixdevs.designpatterns.FacedeSample.ShapeMaker;
import com.phoenixdevs.designpatterns.FactorySample.Programmer;
import com.phoenixdevs.designpatterns.FactorySample.ProgrammerFactory;
import com.phoenixdevs.designpatterns.SingletonSample.Singleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Singleton Design Pattern Sample
        Singleton.getInstance().setName("hossein");
        Singleton.getInstance().getName();



        // TODO: Builder Design Pattern Sample
        Person person = new Person.Builder(25)
                .setFirstName("Hossein")
                .setLastName("Akbari")
                .build();



        // TODO: Factory Design Pattern Sample
        Programmer programmer = ProgrammerFactory.getProgrammer(ProgrammerFactory.Android_PROGRAMMER_TYPE);



        // TODO: Facade Design Pattern Sample
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }
}
