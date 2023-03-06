package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
Button add,sub,mul,div;
TextView ans;
EditText no1,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.button1);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        ans=(TextView)findViewById(R.id.textView1);
        no1=(EditText)findViewById(R.id.editText1);
        no2=(EditText)findViewById(R.id.editText2);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int a,b,c;
				a=Integer.parseInt(no1.getText().toString());
				b=Integer.parseInt(no2.getText().toString());
				c=a+b;
				ans.setText(Integer.toString(c));
			}
		});
sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int a,b,c;
				a=Integer.parseInt(no1.getText().toString());
				b=Integer.parseInt(no2.getText().toString());
				c=a-b;
				ans.setText(Integer.toString(c));
			}
		});
mul.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=Integer.parseInt(no1.getText().toString());
		b=Integer.parseInt(no2.getText().toString());
		c=a*b;
		ans.setText(Integer.toString(c));
	}
});
div.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=Integer.parseInt(no1.getText().toString());
		b=Integer.parseInt(no2.getText().toString());
		c=a/b;
		ans.setText(Integer.toString(c));
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
