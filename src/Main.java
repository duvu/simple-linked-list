public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        System.out.println("Pushed!" + linkedList + "/" + linkedList.getSize());

        linkedList.pop();
        linkedList.pop();
        linkedList.pop();
        System.out.println("Popped!" + linkedList + "/" + linkedList.getSize());
    }
}
