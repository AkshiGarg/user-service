package com.nagp.assignment.user;

import com.nagp.assignment.user.core.UserHandler;
import com.nagp.assignment.user.db.UserRepository;
import com.nagp.assignment.user.resources.UserResource;
import de.thomaskrille.dropwizard_template_config.TemplateConfigBundle;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class UserService extends Application<UserServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new UserService().run(args);
    }

    @Override
    public String getName() {
        return "User Service";
    }

    @Override
    public void initialize(final Bootstrap<UserServiceConfiguration> bootstrap) {
        bootstrap
                .addBundle(new MigrationsBundle<UserServiceConfiguration>() {
                    @Override
                    public DataSourceFactory getDataSourceFactory(
                            final UserServiceConfiguration configuration) {
                        return configuration.getDataSourceFactory();
                    }
                });
        bootstrap.addBundle(new TemplateConfigBundle());
    }

    @Override
    public void run(final UserServiceConfiguration configuration,
                    final Environment environment) {
        DBI dbi = new DBIFactory().build(environment, configuration.getDataSourceFactory() , "mysql");
        final UserRepository userRepository = dbi.onDemand(UserRepository.class);
        final UserHandler userHandler = new UserHandler(userRepository);
        final UserResource userResource = new UserResource(userHandler);
        environment.jersey().register(userResource);
    }

}
