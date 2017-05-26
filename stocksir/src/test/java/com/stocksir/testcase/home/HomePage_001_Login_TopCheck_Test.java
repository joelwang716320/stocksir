package com.stocksir.testcase.home;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.stocksir.pages.HomePage;
import com.stocksir.plugins.father.HomeFather;

/**
 * @author lance
 * @Description 测试用例：登录成功以后再次检查顶部用户等是否显示出来
 * 
 * */
public class HomePage_001_Login_TopCheck_Test extends HomeFather {
	@Test
	public void topCheck(ITestContext context) {
		HomeFather.homeAuthenticationParpare(context, seleniumUtil);
//		isInFrameDisplay(timeOut);
//		isContainInFrame();
//		isOutFrameDisplay(timeOut);
//		isContainOutFrame();

	}

	// 检查页面元素是不是显示出来
	public void isInFrameDisplay(int timeOut) {
		// 跳入指定的frame中
		seleniumUtil.switchFrame(seleniumUtil.findElementBy(HomePage.HP_FRAME));
//		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_CITY);
//		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_WEATHER);
	}

	public void isOutFrameDisplay(int timeOut) {
		// 跳出frame
		seleniumUtil.outFrame();
//		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_DATE);
	}

	// 检查web页面上的文本内容是不是和需求文档定义的一致LP_INPUT_AUTO
	public void isContainInFrame() {
//		seleniumUtil.assertTrue(seleniumUtil.findElementBy(HomePage.HP_TEXT_WEATHER), "今");
//		seleniumUtil.assertTrue(seleniumUtil.findElementBy(HomePage.HP_TEXT_WEATHER), "明");
//		seleniumUtil.isTextCorrect(seleniumUtil.findElementBy(HomePage.HP_TEXT_CITY).getText(), "襄阳");

	}

	public void isContainOutFrame() {
//		seleniumUtil.assertTrue(seleniumUtil.findElementBy(HomePage.HP_TEXT_DATE), "月");
//		seleniumUtil.assertTrue(seleniumUtil.findElementBy(HomePage.HP_TEXT_DATE), "日");
//		seleniumUtil.assertTrue(seleniumUtil.findElementBy(HomePage.HP_TEXT_DATE), "（星期");
	}

}
