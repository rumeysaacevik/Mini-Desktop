# Mini-Desktop

AIM OF THE PROJECT : 

The aim of this project is to create a "mini desktop search engine" using the Java programming language. The task a search engine has to do is to search the collection of documents containing the specified keywords and return a list of documents where the keywords are

found. 



BSTSearchEngine 

This class updates the contents by reading them with text rules and removes unnecessary words and changes from the contents. The cleaned content is then returned. 

updateContent(String filePath): Takes the path of the amount of text as parameter and reads the content from the file. Splitting a line of content combines the content, ensuring that the information does not start with "<". Then unnecessary words and changes in the 

specified list are removed and the cleaned content ends. 



BinarySearchTree 

Represents the binary search tree structure. Its main purpose is to organize data and track word frequencies by using words in text files as keys. Additionally, data can be accessed, inserted and deleted using various navigation methods of the tree through this class. 

insert(T newData, T fileName): Inserts a new node containing the given key and filename. 

printTreePostorder(JTextArea textArea): Traverses the tree in postorder and writes the node values to JTextArea. 

printTreeInorder(JTextArea textArea): Traverses the tree in order and writes the node values to JTextArea. 

printTreePreorder(JTextArea textArea): Traverses the tree in preorder form and writes the node values to JTextArea. 

delete(T key): Deletes the node with the specified key from the tree. 

printTree(): Scans the tree level by level and writes node values and lists to the console. 

search(String searchData): Searches for the given key and returns the found node. 



LNode and LinkedList 

These classes represent lists of nodes in the binary search tree. Each node contains the filename of a particular word and the frequency of the word in that file. The LinkedList class holds these nodes and performs their operations. 

addFirst(T data, int value): Adds a new node and places it at the beginning of the listen. 

addLast(T data, int value): Adds a new node and places it until the end of the listen. 

print(): Prints all elements of the list to the console. 

size(): Returns the change of listening. 

contains(String fileName): checks whether the name of the specified file is included in the list. 



MiniSearchEngine 
This class provides a graphical user interface (GUI). The user can manipulate text files, perform searches, and view results through this interface. This class is used to manage user interaction and provides the functionality of the search engine by interacting with 

other classes. 

When the user enters a word in the text box, it searches for the specified key and prints the list of the found node to the JTextArea. 

It traverses the tree according to the options selected from the ComboBox and writes the result to JTextArea. 


![image](https://github.com/rumeysaacevik/Mini-Desktop/assets/169652554/b8439fb7-292d-4272-9557-cd9efcfa8a77)


![image](https://github.com/rumeysaacevik/Mini-Desktop/assets/169652554/844adcbc-f57a-4836-be5e-a652fe753c8f)


![image](https://github.com/rumeysaacevik/Mini-Desktop/assets/169652554/213ba718-e7b9-4584-84fc-f68d992a7d04)



