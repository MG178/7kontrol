package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> List1 = List.of(1, 2, 3, 4, 5,52,57,33);
        List<Integer> List2 = List.of(4, 5, 6, 7, 8, 11, 57,12,33);

        List<Integer> result = odinakovieElementi(List1, List2);
        System.out.println(result);
    }
public static List<Integer> odinakovieElementi( List<Integer> List1, List<Integer> List2){
        HashSet<Integer> set = new HashSet<>(List1);
    List<Integer> odinakovieElementi = new ArrayList<>();

    for (Integer num : List2){
        if (set.contains(num)){
            odinakovieElementi.add(num);

        }
    }
    return odinakovieElementi;

}
}
