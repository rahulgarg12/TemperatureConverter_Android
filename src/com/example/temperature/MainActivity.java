package com.example.temperature;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText t1 = (EditText) findViewById(R.id.editText1);
		final RadioButton cf = (RadioButton) findViewById(R.id.radioButton1);
	    final RadioButton fc = (RadioButton) findViewById(R.id.radioButton2);
	    final Button b = (Button) findViewById(R.id.button1);
	    b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (t1.getText().length()==0) {
					Toast.makeText(getApplicationContext(), "Enter a valid number", Toast.LENGTH_LONG).show();
				}
					else {
						float i1 = Float.parseFloat(t1.getText().toString());
						
						if (cf.isChecked()) {
							i1 = (float) ((i1*1.8)+32);
							cf.setChecked(false);
					        Toast.makeText(getApplicationContext(), "Temperature in Fahrenheit: "+i1, Toast.LENGTH_LONG).show();
					      } 
						else {
					        i1 = (float) ((i1-32)/1.8);
					        fc.setChecked(false);
					        Toast.makeText(getApplicationContext(), "Temperature in Celsius: "+i1, Toast.LENGTH_LONG).show();
					      }
						
				}
				
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
