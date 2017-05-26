package com.stocksir.testcase.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.LoginPage;
import com.stocksir.pages.pageshelper.AlertPageHelper;
import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.plugins.father.LoginFather;
import com.stocksir.util.PropertiesDataProvider;

/**
 * @author lance
 * @Description 登陆失败-只输入用户名不输入密码
 * */
public class LoginPage_004_Fail_Only_Username_Test extends LoginFather {

	@Test
	public void loginFailTest_Username(ITestContext context) {
		String configFilePath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String username = PropertiesDataProvider.getTestData(configFilePath, "username");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, LoginPage.LP_INPUT_USERNAME);
		AlertPageHelper.checkAlertInfo(seleniumUtil, waitMillisecondsForAlert,1);
	}

}
