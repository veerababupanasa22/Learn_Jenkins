package com.project;

public class Prog_01 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        int count2 = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 't') {
                count2++;
            }
        }
        System.out.println("Frequency of t is: "+count2);
    }
}
