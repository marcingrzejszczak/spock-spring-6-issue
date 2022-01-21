package com.example.demo

import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationSpec extends Specification {

	@Autowired
	DemoApplication demoApplication;

	def "should work"() {
		expect:
			demoApplication != null
	}

}
