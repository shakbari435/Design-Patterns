package com.phoenixdevs.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.phoenixdevs.designpatterns.AdapterSample.AudioPlayer;
import com.phoenixdevs.designpatterns.BuilderSample.Person;
import com.phoenixdevs.designpatterns.FacadeSample.ShapeMaker;
import com.phoenixdevs.designpatterns.FactorySample.Programmer;
import com.phoenixdevs.designpatterns.FactorySample.ProgrammerFactory;
import com.phoenixdevs.designpatterns.Observer.MyModel;
import com.phoenixdevs.designpatterns.Observer.MyObserver;
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
        Programmer programmer =
                ProgrammerFactory.getProgrammer(ProgrammerFactory.Android_PROGRAMMER_TYPE);


        // TODO: Facade Design Pattern Sample
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();


        // TODO: Adapter Design Pattern Sample
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");


        // TODO: Observer Design Pattern Sample
        MyModel model = new MyModel();
        MyObserver observer = new MyObserver(model);
        // we change the last name of the person, observer will get notified
        for (MyModel.Persons persons : model.getPersons()) {
            persons.setLastName(persons.getLastName() + "1");
            Log.e("OBSERVER", "onCreate: " + persons.getLastName());
        }
        // we change the name of the person, observer will get notified
        for (MyModel.Persons persons : model.getPersons()) {
            persons.setFirstName(persons.getFirstName() + "1");
            Log.e("OBSERVER", "onCreate: " + persons.getFirstName());
        }

    }
}
