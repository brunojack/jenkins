package com.jenkins;

import org.junit.Before;
import org.junit.Test;


public class HelloJenkinsTest {
	
	HelloJenkins jenk = null;
	
	@Before
	private void setUp(){
		jenk = new HelloJenkins();
	}

	@Test
	public void firstJenkinsTest(){
		jenk.firstJenkins();
	}

}
