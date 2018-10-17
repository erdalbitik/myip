package com.ebitik.ws.myip;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@javax.jws.WebService(serviceName = "MyIPServiceService", portName = "MyIpPort",
targetNamespace = "http://myip.ws.ebitik.com/",
endpointInterface = "com.ebitik.ws.myip.MyIp")
public class MyIpImpl implements MyIp {

	@Resource
	WebServiceContext wsContext;

	@Override
	public String sayMyIp() {
		MessageContext mc = wsContext.getMessageContext();
	    HttpServletRequest req = (HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST);
	    String clientIp = getClientIp(req);
		return "Your IP is: " + clientIp;
	}
	
	private String getClientIp(HttpServletRequest request) {
        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }

}