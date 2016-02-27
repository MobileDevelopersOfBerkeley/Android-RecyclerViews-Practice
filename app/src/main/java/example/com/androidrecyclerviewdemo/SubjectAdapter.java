package example.com.androidrecyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by aneeshjindal on 2/26/16.
 */
public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<SchoolSubject> schoolSubjectsArray;

    public SubjectAdapter(Context context, ArrayList<SchoolSubject> schoolSubjects) {
        this.context = context;
        schoolSubjectsArray = schoolSubjects;
    }

    /* In simplified terms, a ViewHolder is an object that holds the pointers to the views in each
    each row. What does that mean? Every row has a TextView, ImageView, and CheckBox. Each row has
    a ViewHolder, and that ViewHolder holder these 3 views in it (hence "view holder").
    This function returns a single ViewHolder; it is called once for every row.
    */
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        This "inflates" the views, using the layout R.layout.row_view
        // TODO: 2/26/16 Insert the correct parameter below. You can use Google or other resources to see what belongs there.
        View view = LayoutInflater.from(parent.getContext()).inflate(/*INSERT HERE*/, parent, false);
        return new CustomViewHolder(view);
    }

    /* This function takes the previously made ViewHolder and uses it to actually display the
    data on the screen. Remember how the holder contains (pointers to) the 3 views? By doing, for
    example, "holder.imageView" we are accessing the imageView for that row and setting the
    ImageResource to be the corresponding image for that subject.
     */
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        SchoolSubject schoolSubject = schoolSubjectsArray.get(position);

        holder.subjectNameTextView.setText(schoolSubject.name);
        // TODO: 2/26/16 Finish this method. Use the line above as a guide (I was tempted to remove it, but you're welcome!)

    }

    @Override
    public int getItemCount() {
        // TODO: 2/26/16 Finish this method (hint, it's 1 line long)
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView subjectNameTextView;
        ImageView imageView;
        CheckBox homeworkDoneCheckBox;

        public CustomViewHolder (View view) {
            super(view);
            this.subjectNameTextView = (TextView) view.findViewById(R.id.subjectNameTextView);
            // TODO: 2/26/16 Finish the constructor, using the line above as reference.
            /*Think about what we said in the comment above onCreateViewHolder to determine the
            purpose of the ViewHolder. Does it make sense why we are doing this in the constructor?
            */

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /*Get adapter position is getting the number of the row that was clicked,
                    starting at 0
                    */
                    // TODO: 2/26/16 Finish the onClickListener to display a Toast with the subject name when a row is clicked
//                    Hint: Use getAdapterPosition();
                }
            });
        }
    }
}
