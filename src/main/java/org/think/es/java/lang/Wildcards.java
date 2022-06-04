package org.think.es.java.lang;

import java.util.Arrays;
import java.util.List;

/**
 * PECS: producer extends consumer super
 */
public class Wildcards {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3); // Integer extends Number
        print0(list);
        print1(list); // error
        print2(list);
    }

    public static void print0(List<? extends Number> list) {
        list.add(11); // error
        Number number = list.get(0);
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    public static void print1(List<? super Number> list) {
        list.add(4);
        Object o = list.get(0);
        if (o instanceof  Number) {
            Number number = (Number) o;
        }
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    public static void print2(List<?> list) {
        list.add(0); // error
        Object o = list.get(0);
        for (Object element: list) {
            System.out.print(element + " ");
        }
    }
}
