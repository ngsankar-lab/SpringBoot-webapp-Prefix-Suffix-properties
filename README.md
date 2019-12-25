# SpringBoot-webapp-Prefix-Suffix-properties
Spring boot web app - configuring prefix and suffix of redirection pages in properties file

What is it?
-----------
Created a controller class to handle/redirect the requested resource
Added the HttpServletReq to method to get the input values from client

Setting the Httpsession with attribute, So that you will fetch it from JSP page

Annotations used:
----------------
@Controller
@RequestMapping

application.properties
----------------------
added prefix key with value as "/pages/"---Because jsp pages are added to a pages folder
added suffix keay with value as ".jsp"---Using JSP as view

JSP Engine
------------
By default Spring Boot won't support JSP files, It will simply download home.jsp file.
Jasper dependency is requried to add under POM.xml, so that the data will be displayed instead of downloading .jsp file.
Jasper is Tomcat's JSP Engine. Jasper parses JSP files to compile them into Java code as servlets.
