package org.think.es.java.lang;

public class FieldTests {
    public static void main(String[] args) {
        Field0 field0 = new Field0(10,"field0");

        System.out.println(field0.getV1());
        System.out.println(field0.getV2());

        Field1 field1 = new Field1();
        field1.setV1(1);
        field1.setV2("field1");

        System.out.println(field1.getV1());
        System.out.println(field1.getV2());
        System.out.println(field0.getV1());
        System.out.println(field0.getV2());

        Field0 field01 = new Field1(2, "field2");

        System.out.println(field01.getV1());
        System.out.println(field01.getV2());

    }
}
