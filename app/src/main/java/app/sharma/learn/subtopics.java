package app.sharma.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class subtopics extends AppCompatActivity {

    private String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        List<subcategories> sg = new ArrayList<>();

        if(getIntent() != null){
            title = getIntent().getStringExtra("Title");
        }


        List<subcategories> catigories ;
        catigories = new ArrayList<subcategories>();

        switch (title){
            case "Introduction":
                catigories.add(new subcategories("History of C++", "The C++ programming language has a history going back to 1979, when Bjarne Stroustrup was doing work for his Ph. D. thesis. One of the languages Stroustrup had the opportunity to work with was a language called Simula, which as the name implies is a language primarily designed for simulations.", "JBjjnqG0BP8"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                break;
            case "Basics":
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                catigories.add(new subcategories("sub-intro", "sub-into-context", "XXXXXXX"));
                break;
        }


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        SubRecyclerViewAdapter myAdapter = new SubRecyclerViewAdapter(getApplicationContext(),catigories);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);

    }
}