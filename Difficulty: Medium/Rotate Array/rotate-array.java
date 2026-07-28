class Solution {
    public void rotateArr(int arr[], int d) {
        //step 0: handling edge cases
        if(arr.length==0)
        {
            return;
        }
        d = d % arr.length;      // handle d >= n
        if (d <= 0) return;     // no rotation needed
        
        //step 1: shift d elements to a temp list
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<d;i++)
        {
            l1.add(arr[i]);
        }
        
        //step 2: rotate array elements
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }
        
        //step3: shift temp list elements back to og array
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i]=l1.get(i-(arr.length-d));  //or could simply use j pointer in list
        }
        
    }
}