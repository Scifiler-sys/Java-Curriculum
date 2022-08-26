# We are grabbing the necesarry dependencies to even start our application
# Essentially we are getting JRE 8 and Tomcat
from tomcat:8.0-jre8

# We are copying the .war file to a specified folder that we obtained when we used the from instructions
copy target/Servlets.war /usr/local/tomcat/webapps

# We are exposing port 8080 that this application will utilize
expose 8080

# CMD instruction would run a CLI command on the terminal of this app
# We are telling it how we can start this application
# In this case, utilize a catalina.sh file we got from tomcat:8.0-jre8
CMD ["catalina.sh", "run"]