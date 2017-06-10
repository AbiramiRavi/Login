package com.example.student.ex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Loginpage extends AppCompatActivity {

    EditText user,pass;
    Button bt;
    String u,p;
    RadioGroup rg;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2;
    String un="Atom", pn="atom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        user=(EditText)findViewById(R.id.editText5);
        pass=(EditText)findViewById(R.id.editText6);
        bt=(Button)findViewById(R.id.login);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        cb1=(CheckBox)findViewById(R.id.checkBox2);
        cb2=(CheckBox)findViewById(R.id.checkBox3);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Loginpage2.class);
                u=user.getText().toString();
                p=pass.getText().toString();




                if(!un.equals(u) && pn.equals(p))
                {
                    Toast.makeText(getApplicationContext(),"username was incorrect",Toast.LENGTH_LONG).show();

                }
                if(un.equals(u) && !pn.equals(p))
                {
                    Toast.makeText(getApplicationContext(),"Password was incorrect",Toast.LENGTH_LONG).show();
                }
                if (un.equals(u) && pn.equals(p))
                {
                    Bundle b=new Bundle();

                    b.putString("u",u);
                    b.putString("p",p);
                    i.putExtras(b);
                    startActivity(i);

                    Toast.makeText(getApplicationContext(), "Login successfully", Toast.LENGTH_LONG).show();
                }
                if(!un.equals(u) && !pn.equals(p))
                {
                    Toast.makeText(getApplicationContext(),"username and password are incorrect",Toast.LENGTH_LONG).show();
                }
                user.setText("");
                pass.setText("");
               // Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();


            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.rr1) {
            Intent ii=new Intent(getApplicationContext(),Arithematic.class);
            startActivity(ii);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
