package example.com.androidrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_view); // TODO: 2/26/16 Something is wrong with this line. Fix it.

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<SchoolSubject> schoolSubjects = new ArrayList<SchoolSubject>();

        SchoolSubject math = new SchoolSubject("Math", false, R.drawable.math);
        schoolSubjects.add(math);

        SchoolSubject science = new SchoolSubject("Science", true, R.drawable.science);
        schoolSubjects.add(science);

        SchoolSubject history = new SchoolSubject("History", true, R.drawable.history);
        schoolSubjects.add(history);

        SchoolSubject reading = new SchoolSubject("Reading", false, R.drawable.reading);
        schoolSubjects.add(reading);

        SubjectAdapter subjectAdapter = new SubjectAdapter(getApplicationContext(), schoolSubjects);

        recyclerView.setAdapter(schoolSubjects); // TODO: 2/26/16 Why doesn't this line work? Fix it. 

    }
}
