package app.sharma.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        List<maincategories> maincats ;
        maincats = new ArrayList<>();
        maincats.add(new maincategories("Introduction"));
        maincats.add(new maincategories("Basics"));
        maincats.add(new maincategories("Flow Control"));
        maincats.add(new maincategories("Arrays"));
        maincats.add(new maincategories("Functions"));
        maincats.add(new maincategories("Pointers"));
        maincats.add(new maincategories("Object Oriented Concepts"));
        maincats.add(new maincategories("Files and Exceptions"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getApplicationContext(),maincats);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);
    }
}