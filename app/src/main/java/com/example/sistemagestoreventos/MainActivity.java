package com.example.sistemagestoreventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sistemagestoreventos.modelo.autenticacion.AutenticacionLoginModel;
import com.example.sistemagestoreventos.modelo.autenticacion.AutenticacionLoginResModel;
import com.example.sistemagestoreventos.interfaces.AutenticacionAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btninicio;
    EditText usuario , eTpass , RecuperarC , Registar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninicio = (Button) findViewById(R.id.btninicio);
        usuario = (EditText) findViewById(R.id.usuario);
        eTpass = (EditText) findViewById(R.id.eTpass);
        RecuperarC = (EditText) findViewById(R.id.RecuperarC);
        Registar = (EditText) findViewById(R.id.Registar);

        btninicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = usuario.getText().toString();
                String password = eTpass.getText().toString();

                if (!correo.isEmpty() && !password.isEmpty()){
                    AutenticacionAPI autenticacionAPI = new ClienteAPI().getClient().create(AutenticacionAPI.class);
                    AutenticacionLoginModel loginModel = new AutenticacionLoginModel();
                    loginModel.setCorreo(correo);
                    loginModel.setPassword(password);
                    Call<AutenticacionLoginResModel> resModelCall = autenticacionAPI.postLogin(loginModel);
                    resModelCall.enqueue(new Callback<AutenticacionLoginResModel>() {
                        @Override
                        public void onResponse(Call<AutenticacionLoginResModel> call, Response<AutenticacionLoginResModel> response) {
                            if (response.isSuccessful()){
                                startActivity(new Intent(MainActivity.this,Inicio.class));
                            }else{
                                Toast.makeText(MainActivity.this, "ERROR: Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<AutenticacionLoginResModel> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Falló la petición" + t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }else{
                    Toast.makeText(MainActivity.this, "ERROR: Los campos son obligatorios", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}