package com.example.dh_cadastrousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton btnAdd;
    private TextInputLayout inputNome;
    private TextInputLayout inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.floatingActionButton);
        inputNome = findViewById(R.id.textInputLayoutNome);
        inputEmail = findViewById(R.id.textInputLayoutEmail);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = inputNome.getEditText().getText().toString();
                String email = inputEmail.getEditText().getText().toString();

                if (nome.isEmpty() || nome == ""){
                    inputNome.setError("O campo não pode ser nulo!");
                } else if (email.isEmpty() || email == ""){
                    inputEmail.setError("O campo não pode ser nulo!");
                } else {
                    Snackbar.make(btnAdd, "Usuário cadastrado com sucesso!", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}
