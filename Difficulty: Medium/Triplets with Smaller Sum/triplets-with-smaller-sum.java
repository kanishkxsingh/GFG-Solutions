class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr); //to satify (i<j<k)
        int counter=0; //to count totall such triplets
        
        for(int i=0;i<arr.length-2;i++)
        {
            int j=i+1;
            int k=arr.length-1;
            
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]<sum)
                {
                    counter=counter+(k-j); //since array sorted 
                    j++;
                }
                else
                {
                    k--; //even if sum=target, we still wanna count for sum<target
                }
            }
        }
        
        return counter;
    }
}