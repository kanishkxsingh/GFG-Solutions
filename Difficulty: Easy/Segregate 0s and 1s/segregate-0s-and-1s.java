class Solution {
    public void segregate0and1(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i!=j)
        {
            while(i!=j && arr[i]==0)
            {
                i++;
            }
            
            while(i!=j && arr[j]==1)
            {
                j--;
            }
            
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}