package 和相等的子数组;

public class solution {
    public boolean findSubarrays(int[] nums){
        int len=nums.length;
        int s_len=0;
        int[] sums=new int[1000];
        for(int i=0;i<len-1;i++){

            sums[i]=nums[i]+nums[i+1];
//          System.out.println(sums[i]+"\n");
            s_len++;
            for(int j=0;j<s_len;j++){

                if(sums[i]==sums[j]&&i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums= {0,0,0};
        solution sl=new solution();
        System.out.println(sl.findSubarrays(nums));

    }
}
