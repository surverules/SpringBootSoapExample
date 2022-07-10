# SpringBootSoapExample

Learing from Example:
In src/main/resource/request.xml
- Way to run Soap Services is:
  - Go to Resources folder 
  - curl --header "content-type: text/xml" -d @request.xml http://localhost:8090/ws

Learning
- @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest1")
  - NameSpaces is defined in the Soap request. I have changed at end to /ha
  - localpart - its mapped to method name of Soap request Body
 
- @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    - NameSpaces is defined in the Soap request. I have changed at end to /ha
    - localpart - its mapped to method name of Soap request Body

WSDL - localhost:8090/ws/countries.wsdl   - refer config bean name 


Note: We have both SOAP and REST end point running part of this project

