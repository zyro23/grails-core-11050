package myapp.foo

import grails.artefact.Artefact
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration


@Artefact('Application')
class Application extends GrailsAutoConfiguration {

	static void main(String[] args) {
		GrailsApp.run(Application, args)
	}

	Collection<String> packageNames() {
		super.packageNames()
	}
}
