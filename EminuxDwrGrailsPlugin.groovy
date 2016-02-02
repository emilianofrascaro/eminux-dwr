import org.directwebremoting.servlet.DwrServlet

class EminuxDwrGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.2 > *"
    def pluginExcludes = [
        'grails-app/views/**',
        'src/**/test/**'
    ]
    def title = "Eminux DWR Plugin"
    def author = "Emiliano Frascaro"
    def authorEmail = "ing.eminux@gmail.com"
    def description = 'Integration between Grails 2.x and DWR'
    def documentation = "http://grails.org/plugin/eminux-dwr"
    def license = "GPL3"
    def issueManagement = [url: 'https://github.com/emilianofrascaro/eminux-dwr/issues']
    def scm = [url: 'https://github.com/emilianofrascaro/eminux-dwr']

    def doWithWebDescriptor = { xml ->
        def servletElement = xml.'servlet'
        def lastServletMapping = servletElement[servletElement.size() - 1]
        lastServletMapping + {
            servlet {
                'servlet-name'("dwr-invoker")
                'servlet-class'(DwrServlet.name)
            }
        }

        def mappingElement = xml.'servlet-mapping'
        def lastMapping = mappingElement[mappingElement.size() - 1]
        lastMapping + {
            'servlet-mapping' {
                'servlet-name'("dwr-invoker")
                'url-pattern'("/dwr/*")
            }
        }
    }
}
