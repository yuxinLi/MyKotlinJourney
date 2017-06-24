package com.example.mykotlinjourney.kotlin.step.c4.inner;

public class InnerClassJava {
    private int a;

    public class Inner{
        public void hello(){
            System.out.println(InnerClassJava.this.a);
        }
    }

    public static void main(String... args) {
        InnerClassJava innerClassJava = new InnerClassJava();
        Inner inner = innerClassJava.new Inner();

    }
}
