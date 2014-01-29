package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;



public class MineSendProfile extends Activity {

	private RadioButton rb1,rb2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mine_send_profile);
		
		rb1 = (RadioButton) findViewById(R.id.radioButton1);
		rb1.setChecked(true);
		rb2 = (RadioButton) findViewById(R.id.radioButton2);
		rb2.setChecked(true);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mine_send_profile, menu);
		return true;
	}

	public void mineCreateQRMessage(View view){
		 Intent intent = new Intent(this, MineQRCode.class);
		 startActivity(intent);
	}
	
	

}
