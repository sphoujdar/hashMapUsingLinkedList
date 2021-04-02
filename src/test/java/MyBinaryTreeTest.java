import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NodesInBinarySearchTree_CheckIfKeyIsPresent_ReturnTrueIfItWorksForPresentAndAbsentCases(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        boolean testVariable = (!myLinkedList.isPresent(50))
                && myLinkedList.isPresent(56)
                && myLinkedList.isPresent(30)
                && myLinkedList.isPresent(70);
        Assert.assertTrue(testVariable);
    }
}
