package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.FrameworkPage;

public class TestFramework extends BaseTest {
	
	@Test
	public void enter() throws IOException
	{
		FrameworkPage f=new FrameworkPage(driver);
		f.submitdetails();
	}

}
