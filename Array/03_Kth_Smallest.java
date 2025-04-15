class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
       if(arr.length == 0) return 0;
       
       if(arr.length == 1) return arr[0];
       
       for(int i = 0 ; i < arr.length - 1 ; i++){
           for(int j = i + 1 ; j < arr.length ; j++){
               if(arr[i] > arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
       
       
       // 3 4 7 10 15 20
       return arr[k-1];
    }
}