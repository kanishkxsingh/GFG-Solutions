class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]>=arr[i])
            {
                
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}