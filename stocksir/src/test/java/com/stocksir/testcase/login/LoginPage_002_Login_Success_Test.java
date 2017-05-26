package com.stocksir.testcase.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.plugins.father.LoginFather;
import com.stocksir.util.PropertiesDataProvider;

public class LoginPage_002_Login_Success_Test extends LoginFather
{
	@Test
	public void loginSuccessTest(ITestContext context)
	{
		String userInfoPath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String username = PropertiesDataProvider.getTestData(userInfoPath, "username");
		String password = PropertiesDataProvider.getTestData(userInfoPath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil);
	}
}
