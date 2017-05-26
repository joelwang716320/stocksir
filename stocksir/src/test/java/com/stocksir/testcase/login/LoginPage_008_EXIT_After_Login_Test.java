package com.stocksir.testcase.login;

/**
 *@author  lance
 *@Description 测试用例：退出登陆操作
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.HomePage;
import com.stocksir.pages.pageshelper.HomePageHelper;
import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.plugins.father.LoginFather;
import com.stocksir.util.PropertiesDataProvider;

public class LoginPage_008_EXIT_After_Login_Test extends LoginFather {

	@Test
	public void exitLoginTest(ITestContext context) {
		String configFilePath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String username = PropertiesDataProvider.getTestData(configFilePath, "username");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.checkLoginPageText(seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_TEXT_USERINFO);
		seleniumUtil.click(seleniumUtil.findElementBy(HomePage.HP_BUTTON_LOGOUT));
	}
}
