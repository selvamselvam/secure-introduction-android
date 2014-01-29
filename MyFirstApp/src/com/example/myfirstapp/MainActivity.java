package com.example.myfirstapp;

import com.example.myfirstapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	/** Called when the user touches the button */
	public void ViewProfileMessage(View view) {
		 Intent intent = new Intent(this, ViewProfiles.class);
		 startActivity(intent);
		
	}
	
	/** Called when the user touches the button */
	public void AcceptProfileMessage(View view) {
		 Intent intent = new Intent(this, AcceptProfile.class);
		    startActivity(intent);
	}
	
	/** Called when the user touches the button */
	public void ExitProfileMessage(View view) {
	
	this.finish();
    Intent intent = new Intent(Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_HOME);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(intent);
	}
	
	public void minecreateprofileMessage(View view){
		 Intent intent = new Intent(this, MineCreateProfile.class);
		    startActivity(intent);
	}
	
public void minesendprofileMessage(View view){
	
	
	Intent intent = new Intent(this, MineSendProfile.class);
    startActivity(intent);
	}

public void mineviewprofileMessage(View view){
	Intent intent = new Intent(this, MineViewProfile.class);
    startActivity(intent);
}
}
