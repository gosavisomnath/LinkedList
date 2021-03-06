public class MyLinkedList {
    private INode head;
    private INode tail;
    private  int size;
    private  INode next;
    private INode prev_node;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(INode node) {
        if (this.head == null) {
            this.head = node;
        }
        if (this.tail == null) {
            this.tail = node;
        } else {
            INode temp = head;
            this.head = node;
            this.head.setNext(temp);

        }
    }
    public void printNodes() {
        StringBuilder nodes = new StringBuilder("Node Keys");
        INode temp = this.head;
        while (temp != null) {
            nodes.append(temp.getKey());
            if (temp != tail) {
                nodes.append("->");

            }
            temp = temp.getNext();

        }
        System.out.println(nodes);
    }
    public void insertAfter(INode node, int new_data)
    {
        if (this.head == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

        INode new_node = new MyNode(new_data);
        INode a=prev_node.getNext();
        new_node.setNext(a);

    }
    public INode pop() {
        INode temp = this.head;

        this.head = head.getNext();

        size--;

        return temp;

    }
    public INode popLast() {

        INode temp = this.head;

        while (temp.getNext() != this.tail) {

            temp = temp.getNext();

        }

        this.tail = temp;

        temp = temp.getNext();

        size--;

        return temp;

    }
    public INode search(INode key) {
        INode temp = this.head;

        while (temp != null && temp.getNext() != null) {

            if (temp.getKey().equals(key)) {

                return temp;

            }

        }

        return null;
    }

}
