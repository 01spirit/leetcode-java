package IO_test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] res=new int[100];
        Scanner in=new Scanner(System.in);
        int len= 0;

        while(in.hasNextInt()){
            int a=in.nextInt();
            int b=in.nextInt();
            if(a==0&&b==0)  break;
            res[len]=a+b;
            len++;
        }
        for(int i=0;i<len;i++){
            System.out.println(res[i]);
        }
    }
}
