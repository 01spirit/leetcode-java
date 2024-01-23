package 最频繁偶数;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> count=new HashMap<Integer,Integer>();
        for(int x:nums){
            if(x%2==0){
                count.put(x, count.getOrDefault(x,0)+1);//map.getOrDefault(Object key, V defaultValue)就是当Map集合中存在这个key，就使用这个key对应的value值，不存在就会使用后面的默认值defaultValue
            }
        }
        int res=-1;
        int ct=0;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            if(res==-1||entry.getValue()>ct||entry.getValue()==ct&&entry.getKey()<res){
                res=entry.getKey();
                ct=entry.getValue();
            }
        }
        return res;
    }
   /* Map的entrySet()方法返回一个实现Map.Entry接口的对象集合。集合中每个对象都是底层Map中一个特定的键/值对。通过这个集合的迭代器，获得每一个条目(唯一获取方式)的键或值并对值进行更改。Map.Entry中的常用方法如下所示：

            (1) Object getKey(): 返回条目的关键字
　　(2) Object getValue(): 返回条目的值
　　(3) Object setValue(Object value): 将相关映像中的值改为value，并且返回旧值*/

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={29,47,21,41,13,37,25,7};
        System.out.println(sol.mostFrequentEven(nums));
    }
}
