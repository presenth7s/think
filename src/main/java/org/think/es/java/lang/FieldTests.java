package org.think.es.java.lang;

/**
 * // class version 52.0 (52)
 * // access flags 0x21
 * public class org/think/es/java/lang/FieldTests {
 *
 *   // compiled from: FieldTests.java
 *
 *   // access flags 0x1
 *   public <init>()V
 *    L0
 *     LINENUMBER 3 L0
 *     ALOAD 0
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     RETURN
 *    L1
 *     LOCALVARIABLE this Lorg/think/es/java/lang/FieldTests; L0 L1 0
 *     MAXSTACK = 1
 *     MAXLOCALS = 1
 *
 *   // access flags 0x9
 *   public static main([Ljava/lang/String;)V
 *    L0
 *     LINENUMBER 19 L0
 *     NEW org/think/es/java/lang/Field1
 *     DUP
 *     ICONST_2
 *     LDC "field2"
 *     INVOKESPECIAL org/think/es/java/lang/Field1.<init> (ILjava/lang/String;)V
 *     ASTORE 1
 *    L1
 *     LINENUMBER 21 L1
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 1
 *     INVOKEVIRTUAL org/think/es/java/lang/Field0.getV1 ()I
 *     INVOKEVIRTUAL java/io/PrintStream.println (I)V
 *    L2
 *     LINENUMBER 22 L2
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 1
 *     INVOKEVIRTUAL org/think/es/java/lang/Field0.getV2 ()Ljava/lang/String;
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L3
 *     LINENUMBER 24 L3
 *     RETURN
 *    L4
 *     LOCALVARIABLE args [Ljava/lang/String; L0 L4 0
 *     LOCALVARIABLE field01 Lorg/think/es/java/lang/Field0; L1 L4 1
 *     MAXSTACK = 4
 *     MAXLOCALS = 2
 * }
 */
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
