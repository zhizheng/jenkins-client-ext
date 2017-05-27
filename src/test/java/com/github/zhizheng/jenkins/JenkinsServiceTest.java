/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.zhizheng.jenkins;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Jenkins service test case
 *
 * @author Zhang Zhizheng <zhizheng118@gmail.com>
 * @since 0.0.1-SNAPSHOT
 */
public class JenkinsServiceTest {

	String jenkinsUrl = "http://localhost:8080";// java -jar jenkins.war
	String jenkinsUser = "admin";
	String jenkinsPassword = "admin";
	JenkinsService service = null;
	
	@Before
	public void before(){
		service = new JenkinsServiceImpl(jenkinsUrl, jenkinsUser, jenkinsPassword);
	}
	
	@Test
	public void testIsJobExists(){
		String jobName = "myJob";
		boolean isExists = false;
		try {
			isExists = service.isJobExists(jobName);
		} catch (JenkinsException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, isExists);
	}
	
	// ...
	
	@After
	public void after(){
		
	}
}
