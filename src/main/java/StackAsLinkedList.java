public class StackAsLinkedList<K> extends MyLinkedList<K> {

    public void push(INode nodeToPushOnTop){
        INode headBeforePush = this.getHead();
        if(headBeforePush == null){
            this.setHead(nodeToPushOnTop);
            this.setTail(nodeToPushOnTop);
            return;
        }
        nodeToPushOnTop.setNext(headBeforePush);
        this.setHead(nodeToPushOnTop);
    }

    public K peak() {
        if(this.getHead() == null){
            return null;
        }
        return this.getHead().getKey();
    }

    public INode<K> pop() {
        if(this.getHead() == null){
            return null;
        }
        INode<K> nodeToPop = this.getHead();
        INode<K> newHeadNode = this.getHead().getNext();
        this.setHead(newHeadNode);
        return nodeToPop;
    }

//    public INode<K> push(){
//        INode t
//        return
//    }
}
