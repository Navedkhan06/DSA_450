class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        int[] res = new int[n];
        
        int id = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(a[i] < 0){
                res[id++] = a[i]; // -3 , -2
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            if(a[i] >= 0){
                res[id++] = a[i];
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            a[i] = res[i];
        }
        
    }
}