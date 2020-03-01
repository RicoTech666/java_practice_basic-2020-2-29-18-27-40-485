package main.java;

import main.java.interfaces.ProcessInteger;
import main.java.interfaces.ProcessString;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void printStrWithStar1(String str, ProcessString processString) {
        processString.printStr(str);
    }

    public static void printStrWithStar2(String str, Consumer<String> con) {
        con.accept(str);
    }

    private static void square1(int num, ProcessInteger processInteger) {
        System.out.println(processInteger.square(num));
    }

    private static void square2(Integer input, Function<Integer, Integer> fun) {
        System.out.println(fun.apply(input));
    }

    public static void main(String[] args) {
        String str = "helloJava";
        printStrWithStar1(str, string -> System.out.println("*" + string + "*"));
        printStrWithStar2(str, string -> System.out.println("*" + string + "*"));

        Integer num = 2;
        square1(num,num1 -> num1*num1);
        square2(num,number->number*number);
    }
}
