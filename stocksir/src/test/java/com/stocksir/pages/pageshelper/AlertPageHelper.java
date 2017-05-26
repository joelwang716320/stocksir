package com.stocksir.pages.pageshelper;

import com.stocksir.pages.LoginPage;
import com.stocksir.util.SeleniumUtil;

public class AlertPageHelper
{
	/** 登录出错的提示信息 */
	public static void checkAlertInfo(SeleniumUtil seleniumUtil,int waitMillisecondsForAlert,int code)
	{
		if (code==0)
		{
			seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_ALERT_USERNAME).getText(), "请输入用户名!");
		}
		else if(code==1)
		{
			seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_ALERT_PASSWORD).getText(), "请输入密码!");
		}
		else if (code==2) {
			seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_ALERT_PASSWORD).getText(), "用户名或密码错误！");
		}
		seleniumUtil.isTextCorrect(seleniumUtil.switchToPromptedAlertAfterWait(waitMillisecondsForAlert).getText(), "请输入用户名!");		
	}
	
	/** 登录出错的提示信息 */
	public static void checkAlertInfo(SeleniumUtil seleniumUtil,int waitMillisecondsForAlert)
	{
		seleniumUtil.isTextCorrect(seleniumUtil.switchToPromptedAlertAfterWait(waitMillisecondsForAlert).getText(), "确定退出该系统吗 ?");		
	}
	
}
