package com.stocksir.testcase.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.pageshelper.AlertPageHelper;
import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.plugins.father.LoginFather;
import com.stocksir.util.PropertiesDataProvider;

/**
 * @author lance
 * @Description 登陆失败-输入不正确的用户，正确密码点击登陆，提示：“用户名或密码错误,请重新登录!”
 * */
public class LoginPage_006_Fail_Incorrect_Username_Test extends LoginFather {

	@Test
	public void loginFailTest_incorrectUsername(ITestContext context) {
		String configFilePath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String incorrectusername = PropertiesDataProvider.getTestData(configFilePath, "incorrectusername");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, incorrectusername, password);
		AlertPageHelper.checkAlertInfo(seleniumUtil, waitMillisecondsForAlert,2);

	}

}
