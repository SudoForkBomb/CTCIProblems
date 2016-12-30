import java.util.HashMap;

/**
 * Created by crtaylor123 on 12/19/16.
 */
public class StackOfPlates<T> {
    HashMap<Integer, MyStack> stacks = new HashMap<Integer, MyStack>();
    MyStack currentStack = new MyStack();


    int currentStackPointer = 0;
    int plateCounter = 0;
    int maxPlates = 5;

    /*
        First checks to see the plate counter for the stack is at the max.
        If it is, it adds the stack/queue to the hashmap, creates a new currentQueue, then adds the item to the new queue, and sets the plateCounter to 1.
        Otherwise, it just adds the item to the currentQueue
     */

    public void push(T item){
        if(plateCounter == maxPlates){
            stacks.put(currentStackPointer, currentStack);
            currentStackPointer++;
            currentStack = new MyStack();
            currentStack.push(item);
            plateCounter = 1;
        }
        else{
            currentStack.push(item);
            plateCounter++;
        }
    }


    /*
        First checks that the currentQueue isn't empty. If it is, it makes sure that we aren't moving to -1 queue.
        If the queue is empty, and we are not moving to -1, it will decrease the currentStackPointer, the fetch the queue at the key, currentStackPointer.
        Otherwise, it just pops off the top plate and decreases the counter.
     */
    public T pop(){
        if(currentStack.isEmpty()){
            if(currentStackPointer == 0){
                System.out.printf("There are no plates left to pop.");
            }
            currentStackPointer--;
            currentStack = stacks.get(currentStackPointer);
            plateCounter--;
            return (T) currentStack.pop();
        }
        else{
            plateCounter--;
            return (T) currentStack.pop();
        }

    }

    public T popAt(int index){
        MyStack specificStack = stacks.get(index);
        return (T) specificStack;
    }




    public int getCurrentStackPointer() {
        return currentStackPointer;
    }

    public int getPlateCounter() {
        return plateCounter;
    }
}
