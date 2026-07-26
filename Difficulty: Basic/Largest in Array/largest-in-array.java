class Solution {
    public static int largest(int[] arr) {
        List<Integer> l1=new ArrayList<>();  // else jus use sorting algo
        for(int i=0;i<arr.length;i++)
        {
            l1.add(arr[i]);
        }
        Collections.sort(l1);
        return l1.get(l1.size()-1);
    }
}
