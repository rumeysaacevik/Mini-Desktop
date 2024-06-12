
package BST;

/**
 *
 * @author rumeysa & rana
 */
public class LNode<T> {
    LNode<T> next;
    T data;
    int value;
    
    public LNode(T data,int value) {
        this.data = data;
        this.next = null;
        this.value=value;
    }
}
