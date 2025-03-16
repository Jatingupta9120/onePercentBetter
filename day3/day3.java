public class Day3
{
    public static void printleftRightDiagonal(int arr[][]){
        int n=arr.length;
         System.out.print("Left Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
         System.out.print("Right Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
    public static void printZigZag(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 &&j==1){
                    arr[i][j]=8;
                }else if(i==2&&j==1){
                    arr[i][j]=2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void zigZagTraversal(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void printTransPose(int arr[][]){
		// your code goes here
	int n=3;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(arr[j][i]+" ");
		}
	     System.out.println();
	}
    }

	public static void main(String[] args) {
		System.out.println("Hello World");
		 int arr[][]={{1, 2, 3}, 
                     {4, 5, 6}, 
                     {7, 8, 9}};
// 		printTransPose(arr);
// zigZagTraversal(arr);
// printZigZag(arr);
printleftRightDiagonal(arr);
}
}