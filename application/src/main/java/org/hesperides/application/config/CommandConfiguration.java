package org.hesperides.application.config;

import org.axonframework.config.EventHandlingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConfiguration {

    @Autowired
    public void configureProcessors(EventHandlingConfiguration eventHandlingConfiguration) {
        eventHandlingConfiguration.registerTrackingProcessor("ModuleProcessor");
    }

}