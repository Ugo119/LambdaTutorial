package com.ugo.java.lambdatutorial.main;

import com.ugo.java.lambdatutorial.interfaces.MyParamValue;
import com.ugo.java.lambdatutorial.interfaces.MyValue;
import com.ugo.java.lambdatutorial.interfaces.NumericTest;

public class Main {
    public static void main(String[] args) {
        MyValue myValue;
        MyParamValue myParamValue;
        NumericTest numericTest;
        myValue = ()-> (25/2);
        myParamValue = (n) ->(1.0/n);
        numericTest = (m,n) ->(m > n ? true:false);

        System.out.println("The value for myValue is: " + myValue.getValue());
        System.out.println("The reciprocal of myParamValue is: "
                + myParamValue.getValue(4.0));
        System.out.println(String.format("%d is bigger that %d",17,32)+
                ": "+ numericTest.test(17, 32));

        

    }
}
