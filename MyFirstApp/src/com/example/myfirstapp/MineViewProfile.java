package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;

public class MineViewProfile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mine_view_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mine_view_profile, menu);
		return true;
	}

	public void mineUpdateMessage(View view){
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Update");
		alertDialog.setMessage("Updated Profile Successfully!");
		alertDialog.show();
	}
	public void mineRevertMessage(View view){
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Revert");
		alertDialog.setMessage("Reverted Profile Successfully!");
		alertDialog.show();
	}
}
