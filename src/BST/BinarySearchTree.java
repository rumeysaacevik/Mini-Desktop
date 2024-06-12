
package BST;

import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author rumeysa & rana
 */
public class BinarySearchTree<T extends Comparable<T>> {

    Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(T newData, T fileName) {
        Node<T> newNode = new Node<>(newData);
        newNode.List.addLast(fileName, 1);

        if (root == null) {
            root = newNode;
            return;
        }

        Node<T> temp = root;
        while (temp != null) {
            if (newData.equals(temp.data)) {
                if (temp.List.contains(fileName.toString())) {
                    LNode<T> current = temp.List.head;
                    while (current != null) {
                        if (current.data.equals(fileName)) {
                            current.value++; 
                            break;
                        }
                        current = current.next;
                    }
                } else {
                    temp.List.addLast(fileName, 1);
                }
                return; 
            }
            if (newData.compareTo(temp.data) < 0) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return; 
                }
                temp = temp.left;
            } else if (newData.compareTo(temp.data) > 0) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return; 
                }
                temp = temp.right;
            }
        }

    }

    public void printTreePostorder(JTextArea textArea) {
        printPostorder(root, textArea);
        System.out.println(textArea.getText());
    }
    
    public void printPostorder(Node<T> node, JTextArea textArea) {
        if (node == null) {
            return;
        }

        printPostorder(node.left, textArea);
        printPostorder(node.right, textArea); 
        textArea.append(node.data.toString() + " " + "\n"); 
    }
    
    public void printTreeInorder(JTextArea textArea) {
        printInorder(root, textArea);
        System.out.println(textArea.getText());
    }

    public void printInorder(Node<T> node, JTextArea textArea) {
        if (node == null) {
            return;
        }

        printInorder(node.left, textArea); 
        textArea.append(node.data.toString() + " " + "\n"); 
        printInorder(node.right, textArea); 
    }

    public void printTreePreorder(JTextArea textArea) {
        printPreorder(root, textArea);
        System.out.println(textArea.getText());
    }

    public void printPreorder(Node<T> node, JTextArea textArea) {
        if (node == null) {
            return;
        }

        textArea.append(node.data.toString() + " " + "\n"); 
        printPreorder(node.left, textArea); 
        printPreorder(node.right, textArea); 
    }


    void delete(T key) {
        Node<T> parent = null;
        Node<T> current = root;

        while (current != null && current.data != key) {
            parent = current;
            if (key.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            return;
        }

        //case 1: has no child
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (current == parent.left) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } // case 2: has 1 child.
        else if (current.left == null || current.right == null) {
            Node<T> child;
            if (current.left != null) {
                child = current.left;
            } else {
                child = current.right;
            }

            if (current == root) {
                root = child;
            } else {
                if (current == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }

        } //case 3: has two children
        else {
            Node<T> successor = current.right;
            Node<T> successorParent = current;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;

            }
            current.data = successor.data;

            if (successor == successorParent.left) {
                successorParent.left = successor.right;

            } else {
                successorParent.right = successor.right;
            }
        }
    }

    void printTree() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        LinkedList<Node<T>> linkedList = new LinkedList<>();
        Queue<Node<T>> queue = linkedList;

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelNodes = queue.size();

            while (levelNodes > 0) {
                Node<T> current = queue.poll();
                System.out.print(current.data + "(");

                if (current.List != null) {
                    current.List.print();
                } else {
                    System.out.print("null");
                }

                System.out.println(")");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }

                levelNodes--;
            }
            System.out.println();
        }
    }

    public Node<T> search(String searchData) {
        return search(root, searchData);
    }

    private Node<T> search(Node<T> node, String searchData) {
        if (node == null) {
            return null; 
        }

        int compareResult = searchData.compareTo(node.data.toString());

        if (compareResult == 0) {
            return node; 
        } else if (compareResult < 0) {
            return search(node.left, searchData); 
        } else {
            return search(node.right, searchData); 
        }
    }

    

}
