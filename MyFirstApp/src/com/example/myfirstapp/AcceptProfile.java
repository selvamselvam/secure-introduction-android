package com.example.myfirstapp;

import com.example.myfirstapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AcceptProfile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accept_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accept_profile, menu);
		return true;
	}

	/** Called when the user touches the button */
	public void AcceptProfileReadQRMessage(View view) {
		 Intent intent = new Intent(this, AcceptProfileConnectServer.class);
		    startActivity(intent);
	}
	/** Called when the user touches the button */
	public void AcceptProfileReadFileMessage(View view) {
		 Intent intent = new Intent(this, AcceptProfileConnectServer.class);
		    startActivity(intent);
	}
	
	public void AcceptProfileExitMessage(View view){
		this.finish();
	    Intent intent = new Intent(Intent.ACTION_MAIN);
	    intent.addCategory(Intent.CATEGORY_HOME);
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    startActivity(intent);
	}
}
