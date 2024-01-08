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