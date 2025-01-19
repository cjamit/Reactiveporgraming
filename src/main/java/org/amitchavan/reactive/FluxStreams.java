package org.amitchavan.reactive;

import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class FluxStreams {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(emp->System.out.println(emp),
                error->System.out.println(error),
                ()->System.out.println("complete"));

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

    class MySubscriber<T> extends BaseSubscriber<T>
    {


    }

}