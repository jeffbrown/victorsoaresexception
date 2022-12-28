package victorsoaresexception

class DemoController {

    Service1Service service1Service
    def controllerMethod() {
        try {
            service1Service.service1Method()
            render "No Exception  Was Thrown"
        } catch(CustomException ce) {
            render "CustomException was thrown, and caught by controller"
        }
    }
}
