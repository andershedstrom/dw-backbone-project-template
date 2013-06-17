package org.ahedstrom;

import org.ahedstrom.resources.Resource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DwBackboneService extends Service<DwBackboneConfiguration> {

    @Override
    public void initialize(Bootstrap<DwBackboneConfiguration> bootstrap) {
        bootstrap.setName("Dropwizard-Backbone-Project-Template");
        bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
    }

    @Override
    public void run(DwBackboneConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new Resource());
    }

    public static void main(String[] args) throws Exception {
        new DwBackboneService().run(args);
    }
}
