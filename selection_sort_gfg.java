class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
}
