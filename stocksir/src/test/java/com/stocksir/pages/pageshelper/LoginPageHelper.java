package com.stocksir.pages.pageshelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.stocksir.pages.HomePage;
import com.stocksir.pages.LoginPage;
import com.stocksir.util.SeleniumUtil;

public class LoginPageHelper
{
	public static Logger logger = Logger.getLogger(LoginPageHelper.class.getName());
	
	/** 登录操作 密码和用户名都书写 */
	public static void login(SeleniumUtil seleniumUtil, String username, String password) {

		seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME));
		seleniumUtil.type(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME), username);
		seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE));
		seleniumUtil.type(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE), password);
		seleniumUtil.click(seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN));
	}
	
	/** 登录操作 按照输入的条件来选择登录 */
	public static void login(SeleniumUtil seleniumUtil, String loginInfo, By loginElement) {

		seleniumUtil.clear(seleniumUtil.findElementBy(loginElement));
		seleniumUtil.type(seleniumUtil.findElementBy(loginElement), loginInfo);
		seleniumUtil.click(seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN));
	}
	
	/** 待页面元素加载出来 */
	public static void waitLoginPageToLoad(int timeOut, SeleniumUtil seleniumUtil) {
		logger.info("start checking login page elements");
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_USERNAME);
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_PASSCODE);
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_BUTTON_LOGIN);
		logger.info("check login page elements completed");
	}

	/** 检查该页面上的文本 */
	public static void checkLoginPageText(SeleniumUtil seleniumUtil) {
		logger.info("start checking login page text");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME).getAttribute("placeholder"), "用户名");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE).getAttribute("placeholder"), "密码");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN).getText(), "登 录");
		logger.info("check login page text completed");
	}

	/** 判断登陆界面框输入是否正确 */
	public static void checkInputData(SeleniumUtil seleniumUtil) {
		// 设置用户名
		seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME));
		seleniumUtil.type(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME), "admin-ttnb");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME).getAttribute("value"), "admin_jj");
		// 设置密码
		seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE));
		seleniumUtil.type(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE), "123456");
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE).getAttribute("value"), "123456");

	}

	/** 检查登陆成功后用户信息是不是正确的 */
	public static void checkUserInfo(int timeOut, int sleepTime, SeleniumUtil seleniumUtil) {
		seleniumUtil.pause(sleepTime);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERINFO);
		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_TEXT_USERINFO).getText(), "admin_jj");
	}
	
	/**从登陆页面上做的一些点击擦操作*/
	public static void enterPage(SeleniumUtil seleniumUtil, By elementLocator){
		
		seleniumUtil.click(seleniumUtil.findElementBy(elementLocator));		
	}
	
}
