package com.test.rcsm;
//---------------------------------
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:META-INF/spring/sftpContext.xml"}
)
public class TestRCSM {
	
	@Test
	public void testTextBasedCopy() throws Exception{
	 //ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/spring-integration.xml");
	 System.out.println("Hello");
   }
}
