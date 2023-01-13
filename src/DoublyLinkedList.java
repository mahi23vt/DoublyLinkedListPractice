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
    public void insertLast(int num)
    {
        // creating a new node
        NumberNode node = new NumberNode(new Number(num));
        // check if it is the first element
        if(tail == null) {
            insertFirst(num);
            return;
        }
        tail.next=node;
        node.previous=tail;
        node.next=null;
        tail=node;
        size ++;

    }
    public void insertToIndex(int num, int index)
    {
        if(index == 0)
        {
            insertFirst(num);
            return;
        }
        if(index == size)
        {
            insertLast(num);
            return;
        }
        NumberNode node = getNode(index-1);// Need to reach the previous node
        NumberNode temp = node.next;
        NumberNode newElement = new NumberNode(new Number(num),temp,node);
        node.next=newElement;
        temp.previous=newElement;
        size++;
    }

    public NumberNode getNode(int index) // It returns the node present at that index value
    {
        NumberNode tempNode = head;
        for(int i = 0;i<index;i++)
        {
            tempNode = tempNode.next;
        }
        return tempNode;
    }
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("No item in the list");
            return;
        }
        NumberNode selectedNode = head;
        head=head.next;
        head.previous=null;
        selectedNode.next=null;
        size--;
    }
    public void deleteLast()
    {
        NumberNode selectedNode = tail;
        tail=tail.previous;
        tail.next=null;
        selectedNode.previous=null;
        size--;
    }
    public void deleteAtIndex(int index)
    {
        if(index ==0)
        {
            deleteFirst();
            size--;
            return;
        }
        if(index==size)
        {
            deleteLast();
            size--;
            return;
        }
        NumberNode toDelete = getNode(index);
        NumberNode nextNode = getNode(index+1);
        NumberNode previousNode = getNode(index - 1);
        previousNode.next=nextNode;
        nextNode.previous=previousNode;
        toDelete.next=null;
        toDelete.previous=null;
        size --;
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
