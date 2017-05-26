package com.stocksir.plugins.father;

import org.testng.ITestContext;

import com.stocksir.base.BaseParpare;
import com.stocksir.pages.HomePage;
import com.stocksir.pages.pageshelper.HomePageHelper;
import com.stocksir.pages.pageshelper.LoginPageHelper;
import com.stocksir.util.PropertiesDataProvider;
import com.stocksir.util.SeleniumUtil;

/**
 * @author lance
 * @description 每个流程 开始之间的一个准备类，主要是做登录准备以及相关数据加载准备
 * 
 * */
public class HomeFather extends BaseParpare {
	protected static int timeOut = 0;
	protected static int sleepTime = 0;
	protected static int waitMillisecondsForAlert = 0;
	
	/**
	 * 首页上用户的注销操作以及相关数据准备
	 * */
	public static void homeAuthenticationParpare(ITestContext context, SeleniumUtil seleniumUtil) {

		timeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
		sleepTime = Integer.valueOf(context.getCurrentXmlTest().getParameter("sleepTime"));
		waitMillisecondsForAlert = Integer.valueOf(context.getCurrentXmlTest().getParameter("waitMillisecondsForAlert"));
		String configFilePath = String.valueOf(context.getCurrentXmlTest().getParameter("userInfoPath"));
		String username = PropertiesDataProvider.getTestData(configFilePath, "username");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		HomePageHelper.waitHomePageToLoad(timeOut, seleniumUtil);
		HomePageHelper.checkHomePageText(seleniumUtil);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_BUTTON_LOGOUT);
		HomePageHelper.cancelLogout(seleniumUtil);
//		AlertPageHelper.checkAlertInfo(seleniumUtil, waitMillisecondsForAlert);
//		HomePageHelper.logout(seleniumUtil);
		HomePageHelper.holdOn(seleniumUtil, sleepTime);
	}	
}
