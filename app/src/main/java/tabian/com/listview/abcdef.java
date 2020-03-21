package tabian.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class abcdef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcdef);
    }
    //Extracting from the database
     /*  DBManager dbManager = new DBManager(getActivity());
dbManager.open();

    Cursor cursor = dbManager.fetch();
cursor.moveToFirst();
    final TextView txt = (TextView) getActivity().findViewById(R.id.t2);
txt.settext(cursor.getString(0));*/
}
