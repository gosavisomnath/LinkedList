public class MyLinkedList {
    private INode head;
    private INode tail;
    private  int size;

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

}
