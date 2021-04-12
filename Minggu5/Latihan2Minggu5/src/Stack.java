public class Stack<T extends Object> {
    private int Max;
    private T[] data;
    private int top;
    
    public Stack(int size) {
        this.Max = size;
        this.data = (T[])new Object[this.Max];
        this.top = -1;
    }
    
    public Stack() {
        this.Max = 1000;
        this.data = (T[])new Object[this.Max];
        this.top = -1;
    }
            
    public void push(T entry) {
        if(this.isFull()) {
            this.increaseStackCapacity();
        }
        this.data[++top]=entry;
    }
    
    public T pop() {
        T entry = null;
        if(!this.isEmpty()) {
            entry = this.data[top--];
        }
        return entry;
    }
    
    public T peek() {
        return data[top];
    }
    
    public T get(int index) {
        return data[index];
    }
    //public Stack(int MAX_VERTS) {
    //}

    
    private void increaseStackCapacity() {
        @SuppressWarnings("unchecked")
        T[]newStack=(T[])new Object[this.Max*2];
        System.arraycopy(this.data,0,newStack,0,this.Max);
        this.data = newStack;
        this.Max = this.Max * 2;
    }

    private boolean isFull() {
        return(top==this.Max-1);
    }

    boolean isEmpty() {
        return(top==-1);
    }
    public int getTop() {
        return top;
    }
    public int size() {
        return top+1;
    }
    public T[] getElement() {
        T[]newData=(T[])new Object[this.top];
        System.arraycopy(this.data,0,newData,0,this.top);
        return newData;
    }

    private T data(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
