package 汉诺塔;

import java.util.List;

public class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C){
        movePlates(A.size(),A,B,C);
    }

    private void movePlates(int size, List<Integer> A, List<Integer> B, List<Integer> C) {
        if(size==1){
            C.add(A.remove(A.size()-1));
            return;
        }
        movePlates(size-1,A,C,B);
        C.add(A.remove(A.size()-1));
        movePlates(size-1,B,A,C);
    }
}
