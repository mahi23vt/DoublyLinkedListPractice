public class DoublyLinkedList {
    private NumberNode head,tail;
    private int size;

    public void insertFirst(int num)
    {
        // create a node
        NumberNode node = new NumberNode(new Number(num));
        if(tail==null) // For checking if this is the first node
        {
            tail = head;
        }
        node.next = head;
        if(head!=null) // this is for preventing the null pointer exception for the instance when there is only one node
            head.previous=node;
        node.previous=null;
        head=node;
        size ++;
    }

    public void display()
    {
        NumberNode tempNode = head;
        while(tempNode!=null)
        {
            System.out.print(tempNode.getNumber().getNum()+" <-->");
            tempNode=tempNode.next;

        }
        System.out.println("END");
    }

}
