package org.amitchavan.reactive;

import java.io.IOException;

public class FluxToMonoToFlux {



    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().count().subscribe(e->System.out.print(e));

        // Collect all items of intNumbersFlux into a single list and print it
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().collectList().subscribe(e->System.out.print(e));

        // Transform to a sequence of sums of adjacent two numbers
        // TODO: Write code
        (ReactiveSources.intNumbersFlux().buffer(2)).
                    map(list->list.get(0)+list.get(1)).subscribe(e->System.out.print(e));


        System.out.println("Press a key to end");
        System.in.read();
    }

}
