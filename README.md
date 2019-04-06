# Selenium-Coding-challenge-part1_rupam
This Repository contains the code for Selenium coding challenge part1- Naveen Automation Labs.
Url and Location details are read from TestRunDetails.properties file inside src/main/resources
src/main/java contains 3 Package: 
  1.Assignment.Zoopla.BrowseDriver contains class and method to intitialze chrome and close chrome.
  2.Assignment.Zoopla.ReadProperty contains class and methid to read property file
  3.Assignment.Zoopla.WebPages contains Web pages details and methods:
    a.homePage.java : This is the page opened when we enter the url.
    b.PropertyForSale.java : This page is opened when location is entered in homePage and Search is clicked, This page contains method to sort the Property price in descending order.
    c.fifthProperty.java: This page is opened on clicking 5th link from PropertyForSale.java page, This file contains method to fetch agent details and click on Agent name
    d.agentPage.java: This page is opened on clicking Agent name in fifthProperty.java page.
 
src/test/java contains one package with onne class file NewTest.java
this java class uses testNG to do the following:
1.Open Website
2.Enter location London, click on search
3.Display the property in Descending order in console.
4.Click on Fifth property.
5.Print logo, Agent name and phone number in console
6.Click on agent name.
7.Validate agent name from agent page and agent name from 
