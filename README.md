# Say My IP

Sample Spring Boot and CXF SOAP webservice application which returns client IP address as a SOAP message.

# Usage 
```
mvn spring-boot:run
```
## WSDL Address
```
http://localhost:8090/Services/MyIp?wsdl
```
  
## Sample Request & Response

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:myip="http://myip.ws.ebitik.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <myip:sayMyIp/>
   </soapenv:Body>
</soapenv:Envelope>
```
```
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:sayMyIpResponse xmlns:ns2="http://myip.ws.ebitik.com/">
         <return>Your IP is: 46.1.1.92</return>
      </ns2:sayMyIpResponse>
   </soap:Body>
</soap:Envelope>
```
