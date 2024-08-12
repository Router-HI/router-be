package org.router.apimodule.global.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        ignoreResourceNotFound = true,
        value = {
                "classpath:application-domain.yml",
                "classpath:application-infra.yml",
                "classpath:application-common.yml",
                "classpath:application.yml"
        },
        factory = YamlPropertySourceFactory.class
)
public class PropertyConfig {
}
