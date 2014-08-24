package com.ilsik.riddles;


import android.content.res.XmlResourceParser;


public class ResourceInputs extends FullscreenActivity {

	public ResourceInputs()
	{
		
	}
	
	public void LoadResources(String resourceName)
	{
		XmlResourceParser xmlFile = getResources().getXml(R.xml.riddle);
	}
	
}
