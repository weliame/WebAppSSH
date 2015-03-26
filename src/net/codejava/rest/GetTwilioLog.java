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
import com.twilio.sdk.resource.instance.Message;
import com.twilio.sdk.resource.list.MessageList;

@Path("/twiliolog")
public class GetTwilioLog extends ActionSupport {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {

		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n"
						+ fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>"
				+ "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}

	@Path("{number}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("number") Integer number) {

		String ACCOUNT_SID = "AC57ae88a42981c6857a952e1e64a6c037";
		String AUTH_TOKEN = "8cd588369169b418ae09b3e2931cfc8b";

		TwilioRestClient client = new TwilioRestClient(	ACCOUNT_SID,
														AUTH_TOKEN);

		Map<String, String> params = new HashMap<>();

		MessageList messages = client.getAccount().getMessages(params);
		for (Message message : messages) {
			System.out.println(message.getFrom());
			System.out.println(message.getTo());
			System.out.println(message.getBody());
			System.out.println(message.getSid());
			System.out.println(message.getDateSent().toString());
			System.out.println(message.getDateUpdated().toString());
		}
		return "<GetTwilio>" + "<number>" + number + "</number>"
				+ "<body>" + messages.getPageData().get(0).getBody() + "</body>" + "</GetTwilio>";
	}
}