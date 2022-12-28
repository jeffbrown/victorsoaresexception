package victorsoaresexception

import grails.gorm.transactions.Transactional

@Transactional
class Service1Service {
    Service2Service service2Service

    def service1Method() {
        try {
            service2Service.service2Method()
        } catch(CustomException ce) {
            // unreachable code
            throw ce
        }
    }
}
