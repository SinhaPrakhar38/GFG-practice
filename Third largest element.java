class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int first = a[0];
        int second = -1;
        int third = -1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>first)
            {
                third = second;
                second = first;
                first = a[i];
            }
            else if(a[i]<first && a[i]>second)
            {
                 third = second;
                second = a[i];
            }
            else if(a[i]<first && a[i]<second && a[i]>third)
            {
                third = a[i];
            }
        }
        return third;
    }
}
