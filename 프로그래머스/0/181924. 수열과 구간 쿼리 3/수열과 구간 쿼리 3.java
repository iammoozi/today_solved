class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for( int[] query : queries){
            swap(arr,query);
        }
        return arr;
        
    }
    public void swap(int[] arr, int[] query){
        int first = query[0];
        int second = query[1];
        
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    
}