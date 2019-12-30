# SpringBoot
SpringBoot Test Application

***

**Build and run** 

`mvn install && java -jar target\gs-spring-boot-0.1.0.jar`


**Test** 

[http://localhost:8080/hello](http://localhost:8080/hello)

[http://localhost:8080/hi](http://localhost:8080/hi)


**Web service**

`curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws`

_Response_

```xml
<?xml version="1.0"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
  <SOAP-ENV:Header/>
  <SOAP-ENV:Body>
    <ns2:getCountryResponse xmlns:ns2="http://spring.io/guides/gs-producing-web-service">
      <ns2:country>
        <ns2:name>Spain</ns2:name>
        <ns2:population>46704314</ns2:population>
        <ns2:capital>Madrid</ns2:capital>
        <ns2:currency>EUR</ns2:currency>
      </ns2:country>
    </ns2:getCountryResponse>
  </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```