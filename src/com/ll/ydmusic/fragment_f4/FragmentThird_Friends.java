package com.ll.ydmusic.fragment_f4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.imooc.weixin6_0.R;
import com.ll.ydmusic.musicmain.LaunchActivity;

public class FragmentThird_Friends extends Fragment {


	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO 自动生成的方法存根
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO 自动生成的方法存根
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
	}

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		//不能填container，否则会崩
		View v=inflater.inflate(R.layout.fragment_find, null);
		
		v.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				//getActivity();
				
				//Intent intent=new Intent(getActivity(), cls);
				//Intent intent=new Intent(this, LaunchActivity.class);
				//startActivity(intent);
			}
		});
		return v;
	}

}