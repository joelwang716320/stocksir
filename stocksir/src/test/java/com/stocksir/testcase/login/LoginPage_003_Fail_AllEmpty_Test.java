package com.stocksir.testcase.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.LoginPage;
import com.stocksir.pages.pageshelper.AlertPageHelper;
import com.stocksir.plugins.father.LoginFather;

/**
 * @author lance
 * @Description 登陆失败：用户名和密码都不填写
 * */
public class LoginPage_003_Fail_AllEmpty_Test extends LoginFather
{
	@Test
	public void loginFailTest_AllEmpty(ITestContext context)
	{
		LoginFather.loginParpare(context, seleniumUtil);
		seleniumUtil.click(seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN));
		AlertPageHelper.checkAlertInfo(seleniumUtil,waitMillisecondsForAlert,0);
	}
}
