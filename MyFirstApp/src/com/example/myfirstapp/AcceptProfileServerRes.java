package com.example.myfirstapp;

import com.example.myfirstapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class AcceptProfileServerRes extends Activity {
	private ImageView imgView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accept_profile_server_res);
		
		imgView = (ImageView) findViewById(R.id.imageView2);
		//imgView.setImageBitmap(BitmapFactory.decodeFile("ic_launcher-web.png"));
		imgView.setImageResource(R.drawable.images);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accept_profile_server_res, menu);
		return true;
	}

	public void AcceptProfileServerAcceptProfileMessage(View view){
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Accept");
		alertDialog.setMessage("Accept Profile!");
		alertDialog.show();
	}
	public void AcceptProfileRejectProfileMessage(View view)
	{
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Reject");
		alertDialog.setMessage("Reject Profile!");
		alertDialog.show();
		
	}
}
