package com.ebitik.ws.myip;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://myip.ws.ebitik.com/", name = "MyIp")
public interface MyIp {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayMyIp",
                    targetNamespace = "http://myip.ws.ebitik.com/",
                    className = "sample.ws.service.SayMyIp")
    @WebMethod(action = "urn:SayMyIp")
    @ResponseWrapper(localName = "sayMyIpResponse",
                     targetNamespace = "http://myip.ws.ebitik.com/",
                     className = "com.ebitik.ws.myip.SayMyIpResponse")
    String sayMyIp();
}