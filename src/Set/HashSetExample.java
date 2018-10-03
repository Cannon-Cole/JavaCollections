/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Cole
 */
public class HashSetExample {

    public HashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Cole");
        hashSet.add("Robbie");
        hashSet.add("Erin");
        hashSet.add("Sam");

        System.out.println("The HashSet has been loaded with " + hashSet);

        System.out.println();

        System.out.println("Iterates through list");

        Iterator<String> iterate = hashSet.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        System.out.println();

        System.out.println("Checks if it has Cole");
        System.out.println(hashSet.contains("Cole"));

        System.out.println();

        System.out.println("Checks if it has Adam");
        System.out.println(hashSet.contains("Adam"));
        
        System.out.println();

        System.out.println("HashSet has been cleared");
        hashSet.clear();
        System.out.println("It now contains the following " + hashSet);
    }

}
