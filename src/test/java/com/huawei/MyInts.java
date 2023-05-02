package com.huawei;

public final class MyInts {
    private MyInts() {}


    public static int saturatedCast(long value) {
        if (value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public MyConverter stringConverter() {
        return new MyIntConverter();
    }
}
