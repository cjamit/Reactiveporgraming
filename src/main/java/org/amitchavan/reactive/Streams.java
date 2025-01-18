package org.amitchavan.reactive;

public class Streams{

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(numbers->System.out.println(numbers));


        // TODO: Write code here

        // Print numbers from intNumbersStream that are less than 5
       StreamSources.intNumbersStream().filter(numbers->numbers<5).forEach(e->System.out.println(e));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(numbers->numbers<8)
                 .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
       Integer value=StreamSources.intNumbersStream().filter(numbers->numbers<5)
           .findFirst()
             .orElse(-1);
        System.out.println(value);






        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream()
                .filter(u->StreamSources
                        .intNumbersStream()
                        .anyMatch((i->i==u.getId())))
                .forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    }

}
