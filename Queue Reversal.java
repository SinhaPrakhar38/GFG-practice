class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stack = new Stack<>();
     
        while(queue.size > 0) {
           stack.push(queue.poll());
        }
        while(stack.size() > 0) {
           queue.add(stack.pop());
        }
        return queue;
    }
}
