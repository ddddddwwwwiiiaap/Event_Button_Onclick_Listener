package com.example.eventbuttononclicklistener;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklrasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di eddittex email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                if (nama.equals("dwiaprilyaanggoroputry01@gmail.com")&&password.equals("passwordrahasia")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses",Toast.LENGTH_LONG).show();

                }
                else if (nama.equals("dwiaprilyaanggoroputry01@gmail.com") && password.equals(password)) {

                    //Paswword salah
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }

                else if ( nama.equals(nama) && password.equals("passwordrahasia")) {

                    //Email salah
                    Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG).show();

                }

                else if ( nama.equals(nama) && password.equals(password)) {
                    //login gagal
                    Toast.makeText(MainActivity.this, "Email dan Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}