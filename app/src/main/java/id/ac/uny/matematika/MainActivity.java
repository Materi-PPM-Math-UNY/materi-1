package id.ac.uny.matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btnOpen;
    Button btnExit;
    EditText edtNama;
    LinearLayout linContainer;

    String nama;
    Integer umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        linContainer = findViewById(R.id.linContainer);
        edtNama = findViewById(R.id.edtNama);
        btnOpen = findViewById(R.id.btnOpen);
        btnExit = findViewById(R.id.btnExit);

        View.OnClickListener openOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                /*String nama = edtNama.getText().toString();

                TextView textView = new TextView(MainActivity.this);
                textView.setPadding(20,20,20,20);
                textView.setText(nama);

                linContainer.addView(textView);
                edtNama.setText("");*/
            }
        };

        View.OnClickListener exitListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };

        btnOpen.setOnClickListener(openOnClick);
        btnExit.setOnClickListener(exitListener);

    }
}