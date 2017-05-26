package com.stocksir.pages;

import org.openqa.selenium.By;


/**
 * 声明主界面页面元素
 * 
 * */
public class HomePage
{
	/** 登陆成功之后 用户 区域 */
	
	public static final By HP_TEXT_USERINFO = By.cssSelector("strong.font-bold");
	
	/** 登陆成功之后 关闭操作按钮 */
	public static final By HP_TEXT_AGENCY = By.xpath("//button[text()='关闭操作']");

	/** 登陆成功之后 退出按钮 */
//	public static final By HP_TEXT_ROLE= By.xpath("//a[text()='退出']");
	public static final By HP_TEXT_ROLE= By.cssSelector("a[class]");

	/** 登陆成功之后 注销按钮 */
	public static final By HP_BUTTON_LOGOUT = By.cssSelector("span.l-btn-text.icon-back.l-btn-icon-left");
	
	/** 点击注销按钮后 弹出框中的取消按钮 */
	public static final By HP_BUTTON_CANCEL = By.cssSelector("input[value='取消']");
	
	/** 点击注销按钮后 弹出框中的取消按钮 */
	public static final By HP_BUTTON_ENSURE = By.cssSelector("input[value='确定']");
	
	/** 点击注销按钮后 弹出框中的取消按钮 */
	public static final By HP_BUTTON_CLOSE = By.cssSelector("a[title='关闭(esc键)']");

	/** 登陆成功之后 控制面板按钮 */
	public static final By HP_BUTTON_CONTROLPANEL = By.cssSelector("span.l-btn-text.icon-help.l-btn-icon-left");
	
	/** 登陆成功之后 控制面板下的个人信息按钮 */
	public static final By HP_BUTTON_PIM = By.cssSelector("#layout_north_kzmbMenu>div[2]>div");
	
	/** 登陆成功之后 控制面板下的修改密码按钮 */
	public static final By HP_BUTTON_CHANGEPASSWORD = By.cssSelector("#layout_north_kzmbMenu>div[4]>div");
	
	/** 登陆成功之后 基础信息菜单 */
	public static final By HP_LINKBUTTON_BASICINFO = By.xpath("//span[text()='基础信息']");
	
	/** 登陆成功之后 系统管理菜单 */
	public static final By HP_LINKBUTTON_SYSTEMMANAGEMENT = By.xpath("//span[text()='系统管理']");
	
	/** 登陆成功之后 单据中心菜单 */
	public static final By HP_LINKBUTTON_DOCUMENTCENTER = By.xpath("//span[text()='单据中心']");
	
	/** 登陆成功之后 宴会管理菜单 */
	public static final By HP_LINKBUTTON_BANQUETMANAGEMENT = By.xpath("//span[text()='宴会管理']");
	
	/** 登陆成功之后 统计报表菜单 */
	public static final By HP_LINKBUTTON_REPORT = By.xpath("//span[text()='统计报表']");
	
	public static final By HP_TAB_TRACKGOODS = null;
	
	public static final By HP_LINK_MYGOODS = null;
	
	public static final By HP_INPUT_ORDERNO = null;
	
	public static final By HP_TEXT_FOOTER = null;
	
	public static final By HP_LEFT_TITLE = null;
	
	public static final By HP_ARERA_ITEMS = null;
	
	public static final By HP_LINK_MORE = null;

	/** 登陆成功之后 首页frame */
	public static final By HP_FRAME = null;
	
	
		
}
