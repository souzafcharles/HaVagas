package br.edu.ifsp.souza.charles.pdm.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.edu.ifsp.souza.charles.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}