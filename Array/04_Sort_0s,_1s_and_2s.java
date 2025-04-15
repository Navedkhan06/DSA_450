class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int count0s = 0 , count1s = 0, count2s = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] == 0) count0s++;
            
            if(arr[i] == 1) count1s++;
            
            if(arr[i] == 2) count2s++;
        }
        
        int index = 0;
        
        while(count0s--> 0) arr[index++] = 0;
            
        
        while(count1s--> 0) arr[index++] = 1;
        
        
        while(count2s--> 0) arr[index++] = 2;
            
    }