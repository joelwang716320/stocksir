package com.stocksir.pages.pageshelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.stocksir.pages.HomePage;
import com.stocksir.util.SeleniumUtil;

public class HomePageHelper
{
	public static Logger logger = Logger.getLogger(HomePageHelper.class
			.getName());

	/** 等待首页上的元素加载*/
	public static void waitHomePageToLoad(int timeOut, SeleniumUtil seleniumUtil)
	{
		logger.info("Start checking home page elements");
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERINFO);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_AGENCY);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_ROLE);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_LOGOUT);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_CONTROLPANEL);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_LINKBUTTON_BASICINFO);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_LINKBUTTON_SYSTEMMANAGEMENT);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_LINKBUTTON_DOCUMENTCENTER);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_LINKBUTTON_BANQUETMANAGEMENT);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_LINKBUTTON_REPORT);
		logger.info("Check home page elements completed");

	}
	
	/** 检查首页上的文本 */
	public static void checkHomePageText(SeleniumUtil seleniumUtil) {
		logger.info("Start checking home page text");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_TEXT_USERINFO).getText(), "管理员");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_TEXT_AGENCY).getText(), "五粮特曲");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_TEXT_ROLE).getText(), "超级管理员,超级管理员");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_BUTTON_CONTROLPANEL).getText(), "控制面板 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_BUTTON_LOGOUT).getText(), "注销 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_LINKBUTTON_BASICINFO).getText(), "基础信息 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_LINKBUTTON_SYSTEMMANAGEMENT).getText(), "系统管理 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_LINKBUTTON_DOCUMENTCENTER).getText(), "单据中心 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_LINKBUTTON_BANQUETMANAGEMENT).getText(), "宴会管理 ");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_LINKBUTTON_REPORT).getText(), "统计报表 ");
		logger.info("Check home page text completed");

	}
	
	/** 注销操作 密码和用户名都书写 */
	public static void logout(SeleniumUtil seleniumUtil)
	{
		seleniumUtil.click(seleniumUtil.findElementBy(HomePage.HP_BUTTON_LOGOUT));
	}
	
	/** 取消注销操作 */
	public static void cancelLogout(SeleniumUtil seleniumUtil)
	{
		seleniumUtil.click(seleniumUtil.findElementBy(HomePage.HP_BUTTON_CANCEL));
	}

	/** 确定注销操作 */
	public static void ensureLogout(SeleniumUtil seleniumUtil)
	{
		seleniumUtil.click(seleniumUtil.findElementBy(HomePage.HP_BUTTON_ENSURE));
	}

	/** 从首页进入指定的页面-根据元素定位来确定什么页面 */
	public static void enterPage(SeleniumUtil seleniumUtil, By elementLocator)
	{
		seleniumUtil.click(seleniumUtil.findElementBy(elementLocator));
	}

	/** 从首页进入指定的页面-根据元素定位来确定什么页面 */
	public static void enterPage(SeleniumUtil seleniumUtil, By elementLocator,int index)
	{
		seleniumUtil.click(seleniumUtil.findElementsBy(elementLocator).get(index));
	}

	/** 从首页进入指定的页面-根据元素定位来确定什么页面 */
	public static void enterPage(SeleniumUtil seleniumUtil, By bys, By by,int index)
	{
		seleniumUtil.click(seleniumUtil.getOneElement(bys, by, index));
	}
	
	/** 在首页暂停一会儿 */
	public static void holdOn(SeleniumUtil seleniumUtil, int sleepTime) {
		seleniumUtil.pause(sleepTime);
	}

}
