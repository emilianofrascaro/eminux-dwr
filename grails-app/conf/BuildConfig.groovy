grails.project.work.dir = 'target'

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    legacyResolve false
    repositories {
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        compile 'org.directwebremoting:dwr:3.0.1-RELEASE'
    }

    plugins {
        build(":release:3.1.2", ":rest-client-builder:2.1.1") {
            export = false
        }
    }
}
