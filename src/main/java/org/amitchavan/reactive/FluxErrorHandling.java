package org.amitchavan.reactive;



import reactor.core.publisher.Flux;

import java.io.IOException;

public class FluxErrorHandling {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here
//        ReactiveSources.intNumbersFluxWithException().
//                subscribe(e->System.out.println(e),
//                        err->System.out.println("Error Happened"));


        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here
//        ReactiveSources.intNumbersFluxWithException().
//                doOnError(e->System.out.println("Error"+e.getMessage())).
//                subscribe(e->System.out.println(e));

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here

//        ReactiveSources.intNumbersFluxWithException()   .
//                onErrorContinue(e->System.out.println("Error"+e.getMessage())).
//                subscribe(e->System.out.println(e));

//        ReactiveSources.intNumbersFluxWithException().
//                onErrorResume(err -> Flux.just(-1,-2)).
//                subscribe(e->System.out.println(e));

        System.out.println("Press a key to end");
        System.in.read();
    }

}