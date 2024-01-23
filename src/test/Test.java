package test;

import jdk.jfr.Unsigned;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*String SHA_1="2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        char[] charsOfSha_1=SHA_1.toCharArray();
        byte[] bits=SHA_1.getBytes();
        System.out.println("SHA_1.length(): "+SHA_1.length());
        System.out.println("bits: "+ Arrays.toString(bits));
        System.out.println("bits length: "+bits.length);*/

        /*Long num= 5224372026852772806L;
        System.out.println(Long.toBinaryString(num));   //100100010000000101100101010110110110011000011000000101111000110
        String numToBinary="100100010000000101100101010110110110011000011000000101111000110";
        System.out.println(numToBinary.length());*/

        /*int[] splitNums={72,128,178,173,179,12,11,198};
        String splitStr="";
        for(int n:splitNums){
            splitStr += Integer.toBinaryString(n);
            splitStr += " ";
        }
        System.out.println(splitStr);*/
/*

        String bs=Integer.toBinaryString(4751538);
        System.out.println(bs);
        Long num= 5224372026852772806L;
        for(int j=7;j>=0;j--){
            Long n = num >> j * 8;
            System.out.println(n);
        }
        System.out.println("num: "+num);

        String shaHex="c6e7d00fedc0ca6f41e7c96ca5ed6221486f947b";
        System.out.println("shaHex.length(): "+shaHex.length());
*/

//        long num=0x5a827999;
//        System.out.println(Long.toOctalString(num));

        /*Long num=97L;
        System.out.println(Long.toBinaryString(num));
        Long num1=1627389952L;
        System.out.println(Long.toBinaryString(num1));
        Long num2=6422528L;
        System.out.println(Long.toBinaryString(num2));
        Long num3=25344L;
        System.out.println(Long.toBinaryString(num3));
        Long num4=100L;
        System.out.println(Long.toBinaryString(num4));*/


        /*for(int i=16;i<80;i++){
            System.out.println("i&15 = "+(i&15));
            System.out.println("(i+13)&15 = "+((i+13)&15));
        }*/

        String s1="2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        String s2="2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        System.out.println(s1.equals(s2));

    }
}
