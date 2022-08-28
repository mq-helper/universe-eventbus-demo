package org.mqhelper.eventbus.subscriber.listener;

import org.mqhelper.event.ByeEvent;
import org.mqhelper.event.HelloEvent;
import org.mqhelper.eventbus.UniverseSubscriber;
import org.springframework.stereotype.Component;

/**
 * @author SongyangJi
 * @date 2022/08/28
 */

@Component
public class HelloEventListener {

    @UniverseSubscriber
    public void on(HelloEvent event) {
        System.out.println("process HelloEvent" + event);
    }

    @UniverseSubscriber
    public void on(ByeEvent byeEvent) {
        System.out.println("Goodbye!!!");
    }

}
