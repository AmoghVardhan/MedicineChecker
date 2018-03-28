package app.com.example.android.medicinechecker;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    RadioButton c1;
    RadioButton c2;
    RadioButton c3;
    RadioButton c4;
    RadioButton c5;
    RadioButton c6;
    RadioButton c7;
    RadioButton c8;
    RadioButton c9;
    RadioButton c10;
    RadioButton done1;
    RadioButton c11;
    RadioButton c12;
    RadioButton c13;
    RadioButton c14;
    RadioButton c15;
    RadioButton c16;
    RadioButton c17;
    RadioButton c18;
    RadioButton c19;
    RadioButton c20;
    RadioButton done2;
    EditText cycles;
    SharedPreferences sharedPreferences;
    public static int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.refresh);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        cycles = (EditText)findViewById(R.id.cycles);
        c1 = (RadioButton)findViewById(R.id.c1);
        c2 = (RadioButton)findViewById(R.id.c2);
        c3 = (RadioButton)findViewById(R.id.c3);
        c4 = (RadioButton)findViewById(R.id.c4);
        c5 = (RadioButton)findViewById(R.id.c5);
        c6 = (RadioButton)findViewById(R.id.c6);
        c7 = (RadioButton)findViewById(R.id.c7);
        c8 = (RadioButton)findViewById(R.id.c8);
        c9 = (RadioButton)findViewById(R.id.c9);
        c10 = (RadioButton)findViewById(R.id.c10);
        done1= (RadioButton)findViewById(R.id.Done1);
        c11 = (RadioButton)findViewById(R.id.c11);
        c12 = (RadioButton)findViewById(R.id.c12);
        c13 = (RadioButton)findViewById(R.id.c13);
        c14 = (RadioButton)findViewById(R.id.c14);
        c15 = (RadioButton)findViewById(R.id.c15);
        c16 = (RadioButton)findViewById(R.id.c16);
        c17 = (RadioButton)findViewById(R.id.c17);
        c18 = (RadioButton)findViewById(R.id.c18);
        c19 = (RadioButton)findViewById(R.id.c19);
        c20 = (RadioButton)findViewById(R.id.c20);
        done2= (RadioButton)findViewById(R.id.Done2);

        loadSavedPreferences();



    }

    public void inc(View view) {
        count++;
        cycles.setText(String.valueOf(count));
    }
    public void dec(View view) {
        count--;
        cycles.setText(String.valueOf(count));
    }

    private void loadSavedPreferences() {

        if(sharedPreferences.getBoolean("my_first_time",true)) {
            count = 0;
            cycles.setText(String.valueOf(count));
        }
       else
        {
        count = Integer.parseInt(sharedPreferences.getString("cycles",""));
        cycles.setText(String.valueOf(count));
        }
        c1.setChecked(sharedPreferences.getBoolean("c1", Boolean.parseBoolean("")));
        c2.setChecked(sharedPreferences.getBoolean("c2", Boolean.parseBoolean("")));
        c3.setChecked(sharedPreferences.getBoolean("c3", Boolean.parseBoolean("")));
        c4.setChecked(sharedPreferences.getBoolean("c4", Boolean.parseBoolean("")));
        c5.setChecked(sharedPreferences.getBoolean("c5", Boolean.parseBoolean("")));
        c6.setChecked(sharedPreferences.getBoolean("c6", Boolean.parseBoolean("")));
        c7.setChecked(sharedPreferences.getBoolean("c7", Boolean.parseBoolean("")));
        c8.setChecked(sharedPreferences.getBoolean("c8", Boolean.parseBoolean("")));
        c9.setChecked(sharedPreferences.getBoolean("c9", Boolean.parseBoolean("")));
        c10.setChecked(sharedPreferences.getBoolean("c10", Boolean.parseBoolean("")));
        done1.setChecked(sharedPreferences.getBoolean("done1", Boolean.parseBoolean("")));
        c11.setChecked(sharedPreferences.getBoolean("c11", Boolean.parseBoolean("")));
        c12.setChecked(sharedPreferences.getBoolean("c12", Boolean.parseBoolean("")));
        c13.setChecked(sharedPreferences.getBoolean("c13", Boolean.parseBoolean("")));
        c14.setChecked(sharedPreferences.getBoolean("c14", Boolean.parseBoolean("")));
        c15.setChecked(sharedPreferences.getBoolean("c15", Boolean.parseBoolean("")));
        c16.setChecked(sharedPreferences.getBoolean("c16", Boolean.parseBoolean("")));
        c17.setChecked(sharedPreferences.getBoolean("c17", Boolean.parseBoolean("")));
        c18.setChecked(sharedPreferences.getBoolean("c18", Boolean.parseBoolean("")));
        c19.setChecked(sharedPreferences.getBoolean("c19", Boolean.parseBoolean("")));
        c20.setChecked(sharedPreferences.getBoolean("c20", Boolean.parseBoolean("")));
        done2.setChecked(sharedPreferences.getBoolean("done2", Boolean.parseBoolean("")));
        sharedPreferences.edit().putBoolean("my_first_time",false).commit();
    }

    public void save(View view){
        sharedPreferences.edit().putString("cycles", String.valueOf(count)).apply();
        sharedPreferences.edit().putBoolean("c1", c1.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c2", c2.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c3", c3.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c4", c4.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c5", c5.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c6", c6.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c7", c7.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c8", c8.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c9", c9.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c10", c10.isChecked()).apply();
        sharedPreferences.edit().putBoolean("done1", done1.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c11", c11.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c12", c12.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c13", c13.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c14", c14.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c15", c15.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c16", c16.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c17", c17.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c18", c18.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c19", c19.isChecked()).apply();
        sharedPreferences.edit().putBoolean("c20", c20.isChecked()).apply();
        sharedPreferences.edit().putBoolean("done2", done2.isChecked()).apply();
        if(done1.isChecked() && done2.isChecked())
        {
            ++count;
        }
    }


//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        // Save UI state changes to the savedInstanceState.
//        // This bundle will be passed to onCreate if the process is
//        // killed and restarted.
//
//        savedInstanceState.putBoolean("c1", c1.isChecked());
//        savedInstanceState.putBoolean("c2", c2.isChecked());
//        savedInstanceState.putBoolean("c3", c3.isChecked());
//        savedInstanceState.putBoolean("c4", c4.isChecked());
//        savedInstanceState.putBoolean("c5", c5.isChecked());
//        savedInstanceState.putBoolean("c6", c6.isChecked());
//        savedInstanceState.putBoolean("c7", c7.isChecked());
//        savedInstanceState.putBoolean("c8", c8.isChecked());
//        savedInstanceState.putBoolean("c9", c9.isChecked());
//        savedInstanceState.putBoolean("c10", c10.isChecked());
//        savedInstanceState.putBoolean("done1", done1.isChecked());
//    }
//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        // Restore UI state from the savedInstanceState.
//        // This bundle has also been passed to onCreate.
//        c1.setChecked(savedInstanceState.getBoolean("c1"));
//        c2.setChecked(savedInstanceState.getBoolean("c2"));
//        c3.setChecked(savedInstanceState.getBoolean("c3"));
//        c4.setChecked(savedInstanceState.getBoolean("c4"));
//        c5.setChecked(savedInstanceState.getBoolean("c5"));
//        c6.setChecked(savedInstanceState.getBoolean("c6"));
//        c7.setChecked(savedInstanceState.getBoolean("c7"));
//        c8.setChecked(savedInstanceState.getBoolean("c8"));
//        c9.setChecked(savedInstanceState.getBoolean("c9"));
//        c10.setChecked(savedInstanceState.getBoolean("c10"));
//        done1.setChecked(savedInstanceState.getBoolean("done1"));
//
//    }
}
