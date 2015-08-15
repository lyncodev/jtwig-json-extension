package org.jtwig.json;

import org.jtwig.environment.EnvironmentConfigurationBuilder;
import org.jtwig.extension.Extension;
import org.jtwig.json.configuration.JsonMapperProviderConfiguration;
import org.jtwig.json.function.JsonMapperFunction;

import java.util.Collections;

public class JsonExtension implements Extension {
    private final JsonMapperProviderConfiguration configuration;

    public JsonExtension(JsonMapperProviderConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void configure(EnvironmentConfigurationBuilder environmentConfigurationBuilder) {
        configuration.configure(environmentConfigurationBuilder);
        environmentConfigurationBuilder.functions().withBeans(Collections.<Object>singletonList(new JsonMapperFunction()));
    }
}
