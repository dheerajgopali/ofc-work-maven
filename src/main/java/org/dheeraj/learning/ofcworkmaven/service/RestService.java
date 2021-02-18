package org.dheeraj.learning.ofcworkmaven.service;

import org.dheeraj.learning.ofcworkmaven.dto.ScenarioData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restservice")
public class RestService {
    @GET
    @Path("/scenariometrics")
    @Produces(MediaType.APPLICATION_JSON)
    public ScenarioData getScenarioMetrics() {
        return new ScenarioData();
    }
}
