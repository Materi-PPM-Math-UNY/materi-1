package id.ac.uny.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //String nama = getIntent().getStringExtra("n");

        TextView txtNama = findViewById(R.id.txtNama);


        Mahasiswa mhs = new Mahasiswa();
        mhs.setJurusan("Fisika");
        mhs.setNama("Hangga");
        mhs.setNim("023114754");
        mhs.setUsia(23);

        txtNama.setText(mhs.getNama()+" | "+mhs.getJurusan());

    }
}