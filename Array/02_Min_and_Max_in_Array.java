class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int n = arr.length;
        Arrays.sort(arr);
        Integer min = arr[0];
        Integer max = arr[n-1];
        
        return new Pair(min, max);
    }
}