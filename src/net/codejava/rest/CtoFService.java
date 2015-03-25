/**
 * @Title: CtoFService.java
 * @Package net.codejava.rest
 * Copyright: Copyright (c) 2011 
 * Company:Everbridge.Inc
 * 
 * @author wyq
 * @date Mar 25, 2015 11:05:23 AM
 * @version V1.0
 * @Description: TODO
 */
package net.codejava.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.opensymphony.xwork2.ActionSupport;
 
@Path("/ctofservice")
public class CtoFService extends ActionSupport{
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}