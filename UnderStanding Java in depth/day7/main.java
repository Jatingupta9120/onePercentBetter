import java.util.*;

public class main {
    public static List<List<Integer>> triplets(int arr[], int n) {
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> tripletsTwo(int arr[],int n){
       Set<List<Integer>>ans=new HashSet<>();
       for(int i=0;i<n;i++){
        Set<Integer>hashSet=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int third=-(arr[i]+arr[j])//3rd element

            if(hashSet.contains(third)){
                List<List<Integer>>temp=ArrayList<>(arr[i],arr[j],arr[k]);
                temp.sort(null);
                hashSet.add(temp);
            }
            hashSet.add(arr[j]);
        }
       }

    }
    public static void main(String args[]) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        // List<List<Integer>> ans = triplets(arr, n);
        List<List<Integer>> ans = tripletsTwo(arr, n);
        
        for (List<Integer> a : ans) {
            System.out.print("[");
            for (Integer i : a) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
