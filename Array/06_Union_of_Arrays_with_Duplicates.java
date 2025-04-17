class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> arr = new HashSet<>();
        for(int n:a){
                arr.add(n);
        }
        for(int n:b){
                arr.add(n);
        }
        return arr.size();
    }
}