/**
 * Created by beou on 5/23/17.
 */
public class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this(data, null);
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[").append(data).append("]");
        return sb.toString();
    }
}
