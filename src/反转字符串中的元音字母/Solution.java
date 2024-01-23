package 反转字符串中的元音字母;

public class Solution {
    public String reverseVowels(String s) {
        int len=s.length();
        int left=0,right=len-1;
        char[] arr=s.toCharArray();

        while(left<right){
            while(left<len&&!isVowel(s.charAt(left)))
                left++;
            while(right>=0&&!isVowel(s.charAt(right)))
                right--;
            if(left<right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)>=0;
    }

    private void swap(char[] arr,int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="leEcOdE";
        System.out.println(sol.reverseVowels(s));
    }
}
