
package BST;

/**
 *
 * @author rumeysa & rana
 */
public class LinkedList<T> {

    LNode<T> head;
    
    public LinkedList() {
        head = null;
    }
    
    void addFirst(T data, int value) {
        LNode<T> newNode = new LNode<>(data,value);
       
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; 
            head = newNode;
        }
    }

    void addLast(T data, int value) {
        LNode<T> newNode = new LNode<>(data,value);

        if (head == null) { 
            head = newNode;
        } else {
            LNode<T> temp = head; 

            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }
    
    void print() {
        LNode<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " " + temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }

    int size() {
        LNode<T> temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    
    public boolean contains(String fileName) {
    LNode temp = head;

    while (temp != null) {
        if (temp.data.equals(fileName)) { 
            return true;
        }
        temp = temp.next;
    }

    return false; 
}

}
