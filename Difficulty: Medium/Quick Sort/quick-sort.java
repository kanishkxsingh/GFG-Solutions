class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int pivot=partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    private int partition(int[] arr, int low, int high) {
        
        int pos=low;
        for(int i=low;i<=high;i++)
        {
            if(arr[i]<=arr[high])
            {
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
        }
        return pos-1;
    }
}