class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
         //create a stack for reversing the queue
      Stack <Integer> s = new Stack<>();
     
      /*while the queue is not empty , pop(offer) the front element
      from queue and insert(push) that element into the stack. */

      while(!q.isEmpty())
      {
        s.push(q.poll());  //Inserting into stack
      }

      /* Till the stack is not empty , pop the element from 
      stack and insert(offer) it into the queue. */

      while(!s.isEmpty())
      {
        q.offer(s.pop());  //Inserting into queue
      }
      return q;
    }
}
