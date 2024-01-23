package 平方和三元组数目;

public class Solution {
    public int countTriples(int n) {

        int left=1;
        int count=0;
        for(int i=left;i<n;i++){
            for(int j=1;j<n;j++){
                for(int c=2;c<=n;c++){
                    if(c*c==(i*i+j*j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=100;
        System.out.println(sol.countTriples(n));
    }
}
