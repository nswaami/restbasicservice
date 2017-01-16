package com.ns.restbasic;


/**
 * @author Narayann Swaami
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/fahrenheit")
		public class Fahrenheit {
	@GET
	@Produces("application/xml")
	public String convertStandardToF(){
		Double fahrenheit;
		Double celsius = 37.0d;
		fahrenheit = (celsius*9/5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<fahrenheit>" + "<celsius>" + celsius + "</celsius>" + "<output>" + result + "</output>" + "</fahrenheit>";
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertWithParamToF(@PathParam ("c") Double c){
		
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = (celsius*9/5) + 32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<fahrenheit>" + "<celsius>" + celsius + "</celsius>" + "<output>" + result + "</output>" + "</fahrenheit>";
		
	}
	
	
}