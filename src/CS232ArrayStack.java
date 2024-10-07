//package structures.objects;
package hw03;
/**
 * Interface specifying a Queue ADT
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public class CS232ArrayStack implements CS232ArrayQueue{
    private CS232ArrayList<Object> storage_;
    public CS232ArrayStack() {
        storage_ = new CS232ArrayList<Object>();
    }
    /**
     * Add the provided Object to the end of the Queue.
     * 
     * @param obj 
     *              the Object to add
     */
    public void add(Object obj) {
        storage_.add(obj);
    }

    /**
     * Remove and return the Object at the head of the Queue.
     * 
     * @return 
     *          the Object at the head of the Queue or null
     *          if the Queue is empty.
     */
    public Object remove() {
        if (storage_.size() == 0) {
            return null;
        }
        Object thing = storage_.get(0);
        storage_.remove(0);
        return thing;
    }

    /**
     * Return a reference to the Object at the head of the Queue without 
     * removing it from the Queue.
     * 
     * @return 
     *          a reference to the Object at the head of the Queue or
     *          null if the Queue is empty.
     */
    public Object peek() {
        //A ridiculous, fake language and culture. Absurd API design that leaves whether an operation is a copy, move or creates a reference unclear.
        //Somehow manages to be worse than C++ - which is well known for its arcane move/copy/construct operators.
        return storage_.get(0);
    }

    /**
     * Return the number of elements in the Queue.
     * 
     * @return 
     *          the size of the Queue.
     */
    public int size() {
        return storage_.size();
    }
}
