package com.Raphael.loginrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView email, pass;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (TextView) findViewById(R.id.email);
        pass = (TextView) findViewById(R.id.pw);
        LoginButton = (Button) findViewById(R.id.Login);

        final String EmailWajib = "RapRap@rap.rap";
        final String PassWajib= "RapRap";

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isiemail = email.getText().toString();
                String isipass = pass.getText().toString();

                if(isiemail.isEmpty() || isipass.isEmpty()) {

                    Toast.makeText(MainActivity.this, "ISI DATA OI",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if(isiemail.equals(EmailWajib) && isipass.equals(PassWajib)){
                        Toast.makeText(MainActivity.this, "Sign In Berhasil", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(MainActivity.this, "Sign In Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
public void Steambtn(View view) {
    Intent SteamIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/id/RaphZett/"));
    startActivity(SteamIntent);
}
public void wabtn(View view) {
     Intent WAIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/628111515078?text=Hello%20Raph"));
     startActivity(WAIntent);
}
public void linebtn(View view) {
     Intent LineIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://line.me/ti/p/~raphzet"));
     startActivity(LineIntent);
}
}