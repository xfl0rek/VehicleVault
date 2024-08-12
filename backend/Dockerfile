FROM tomcat:10.1-jdk21

COPY target/rest_application.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
