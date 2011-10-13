package com.tablethellow;

import android.app.Activity;
import android.os.Bundle;

public class TreeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tree);
	}
	
	public void printTest()
	{
		System.out.println("Hello!");
	}
}
