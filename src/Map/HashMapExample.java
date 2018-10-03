/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;

/**
 *
 * @author Cole
 */
public class HashMapExample {

    public HashMapExample() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("My", 1);
        hashMap.put("Name", 2);
        hashMap.put("Is", 3);
        hashMap.put("Cole", 4);

        System.out.println("Hash map filled with the following: " + hashMap);

        System.out.println();
        System.out.println("My = " + hashMap.get("My"));
        System.out.println("Name = " + hashMap.get("Name"));
        System.out.println("Is = " + hashMap.get("Is"));
        System.out.println("Cole = " + hashMap.get("Cole"));

        System.out.println();

        System.out.println("The size of this HashMap is " + hashMap.size());

        hashMap.clear();

        System.out.println();

        System.out.println("The HashMap has been cleared");

        System.out.println(hashMap);
    }

}
