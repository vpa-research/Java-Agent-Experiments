package com.huawei;

public  class MyConverter {


     private MyConverter reverse;

    public MyConverter reverse() {
        MyConverter result = reverse;
        return (result == null) ? reverse = new ReverseMyConverter() : result;
    }

    private class ReverseMyConverter extends MyConverter {

    }
}
