class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
         int counter = 1;
        Map<Integer,LinkedList<Integer>> hm = new HashMap<>();
        int i = 0;
        while(i<n){
           if(!hm.containsKey(end[i])){
              LinkedList<Integer> list = new LinkedList<Integer>();
               list.add(start[i]);
               hm.put(end[i],list);
           }
           else{
                LinkedList<Integer> list = hm.get(end[i]);
                list.add(start[i]);
                hm.put(end[i],list);
           }
           i++;
        }
        Arrays.sort(end);
        int last_meeting_end_time = end[0];
        for(int j=1;j<n;j++){
            LinkedList<Integer> list = hm.get(end[j]);
            int start_time = list.pollFirst();
            if(last_meeting_end_time < start_time){
                counter++;
                last_meeting_end_time = end[j];
            }
        }
        return counter;
    }
}
