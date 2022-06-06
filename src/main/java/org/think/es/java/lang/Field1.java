package org.think.es.java.lang;

public class Field1 extends Field0{
    private int    v1;
    private String v2;

    public Field1() {
    }

    public Field1(int v1, String v2) {
        super(v1, v2);
        this.v1 = v1;
    }

    @Override
    public int getV1() {
        return v1;
    }

    @Override
    public String getV2() {
        return "v2: " + v2;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }
}
