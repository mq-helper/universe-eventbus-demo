package org.mqhelper.eventbus.publisher;

import java.util.Random;

import org.mqhelper.event.ByeEvent;
import org.mqhelper.event.HelloEvent;
import org.mqhelper.eventbus.UniverseEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author SongyangJi
 * @date 2022/08/29
 */

@Component
public class PublishEventsRunner implements ApplicationRunner {

    @Autowired
    UniverseEventPublisher universeEventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Random random = new Random();
        for (int i = 0; ; i++) {
            HelloEvent helloEvent = new HelloEvent("hello-" + i);
            ByeEvent byeEvent = new ByeEvent();
            universeEventPublisher.publish(helloEvent);
            universeEventPublisher.publish(byeEvent);
            Thread.sleep(random.nextInt(1000) + 500);
        }
    }
}
