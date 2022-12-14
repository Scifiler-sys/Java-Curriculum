# Introduction to React
* It is a frontend Javascript library to develop websites
    * Notice it is just a library, hence we will need to add more and more dependencies to utilize other functionalities provided by other libraries
* It is **Single Page Application**
    *  Allows us to navigate through different web pages in our website without reloading the entire page
        * (When you did servlets, you noticed how everytime you enter a new page, it is completely blank and takes a while until you finally see something)
    * You only have one HTML page and you utilize JS heavily to dynamically change your website to **appear** like you went to a different page
    * Advantages:
        * Quick load time since your local computer/phone will do the majority of the leg work and doesn't need to talk to the server again
        * Provides pleasant user experience with mobile due to unstable network connections
    * Disadvantages:
        * Web crawlers will have a hard time finding specific section of your website (Mostly cause JS is the one that is giving HTML docs)
        * Uses a lot of resources, your computer is doing the majority of the "thinking" to render the website to your browser
* It is component-based
    * Don't with having one HTML document that will specify one web page in your website.
    * Instead, they modularize a website a bit more further
    * A components are the building blocks that makes your entire website
    * This was made so you can reuse multiple components in different places but displays things a little bit different
* They embraced a philosophy in which you should have everything in one place and not in different files

## Library vs. a Framework
* Easy distinction is a library is a lot less functions/features compared to a framework
* Actual technical distinction is Frameworks have a lot more control over the flow of your code and how it runs
    * Spring controls most of your object creation and also have specific pipelines it goes through ever time you run a spring framework project
    * In React, you will see that we still have to manually setup a lot of things just to use it
        * Heck, React by default doesn't have routing, we need to get another dependency just to do that