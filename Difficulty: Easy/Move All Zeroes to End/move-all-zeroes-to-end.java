class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0) //j is on same index as non 0 element so element swaps itself
            {
                int temp=arr[i];
                arr[i]=0;
                arr[j]=temp;
                j++;
            }
        }
    }
}