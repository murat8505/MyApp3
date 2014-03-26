package com.teamtreehouse.ribbit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class MediaFragment extends Fragment {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_media, container, false);
			
		WebView webView = (WebView) rootView.findViewById(R.id.fragment_media_webview);
		webView.loadUrl("http://www.coniecto.org/WPMU/ill/jobs/");
		
		return rootView;
		
		}	
}
