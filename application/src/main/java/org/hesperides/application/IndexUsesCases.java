package org.hesperides.application;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.config.EventHandlingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IndexUsesCases {

    private final EventHandlingConfiguration eventHandlingConfiguration;

    @Autowired
    public IndexUsesCases(EventHandlingConfiguration eventHandlingConfiguration) {
        this.eventHandlingConfiguration = eventHandlingConfiguration;
    }

    public void replay() {

    }

}
