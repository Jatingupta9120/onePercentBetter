/*
 Length of fibonacci series means previous two sum
 x1,x2,x3,x4,x5 means x5 is the sum of x3+x4
 x4=>x3+x2 like this 
 in this we can have to know that one rule is that the previous two sum is the thri
 */

 import java.util.HashMap;
 import java.util.HashSet;
 
 class Solution {
     public int lenLongestFibSubseq(int[] arr) {
         int n=arr.length;
         HashSet<Integer>hs=new HashSet<>();
         for(int i:arr)
         {
             hs.add(i);
         }
         HashMap<String, Integer> lengths = new HashMap<>();         
         int maxLen=0;
         for(int j=1;j<n;j++){
             for(int k=j+1;k<n;k++){
                 int a=arr[k];
                 int b=arr[j];
                 int target=b-a;
                 if(hs.contains(target)){
                     String key=target + "," + a;
                     int newLength = lengths.getOrDefault(key, 2) + 1;
                     lengths.put(a + "," + b, newLength);
                     maxLen = Math.max(maxLen, newLength);
                 }
             }
         }
         return maxLen>=3?maxLen:0;
     }
 }