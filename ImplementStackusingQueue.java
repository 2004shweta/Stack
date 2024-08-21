class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // public MyStack() {


        
    // }
    
    public void push(int x) {
        q2.offer(x);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.poll();
        
    }
    
    public int top() {
            if (q1.isEmpty()) {
            
            return -1;
        }
        return q1.peek();
    }
    
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

}
