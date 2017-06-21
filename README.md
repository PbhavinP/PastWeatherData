** DESCRIPTION  **
   This microservice project will dislay weather data of the day based on date and city name given by user as a part REST API by user, in JSON format.
   
   I have deployed this on GCP and access link is given below.
   
	    => http://weatherdata-171403.appspot.com/rest/pastweather/{date}/{city_name}
		   
		      date -> Please prvoide date in YYYYMMDD format eg. 20110901 for 1st october 2011
		      city_name -> while providing city name if there is a space please replace it with "_" eg. san_jose for san jose.
		 
		=> http://weatherdata-171403.appspot.com/rest/pastweather/20110901/san_jose
	 
	 
<<<< PLEASE FOLLOW INSTRUCTIONS GIVEN BELOW TO INSTALL LOCALLY >>>>
   
** INSTALLATION **
	Required sofware/tools
	   a. Eclipse [I used neon]
	   b. Sprint Too Suite [installed STS plugin in Eclipse]
	   c. jdk1.8 
	   d. git client
	   
	   
	Steps
	   a clone repository https://github.com/PbhavinP/PastWeatherData using git clone.
	   b. Open Eclipse and import this project.
	   c. right click on project and select Maven -> Add dependency[to resolve dependency issue]
	   
	   
** USAGE  **
    Modify src\main\resources\application.properties file to change configuration.
		1. By default port is 8082 but please change value of server.port in case of user need to use diff port. [On GCP I have changed it to 8080]. 
   
	   
    Once above configuration is done, please right click on project root folder , select run as -> sprint boot app and access application with following url.
	
	http://localhost:8082/rest/PastWeather/{date}/{cityname}
	
	
    I have added swagger also user can access swagger ui as well with this url.
	
	http://localhost:8082/swagger-ui.html [where api for microservice is search-on-git-controller]