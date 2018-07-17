package myapp.foo

import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration(applicationClass = Application)
class FooIntegrationSpec extends Specification {

	void "test custom integration test application class"() {
		when:
		true

		then:
		true
	}

}
