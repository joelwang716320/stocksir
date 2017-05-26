package com.stocksir.pages;

import org.openqa.selenium.By;

/**
 * 声明登陆界面页面元素
 * 
 * */
public class LoginPage
{
	/** 登陆页面上的：用户名输入框 */
	public static final By LP_INPUT_USERNAME = By.cssSelector("input[name='username']");
	/** 登陆页面上的：密码输入框 */
	public static final By LP_INPUT_PASSCODE = By.cssSelector("input[name='password']");
	/** 登陆页面上的：登陆按钮 */
	public static final By LP_BUTTON_LOGIN = By.cssSelector("button[type='submit']");
	/** 登陆页面上的：重置按钮 */
	public static final By LP_BUTTON_RESET = null;
	/** 登陆页面上的：请输入用户名弹出信息 */
	public static final By LP_ALERT_USERNAME = null;
	/** 登陆页面上的：请输入密码弹出信息 */
	public static final By LP_ALERT_PASSWORD = null;
	
}
