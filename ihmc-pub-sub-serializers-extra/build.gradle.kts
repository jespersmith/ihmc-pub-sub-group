plugins {
   id("us.ihmc.ihmc-build") version "0.20.1"
   id("us.ihmc.ihmc-ci") version "5.3"
   id("us.ihmc.ihmc-cd") version "1.8"
}

ihmc {
   loadProductProperties("../group.gradle.properties")

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
    api("us.ihmc:ihmc-pub-sub:source")
    api("com.fasterxml.jackson.core:jackson-databind:2.8.7")
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.8.7")
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.8.7")
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-properties:2.8.7")
    api("org.codehaus.woodstox:woodstox-core-asl:4.1.4")
    api("de.undercouch:bson4jackson:2.7.0")
}

testDependencies {
    api("us.ihmc:ihmc-pub-sub-generator-test:source")
}
