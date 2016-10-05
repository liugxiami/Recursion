package com.ccsi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeVowels("I lived in chicago."));
    }
    //removing vowels from a string
    public static String removeVowels(String str){
        if(str==null||str.length()==0)return null;
        StringBuilder result=new StringBuilder();
        core(str,result);
        return result.toString();
    }
    public static void core(String str,StringBuilder res){
        if(str==null||str.length()==0)return;
        if(!"AEIOUaeiou ".contains(String.valueOf(str.charAt(0))))res.append(str.charAt(0));
        core(str.substring(1),res);
    }
    //counting occurrences of a character in a string
    public static int numOccur(char c,String str){
        if(str==null||str.length()==0)return 0;
        else{
            if(c==str.charAt(0))return 1+numOccur(c,str.substring(1));
            else return numOccur(c,str.substring(1));
        }
    }
    //processing a string recursively: a string is either empty("") or a single character, followed by a string.
    public static void printVertical(String str){
        if(str==null||str.length()==0)return;
        System.out.println(str.charAt(0));   //first char
        printVertical(str.substring(1));     //rest of string
    }
    //raising a number to a power
    public static int power1(int x,int n){
        if(n<0)throw new IllegalArgumentException("n must be >=0");
        if(n==0)return 1;
        return x*power1(x,n-1);
    }
    public  static int power2(int x,int n){
        if(n<0)throw new IllegalArgumentException("n must be >=0");
        if(n==0)return 1;
        else{
            int powerOfHalfN=power2(x,n/2);
            if(n%2==0)return powerOfHalfN*powerOfHalfN;
            else return x*powerOfHalfN*powerOfHalfN;
        }
    }
    //loop sum from 1 to n
    public static int sum(int n){
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    //recursion
    public static int sum1(int n){
        if(n==1)return 1;
        else{
            return n+sum1(n-1);
        }
    }
    //loop
    public static void print1(Scanner input){
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
    }
    //recursion
    public static void print(Scanner input){
        if(!input.hasNextLine())return;
        else{
            String line=input.nextLine();
            print(input);
            System.out.println(line);
        }
    }
    //loop
    public static void printSeries(int n1,int n2){
        if(n1<n2){
            for (int i = n1; i <= n2 ; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = n2; i <=n1 ; i++) {
                System.out.println(i);
            }
        }
    }
    //recursion
    public static void printSeries1(int n1,int n2){
        if(n1==n2) System.out.println(n2);   //base case: the base case stops the recursion
        else{                                //recursive case: reduces the overall problem to one
            if(n1<n2){
                System.out.println(n1);
                printSeries(n1+1,n2);
            }else{
                System.out.println(n2);
                printSeries(n1,n2+1);
            }
        }
    }
}


