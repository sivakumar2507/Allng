package org.sampleng;


import static org.testng.Assert.*;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Mainng extends Baseclass {

	@BeforeClass
	private void beforeclass() {
		launchbrowser("chrome");
		System.out.println("beforeclass");
	}

	@Test
	private void test1() {
		launch("https://en-gb.facebook.com/");
		SoftAssert s=new SoftAssert();
		s.assertTrue(currenturl().contains("facebook"));
		Pom p = new Pom();
		fillthebox(p.getUser(),"avisumar");
	//	s.assertEquals("aviskumar",getatri(p.getUser()),"verify username");
		
		fillthebox(p.getPass(), "aviskumar");
	//	s.assertEquals("avisumar",getatri(p.getPass()),"verify pass");
		
		btnclick(p.getClick());
		System.out.println("B2 Success");
		
		
		System.out.println("Finish");
		System.out.println("New Git update");
		
	}

}