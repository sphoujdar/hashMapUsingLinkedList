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

//    public INode<K> push(){
//        INode t
//        return
//    }
}
