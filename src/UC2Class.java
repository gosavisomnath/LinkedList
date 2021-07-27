
public class UC2Class {

    public static void main(String[] args) {
        INode myFirstNode=new MyNode<Integer>(70);
        INode mySecondNode=new MyNode<Integer>(30);
        INode myThirdNode=new MyNode<Integer>(56);

        MyLinkedList obj= new MyLinkedList();
        obj.add(myFirstNode);
        obj.add(mySecondNode);
        obj.add(myThirdNode);
        obj.printNodes();
        obj.search(mySecondNode);


        
    }
}
