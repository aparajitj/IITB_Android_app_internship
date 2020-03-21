package tabian.com.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.lang.Math.E;

public class MainActivity extends AppCompatActivity {
    int temp=0;
    EditText e1;
    ArrayAdapter adapter;
    ArrayList<String> Loc = new ArrayList<>();
    private static final String TAG = "MainActivity";
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.theList);
        Log.d(TAG, "onCreate: Started.");
        EditText theFilter=(EditText)findViewById(R.id.searchFilter);

        Loc.add("abc");
        Loc.add("abcd");
        Loc.add("abcdef");
        Loc.add("abcdefghi");
        Loc.add("jklmno");
        Loc.add("jkpqr");
        //Loc.clear();
        adapter = new ArrayAdapter(this, R.layout.list_item_layout, Loc);
        list.setAdapter(adapter);

        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (MainActivity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,cities, Toast.LENGTH_SHORT).show();
                        if (temp==0) {
                            if (position == 0) {
                                Intent x = new Intent(view.getContext(), abc.class);
                                startActivity(x);
                            } else if (position == 1) {
                                Intent x = new Intent(view.getContext(), abcd.class);
                                startActivity(x);
                            } else if (position == 2) {
                                Intent x = new Intent(view.getContext(), abcdef.class);
                                startActivity(x);
                            } else if (position == 3) {
                                Intent x = new Intent(view.getContext(), abcdefghi.class);
                                startActivity(x);
                            } else if (position == 4) {
                                Intent x = new Intent(view.getContext(), jklmno.class);
                                startActivity(x);
                            } else if (position == 5) {
                                Intent x = new Intent(view.getContext(), jkpqr.class);
                                startActivity(x);
                            }
                        }
                        else if (temp==1){
                            if (position==0)
                            {
                                Intent x= new Intent(view.getContext(),jkpqr.class);
                                startActivity(x);
                            }
                            else  if (position==1)
                            {
                                Intent x= new Intent(view.getContext(),abc.class);
                                startActivity(x);
                            }
                            else  if (position==2)
                            {
                                Intent x= new Intent(view.getContext(),abcd.class);
                                startActivity(x);
                            }
                            else  if (position==3)
                            {
                                Intent x= new Intent(view.getContext(),abcdef.class);
                                startActivity(x);
                            }
                            else  if (position==4)
                            {
                                Intent x= new Intent(view.getContext(),abcdefghi.class);
                                startActivity(x);
                            }
                            else  if (position==5)
                            {
                                Intent x= new Intent(view.getContext(),jklmno.class);
                                startActivity(x);
                            }
                        }
                        else if (temp==2){
                            if (position==0)
                            {
                                Intent x= new Intent(view.getContext(),jklmno.class);
                                startActivity(x);
                            }
                            else  if (position==1)
                            {
                                Intent x= new Intent(view.getContext(),abcdefghi.class);
                                startActivity(x);
                            }
                            else  if (position==2)
                            {
                                Intent x= new Intent(view.getContext(),jkpqr.class);
                                startActivity(x);
                            }
                            else  if (position==3)
                            {
                                Intent x= new Intent(view.getContext(),abc.class);
                                startActivity(x);
                            }
                            else  if (position==4)
                            {
                                Intent x= new Intent(view.getContext(),abcd.class);
                                startActivity(x);
                            }
                            else  if (position==5)
                            {
                                Intent x= new Intent(view.getContext(),abcdef.class);
                                startActivity(x);
                            }
                        }
                    }
                }
        );
    }

    public void dis(View v){
        temp=1;
        Loc.clear();
        Loc.add("jkpqr");
        Loc.add("abc");
        Loc.add("abcd");
        Loc.add("abcdef");
        Loc.add("abcdefghi");
        Loc.add("jklmno");
        adapter = new ArrayAdapter(this, R.layout.list_item_layout, Loc);
        list.setAdapter(adapter);

    }

    public void rat(View v){
        temp=2;

        Loc.clear();
        Loc.add("jklmno");
        Loc.add("abcdefghi");
        Loc.add("jkpqr");
        Loc.add("abc");
        Loc.add("abcd");
        Loc.add("abcdef");


        adapter = new ArrayAdapter(this, R.layout.list_item_layout, Loc);
        list.setAdapter(adapter);

    }
}
