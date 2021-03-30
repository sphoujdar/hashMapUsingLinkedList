public class MyNode<K> implements INode<K> {

//    Why do all the references to class need to be INode here?
//    As INode means that it can be of any class which implements INode
//    that would mean that I can use any other class's variable which
//    implements INode here. Is that true? What does that exactly mean
//    if that is true?
//    Why does it give compiler error if we use MyNode instead of INode?

    private K key;
    private INode nextNode;

    public MyNode() {
        this.key = null;
        this.nextNode = null;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return this.nextNode;
    }

    @Override
    public void setNext(INode passedNode) {
        this.nextNode = passedNode;
    }
}
