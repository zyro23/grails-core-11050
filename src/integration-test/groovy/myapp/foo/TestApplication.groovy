package myapp.foo

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration


class TestApplication extends GrailsAutoConfiguration {

	static void main(String[] args) {
		GrailsApp.run(TestApplication, args)
	}
}