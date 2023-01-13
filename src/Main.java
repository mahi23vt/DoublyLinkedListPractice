public class Main {
    public static void main(String[] args) {
    DoublyLinkedList list =  new DoublyLinkedList();

    list.insertFirst(12);
    list.insertFirst(24);
    list.insertFirst(26);
    list.insertLast(27);
    list.display();
    System.out.println(list.getNode(3).getNumber().getNum());
    list.insertToIndex(20,3);
    list.display();
    list.deleteFirst();
    list.display();
    }
}