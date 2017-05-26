package com.stocksir.testcase.home;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.HomePage;
import com.stocksir.pages.pageshelper.HomePageHelper;
import com.stocksir.pages.pageshelper.UserInfoPageHelper;
import com.stocksir.plugins.father.HomeFather;

/**
 * @author lance
 * @Description 登录情况下 点击个人信息，成功进入个人信息页面
 * 
 * */
public class HomePage_002_Login_UserInfoTabClick_Test extends HomeFather
{
	@Test
	public void loginUserInfoTabClick(ITestContext context){
	HomeFather.homeAuthenticationParpare(context, seleniumUtil);
	HomePageHelper.enterPage(seleniumUtil, HomePage.HP_BUTTON_PIM);
	UserInfoPageHelper.waitUserInfoPageToLoad(timeOut, seleniumUtil);
	UserInfoPageHelper.checkUserInfoPageText(timeOut, seleniumUtil);
	}
}
