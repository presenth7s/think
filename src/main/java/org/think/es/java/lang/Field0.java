package org.think.es.java.lang;

public class Field0 {
    private int    v1;
    private String v2;

    static {
        System.out.println("field0 static");
    }

    public Field0() {
        System.out.println("Field0()");
    }

    {
        System.out.println("field0 {}");
    }


    public Field0(int v1, String v2) {
        System.out.println("Field0(v1, v2)");
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1() {
        return v1 << 2;
    }

    public String getV2() {
        return v2;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }
}
