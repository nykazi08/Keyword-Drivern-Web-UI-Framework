package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.keyword.engine.Keywordengine;

public class LoginTest {
	
	public Keywordengine keyworengine;
	@Test
	public void loginTest()
	{
		Keywordengine keywordengine = new Keywordengine();
		try {
			keywordengine.startExecution("login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
