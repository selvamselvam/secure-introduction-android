package com.example.myfirstapp;

import java.util.ArrayList;

import com.example.myfirstapp.R;
import com.example.myfirstapp.util.ItemDetails;
import com.example.myfirstapp.util.ItemListBaseAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;



public class ViewProfiles extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_profiles);
		
		//ArrayList<ItemDetails> image_details = GetSearchResults();
		 
		//final ListView lv1 = (ListView) findViewById(R.id.listView1);
		//lv1.setAdapter(new ItemListBaseAdapter(this, image_details));
		 
	
	
	}

	/*
	private ArrayList<ItemDetails> GetSearchResults(){
		ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
		 
		ItemDetails item_details = new ItemDetails();
		item_details.setName("Pizza");
		item_details.setEmail("Spicy Chiken Pizza");
		item_details.setAdded("RS 310.00");
		item_details.setUpdated("");
		item_details.setImageNumber(1);
		results.add(item_details);
		 
		item_details = new ItemDetails();
		item_details.setName("Burger");
		item_details.setEmail("Spicy Chiken Pizza");
		item_details.setAdded("Beef Burger");
		item_details.setUpdated("RS 350.00");
		item_details.setImageNumber(2);
		results.add(item_details);
		 
		item_details = new ItemDetails();
		item_details.setName("Pizza");
		item_details.setEmail("Spicy Chiken Pizza");
		item_details.setAdded("Chiken Pizza");
		item_details.setUpdated("RS 250.00");
		item_details.setImageNumber(3);
		results.add(item_details);
		 
		
		 
		return results;
		}
	*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_profiles, menu);
		return true;
	}

}
