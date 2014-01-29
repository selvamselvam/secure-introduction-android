package com.example.myfirstapp;

import com.example.myfirstapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class AcceptProfileConnectServer extends Activity {
	private ImageView imgView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accept_profile_connect_server);
	
		imgView = (ImageView) findViewById(R.id.imageView1);
		imgView.setImageResource(R.drawable.wait);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accept_profile_connect_server, menu);
		return true;
	}
	
	/** Called when the user touches the button */
	public void AcceptProfileServerConnectMessage(View view) {
		this.finish();
	    Intent intent = new Intent(Intent.ACTION_MAIN);
	    intent.addCategory(Intent.CATEGORY_HOME);
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    startActivity(intent);
	}

	
	public void AcceptProfileNextMessage(View view){
		 Intent intent = new Intent(this, AcceptProfileServerRes.class);
		 startActivity(intent);
	}
	
}
