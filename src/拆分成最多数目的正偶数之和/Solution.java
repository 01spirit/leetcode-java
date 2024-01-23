package 拆分成最多数目的正偶数之和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res=new ArrayList<>();
        long cnt=2;
        if(finalSum%2!=0){
            return res;
        }
        while(true){
            if(finalSum-cnt>=0){
                res.add(cnt);
                finalSum-=cnt;
                cnt+=2;
            }
            else{
//                 res.set(res.size()-1, res.get(res.size()-1)+finalSum );
                res.remove(res.size()-1);
                res.add(finalSum+cnt-2);
                return res;
            }

        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        long finalSum= 28;
        System.out.println(sol.maximumEvenSplit(finalSum));
    }
}
