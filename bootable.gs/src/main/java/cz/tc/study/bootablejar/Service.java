package cz.tc.study.bootablejar;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/")
public class Service {
   	@GET
	@Path("hello/{name}")
	public String hello(@PathParam("name") final String name) {
		return "Hello " +name;
	}
}
