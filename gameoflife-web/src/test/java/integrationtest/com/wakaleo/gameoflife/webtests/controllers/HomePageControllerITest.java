package integrationtest.com.wakaleo.gameoflife.webtests.controllers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import com.wakaleo.gameoflife.webtests.controllers.HomePageController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:META-INF/spring/*-context.xml"})
public class HomePageControllerITest {

	@Autowired private HomePageController homePageController;
	
	@Test
	public void testIndex(){
		ModelAndView index = homePageController.index();
		assertEquals(index.getViewName(), "home");
	}
}
