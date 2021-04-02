import java.util.Optional;

public class MyBinarySearchTree<K extends Comparable<K>> {
    MyBinaryNode<K> rootNode;

    public MyBinarySearchTree() {
        this.rootNode = null;
    }

    public void add(MyBinaryNode<K> nodeToAdd){
        this.add(this.rootNode,nodeToAdd);
    }

    private void add(MyBinaryNode<K> currentRootNode, MyBinaryNode<K> nodeToAdd) {
        if(this.rootNode==null){
            this.rootNode = nodeToAdd;
            return;
        }
        if (currentRootNode.compareTo(nodeToAdd) > 0 ){
            if(currentRootNode.getLeftNode() == null) {
                currentRootNode.setLeftNode(nodeToAdd);
                return;
            }else{
                currentRootNode = currentRootNode.getLeftNode();
                this.add(currentRootNode,nodeToAdd);
            }
        }else{
            if(currentRootNode.getRightNode() == null){
                currentRootNode.setRightNode(nodeToAdd);
                return;
            }else{
                currentRootNode = currentRootNode.getRightNode();
                this.add(currentRootNode,nodeToAdd);
            }
        }
    }

    public boolean search(K key) {
    return true;
    }

    public int getSize(){
        return getSize(this.rootNode);
    }

    public int getSize(MyBinaryNode<K> currentNode) {
        if(currentNode == null){
            return 0;
        }
        else{
            return getSize(currentNode.getLeftNode()) + 1 + getSize(currentNode.getRightNode());
        }
    }
}