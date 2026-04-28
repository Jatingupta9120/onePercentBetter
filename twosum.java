import java.util.*;
public class Main
{
    public static boolean twoSum(int a[], int t)
    {
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] + a[j] == t){
                    return true;
                }
            }
        }
        return false;
    }
    //TC->O(n2)
    //SC=>O(1)
    
    public static boolean twoSumApproach2(int a[],int t){
        Arrays.sort(a);//nlogn
        for(int i=0;i<a.length;i++){//n^2
            for(int j=a.length-1;j>0;j--){
                int tsum=a[i]+a[j];
                if(tsum==t)return true;
            }
        }
        return false;
    }
    //TC->O(N^2)+O(nlogn)=O(n^2)
    //SC->O(1)
    
    public static boolean twoSumApproach3(int a[],int t){
        HashSet<Integer>hs=new HashSet<>();
        for(int i:a){//O(n)
            int complement=t-i;
            if(hs.contains(complement)){//O(1)
                return true;
            }
            hs.add(i);//O(1)
        }
        return false;
    }
    
    //TC->O(1)*O(1)*O(n)=O(n)
    //SC->O(n)
    
    public static void threeSum()
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 26;

        System.out.println(twoSumApproach3(arr, target)); // true
    }
}
