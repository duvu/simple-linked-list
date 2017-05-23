/**
 * Created by beou on 5/23/17.
 */
public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node _head) {
        this.head = _head;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int _size) {
        this.size = _size;
    }

    /**
     * append
     * */
    public void append(int data) {
        Node d_node = new Node(data);
        Node c_node = this.getHead();

        if (head == null) {
            head = d_node;
        } else {
            while (c_node.getNext() != null) {
                c_node = c_node.getNext();
            }
            c_node.setNext(d_node);
        }
        size++;
    }
    /**
     * remove at #index
     * */
    public Node remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Invalid argument");
        } else if (head == null) {
            throw new NullPointerException("Instance of List is empty");
        } else {
            Node c_node = head;
            Node p_node = null;
            for (int i = 1; i < index; i++) {
                p_node = c_node;
                c_node = c_node.getNext();
            }
            p_node.setNext(c_node.getNext());
            size--;
            return c_node;
        }
    }
    /**
     * removeAll - remove all elements of list
     * */
    public void removeAll() {
        this.head = null;
        this.size = 0;
    }

    /**
     * push - wrapped append*/
    public void push(int data) {
        this.append(data);
    }
    /**
     * pop - remove last element
     * */
    public Node pop() {
//        if (head == null) {
//            throw new NullPointerException("List is empty");
//        } else {
//            Node c_node = head;
//            Node p_node = null;
//            while (c_node.getNext() != null) {
//                p_node = c_node;
//                c_node = c_node.getNext();
//            }
//            //end of list here
//            p_node.setNext(null);
//            size--;
//            return c_node;
//        }
        return remove(size);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (head == null) {
            sb.append("[]");
        } else {
            sb.append(head);
            Node c_node = head.getNext();
            while (c_node != null) {
                sb.append(c_node);
                c_node = c_node.getNext();
            }
        }
        return sb.toString();
    }
}
