class Solution {
    public int getSecondLargest(int[] arr) {
        List<Integer> l1=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            l1.add(arr[i]);
        }
        
        Collections.sort(l1);
        int SecondLargest= -1;
        
        for(int i=l1.size()-2;i>=0;i--)
        {
            if(l1.get(i)<l1.get(l1.size()-1))
            {
                SecondLargest=l1.get(i);
                break;
            }
        }
        
        return SecondLargest;
    }
}