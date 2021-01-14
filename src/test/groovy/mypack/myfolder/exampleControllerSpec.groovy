package mypack.myfolder

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

// NOTE: The nonstandard class naming convention here is intentional
// per https://stackoverflow.com/questions/65723769/grails-4-unit-test-controller-could-not-find-class
class exampleControllerSpec extends Specification implements ControllerUnitTest<exampleController> {

    void "test action which renders text"() {
        when:
        controller.hello()

        then:
        status == 200
        response.text == 'Hello, World!'
    }
}
