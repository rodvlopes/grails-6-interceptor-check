package g610

import grails.compiler.GrailsCompileStatic
import grails.artefact.Interceptor

@GrailsCompileStatic
class MainInterceptor implements Interceptor {

    int order = -10

    MainInterceptor() {
        matchAll()
    }

    boolean before() { 
         log.debug "before -> ${request}, ${params}, ${controllerName}, ${actionName}"
         true
    }
}


// package g610


// class MainInterceptor {

//     boolean before() { true }

//     boolean after() { true }

//     void afterView() {
//         // no-op
//     }
// }
