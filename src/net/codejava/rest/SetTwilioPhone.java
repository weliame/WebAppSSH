/**
 * @Title: CtoFService.java
 * @Package net.codejava.rest Copyright: Copyright (c) 2011 Company:Everbridge.Inc
 * @author wyq
 * @date Mar 25, 2015 11:05:23 AM
 * @version V1.0
 * @Description: TODO
 */
package net.codejava.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.opensymphony.xwork2.ActionSupport;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.list.MessageList;

@Path("/settwilio")
public class SetTwilioPhone extends ActionSupport {
	
	@Path("{number}/{voiceUrl}/{msgUrl}")
	@GET
	@Produces("application/xml")
	public String setTwilio(@PathParam("number") Number number,@PathParam("voiceUrl") String voiceUrl,@PathParam("msgUrl") String msgUrl) {

		String ACCOUNT_SID = "AC57ae88a42981c6857a952e1e64a6c037";
		String AUTH_TOKEN = "8cd588369169b418ae09b3e2931cfc8b";

		TwilioRestClient client = new TwilioRestClient(	ACCOUNT_SID,
														AUTH_TOKEN);
		Map<String, String> params = new HashMap<>();
		MessageList messages = client.getAccount().getMessages(params);
		return "<GetTwilio>" + "<number>" + number + "</number>"
				+ "<body>" + messages.getPageData().get(0).getBody() + "</body>" + "</GetTwilio>";
	}
}