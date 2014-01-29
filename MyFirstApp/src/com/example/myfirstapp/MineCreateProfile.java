package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;

public class MineCreateProfile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mine_create_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mine_create_profile, menu);
		return true;
	}
	
	public void mineUploadMessage(View view){
		
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Cancel");
		alertDialog.setMessage("Cancel to Create Profile!");
		alertDialog.show();
		
		
	}
	
	public void mineExitMessage(View view)
	{
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Uploaded");
		alertDialog.setMessage("Uploaded Profile Successfully!");
		alertDialog.show();
	}

}
