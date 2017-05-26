package com.stocksir.testcase.login;

/**
 *@author  lance
 *@Description 测试用例：登陆界面UI测试
 *
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.plugins.father.LoginFather;

public class LoginPage_001_UI_Test extends LoginFather
{
	@Test
	public void loginTest(ITestContext context)
	{
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.checkInputData(seleniumUtil); 
	}
}
