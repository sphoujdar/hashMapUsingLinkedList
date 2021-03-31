//I had to change below line from
//public class MyNode<K> implements INode<K>,Comparable<K>
//to
//public class MyNode<K extends Comparable<K>> implements INode<K>
//to make comparable override work
//Why did I have to do do that?
//Basic difference between "implements" and "extends"?
//https://stackoverflow.com/questions/21544716/implementing-comparable-with-a-generic-class

public class MyNode<K extends Comparable<K>> implements INode<K>{

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

    @Override
    public int compareTo(INode<K> currentNode) {
        if (this.getKey().equals(null) || currentNode.getKey().equals(null)){
            return 0;
        }
        return this.getKey().compareTo(currentNode.getKey());
    }

    @Override
    public int compareTo(K key) {
        if (this.key == null || key == null){
            return 0;
        }
        return this.key.compareTo(key);
    }
}
