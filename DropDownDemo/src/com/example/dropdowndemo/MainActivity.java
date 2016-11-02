package com.example.dropdowndemo;

import java.util.Arrays;
import java.util.LinkedList;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private DropDownView downView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
	}
	
	private void init() {
		downView = (DropDownView) findViewById(R.id.drop_down_view);
		LinkedList<DropDownItem> data = new LinkedList<DropDownItem>();
		data.add(new DropDownItem("xd001", "第一项"));
		data.add(new DropDownItem("xd002", "第二项"));
		data.add(new DropDownItem("xd003", "第三项"));
		data.add(new DropDownItem("xd004", "第四项"));
		downView.setmData(data);
		downView.addTextChangedListener(new TextChange());
	}
	
	private class TextChange implements TextWatcher {
		@Override
		public void afterTextChanged(Editable arg0) {
			Toast.makeText(MainActivity.this,
					"code : " + downView.getCode() + "\nvalue: " + downView.getValue(), 
					0).show();
		}
		@Override
		public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
				int arg3) {
		}

		@Override
		public void onTextChanged(CharSequence arg0, int arg1, int arg2,
				int arg3) {
		}
		
	}


}
