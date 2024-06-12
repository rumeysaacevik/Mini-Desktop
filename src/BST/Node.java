
package BST;

/**
 *
 * @author rumeysa & rana
 */
public class Node<T extends Comparable<T>> {
    Node<T> left;
    Node<T> right;
    T data;
    LinkedList<T> List;
    
    public Node(T data) {
        this.data = data;
        this.List = new LinkedList<>(); 
        left = right = null;
    }
    
    
}
