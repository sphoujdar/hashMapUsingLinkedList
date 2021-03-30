public class MyLinkedList<T> {
    private INode<T> head;
    private INode<T> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public INode<T> getHead() {
        return head;
    }

    public void setHead(INode<T> head) {
        this.head = head;
    }

    public INode<T> getTail() {
        return tail;
    }

    public void setTail(INode<T> tail) {
        this.tail = tail;
    }

    public void append(INode<T> nodeToAppend) {
        if (this.head == null){
            this.head = nodeToAppend;
        }
        if (this.tail != null) {
            this.tail.setNext(nodeToAppend);
        }
        this.tail = nodeToAppend;
    }

    public void insert(INode<T> nodeToInsertInBetweenList , T previousNodeData) {
        INode currentNode = this.head;
        while(!currentNode.getData().equals(previousNodeData)){
            currentNode = currentNode.getNext();
        }
        INode nodeAfterInsertedNode = currentNode.getNext();
        currentNode.setNext(nodeToInsertInBetweenList);
        nodeToInsertInBetweenList.setNext(nodeAfterInsertedNode);
    }

    public void printList(){
        INode currentNode = this.head;
        System.out.print("Head->  ");
        while(currentNode.getNext() != null){
            System.out.print(currentNode.getData()+"->");
            currentNode = currentNode.getNext();
        }
        System.out.print(currentNode.getData());
        System.out.println("  <-Tail");
    }

    public void popHead() {
        this.head = this.head.getNext();
    }

    public void popTail() {
        INode newTailNode = this.head;
        while(!newTailNode.getNext().equals(this.tail)){
            newTailNode = newTailNode.getNext();
        }
        newTailNode.setNext(null);
        newTailNode = this.tail;
    }
}
