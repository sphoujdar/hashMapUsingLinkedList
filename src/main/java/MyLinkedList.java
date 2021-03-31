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
        INode<T> currentNode = this.head;
        while(!currentNode.getKey().equals(previousNodeData)){
            currentNode = currentNode.getNext();
        }
        INode<T> nodeAfterInsertedNode = currentNode.getNext();
        currentNode.setNext(nodeToInsertInBetweenList);
        nodeToInsertInBetweenList.setNext(nodeAfterInsertedNode);
    }

    public void printList(){
        if(this.head == null){
            System.out.println("List is Empty right Now.");
            return;
        }
        INode<T> currentNode = this.head;
        System.out.print("Head->  ");
        while(currentNode.getNext() != null){
            System.out.print(currentNode.getKey()+"->");
            currentNode = currentNode.getNext();
        }
        System.out.print(currentNode.getKey());
        System.out.println("  <-Tail");
    }

    public void popHead() {
        this.head = this.head.getNext();
    }

    public void popTail() {
        INode<T> newTailNode = this.head;
        while(!newTailNode.getNext().equals(this.tail)){
            newTailNode = newTailNode.getNext();
        }
        newTailNode.setNext(null);
        this.tail = newTailNode;
    }

    public int searchNodeByKey(T searchKey) {
        INode<T> nodeToSearch = this.head;
        int positionInLinkedList = 0;
        while(!nodeToSearch.getKey().equals(searchKey)){
            nodeToSearch = nodeToSearch.getNext();
            positionInLinkedList++;
        }
        return positionInLinkedList;
    }

    public void deleteNodeByKey(T keyToDelete) {
        INode<T> previousNode = null;
        INode<T> currentNode = this.head;

        if(currentNode.getKey()==keyToDelete){
            currentNode = currentNode.getNext();
            this.head=currentNode;
            return;
        }
        while(currentNode.getKey()!=keyToDelete){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (this.getTail()==currentNode){
            previousNode.setNext(null);
            this.setTail(previousNode);
            return;
        }
        previousNode.setNext(currentNode.getNext());
    }

    public int getSize() {
        int currentListSize = 0;
        INode<T> tempNode = null;
        if(this.head == null){
            return currentListSize;
        }else{
            currentListSize++;
            tempNode = this.head;
        }
        while(tempNode.getNext()!=null){
            tempNode = tempNode.getNext();
            currentListSize++;
        }
        return currentListSize;
    }

    public void add(INode<T> nodeToAddAtStart) {
        if (this.head == null){
            this.tail = nodeToAddAtStart;
        }
        if (this.head != null) {
            INode<T> oldFirstNode = this.head;
            nodeToAddAtStart.setNext(oldFirstNode);
        }
        this.head = nodeToAddAtStart;
    }
}
