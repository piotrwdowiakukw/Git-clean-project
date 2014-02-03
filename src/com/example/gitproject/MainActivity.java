package com.example.gitproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b;
	Button bKolor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "B£YSK!", 1).show();
			}
		});
		
		bKolor = (Button) findViewById(R.id.button2);
				b.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Toast.makeText(getApplicationContext(), "ZMIENIAM KOLOR!", 1).show();
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
