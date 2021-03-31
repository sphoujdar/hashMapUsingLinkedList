public class QueueAsLinkedList<K> extends MyLinkedList<K> {

    //First Position of Queue will be Head and Last position will be Tail
    //So the node which will get dequeued first is Head
    public void enqueue(INode<K> nodeToEnqueue){
        this.append(nodeToEnqueue);
    }
}
