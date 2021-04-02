//"Extends Comparable" and "Implements Comparable" usages and needs -
//https://stackoverflow.com/questions/34553204/implementing-comparable-for-a-node-in-java
//https://stackoverflow.com/questions/21544716/implementing-comparable-with-a-generic-class

public class MyNode<K extends Comparable<K>> implements INode<K>{
    private K key;
    private INode<K> nextNode;

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
    public INode<K> getNext() {
        return this.nextNode;
    }

    @Override
    public void setNext(INode<K> passedNode) {
        this.nextNode = passedNode;
    }

    @Override
    public int compareTo(INode<K> nodeToCompare) {
                return this.key.compareTo(nodeToCompare.getKey());
    }

    @Override
    public String toString() {
        return "[" + this.key.toString() + "]";
    }
}
