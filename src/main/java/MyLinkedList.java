import org.w3c.dom.Node;

public class MyLinkedList<T> {
    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public INode getHead() {
        return head;
    }

    public void setHead(INode head) {
        this.head = head;
    }

    public INode getTail() {
        return tail;
    }

    public void setTail(INode tail) {
        this.tail = tail;
    }

    public void append(INode nodeToAppend) {
        if (this.head == null){
            this.head = nodeToAppend;
        }
        if(this.tail == null){
            this.tail = nodeToAppend;
        }else{
            this.tail.setNext(nodeToAppend);
            this.tail = nodeToAppend;
        }
    }
}
