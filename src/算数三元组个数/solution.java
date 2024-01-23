package 算数三元组个数;

public class solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int len=nums.length;
        int sum_pri=0;//计算前两个
        int sum_aft=0;//计算后两个数字

        for(int i=0;i<len-2;i++){//i<j<k
            for(int j=i+1;j<len-1;j++){
                sum_pri=nums[j]-nums[i];//计算前两个数

                if(diff==sum_pri){//和diff比较，若相等，保留当前两数字，向后寻找第三个
                    for(int k=j+1;k<len;k++){
                        sum_aft=nums[k]-nums[j];//计算后两个数
                        if(diff==sum_aft){
                            count++;//若也等于diff，计数加一

                        }
                        sum_aft=0;//未找到符合的第三个数，重置后两数比较结果，寻找下一个k
                    }
                }
                sum_pri=0;//未找到合适的k或j，重置前两数比较结果
            }
        }
        return count;
    }


    public static void main(String[] args){
        int[] nums={4,5,6,7,8,9};
        int diff=2;
        solution sol=new solution();

        System.out.print(sol.arithmeticTriplets(nums, diff));
    }
}
