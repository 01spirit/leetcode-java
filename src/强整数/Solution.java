package 强整数;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> list=new HashSet<Integer>();//用set存储，去除重复元素

        int value1=1;

        for(int i=0;i<=21;i++){
            int value2=1;
            for(int j=0;j<=21;j++){
                int value=value1+value2;
                if(value<=bound){
                    list.add(value);
                }
                else{
                    break;
                }
                value2*=y;
            }
            if(value1>bound){
                break;
            }
            value1*=x;
        }

        return new ArrayList<>(list);//把set转化为list
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int x=3,y=5,bound=15;
        List<Integer> list=sol.powerfulIntegers(x,y,bound);

        for(int num:list){
            System.out.println(num);
        }
    }
}
