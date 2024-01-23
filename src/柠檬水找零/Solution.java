package 柠檬水找零;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        if(bills[0]!=5){
            return false;
        }
        five=1;
        for(int i=1;i<bills.length;i++){
            if(bills[i]==5){
                five+=1;
            }
            else if(bills[i]==10){
                if(five>0){
                    five-=1;
                    ten+=1;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten!=0&&five!=0){
                    ten-=1;
                    five-=1;
                }
                else if(ten==0&&five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
    return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] bills={5,5,10,10,20};
        System.out.println(sol.lemonadeChange(bills));
    }
}
