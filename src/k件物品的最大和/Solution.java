package k件物品的最大和;

public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        }
        else{
            return numOnes-(k-numOnes-numZeros);
        }

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int numOnes = 3, numZeros = 2, numNegOnes = 0, k = 4;
        System.out.println(solution.kItemsWithMaximumSum(numOnes,numZeros,numNegOnes,k));

    }
}
