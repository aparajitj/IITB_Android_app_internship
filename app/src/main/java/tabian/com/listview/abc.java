package tabian.com.listview;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class abc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
    }
    //Extracting from the database
  /*  DBManager dbManager = new DBManager(getActivity());
dbManager.open();

    Cursor cursor = dbManager.fetch();
cursor.moveToFirst();
    final TextView txt = (TextView) getActivity().findViewById(R.id.t0);
txt.settext(cursor.getString(0));*/
}
