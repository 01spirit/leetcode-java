package 多数元素;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        int res=0;

        if(nums.length==1){
            return nums[0];
        }

        Arrays.sort(nums);
        //一次遍历找到出现次数最多的
        /*int cnt=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                cnt=1;
            }
            else{
                cnt++;
                if(cnt>max){
                    max=cnt;
                    res=nums[i];
                }
            }
        }*/

        //使用数学思路，无论数组长度是奇数还是偶数，第 n/2 个元素都必定是这个多数元素
        //时间和内存占用稍优于前者，但是可能是因为排序方法调用影响了效率
        /*
        * res=nums[nums.length/2];
        * */

        //摩尔投票法
        //时间最优，内存占用大（感觉内存上没太大区别）
        //初始设定备选结果数字和其出现次数，一次遍历，遇到相同的数字则 count+1 ，遇到不同的则 count-1 ，当 count=0 时说明当前备选数字还不是正确结果
        //根据多数元素的定义，他的出现次数大于数组长度的一半，所以一次遍历后不同数字相互抵销，剩余的数字必定都是多数元素，此时的备选数字就是结果
        int candidateNum=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == candidateNum){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    candidateNum=nums[i];
                    count=1;
                }
            }
        }
        res=candidateNum;

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={
//            2,2,1,1,1,2,2 ,1,1,1
            3,2,3
//            0
        };
        System.out.println(sol.majorityElement(nums));
    }
}
