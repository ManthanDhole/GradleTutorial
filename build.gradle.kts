plugins{
    java
}
//The java project requires to know which class is to be treated as the main class so that it could
//start the application using that as the entrypoint
tasks.named<Jar>("jar")
{
    manifest{
        attributes["Main-Class"] = "com.gradlehero.languageapp.sayHello"
    }
}

//We also need to a repository configuration so that gradle know where to find the dependencies
repositories{
    mavenCentral()
}


//This will add the packages required by the java test code
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
                       //group : package : version
}

//A configuration is required to run the test
tasks.named<Test>("test")
{
    useJUnitPlatform()
}