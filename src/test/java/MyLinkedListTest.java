import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3Nodes_AddThemToTheLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setData(56);
        secondNode.setData(30);
        thirdNode.setData(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        boolean testVariable = myLinkedList.getHead().getData().equals(56)
                && myLinkedList.getHead().getNext().getData().equals(30)
                && myLinkedList.getTail().getData().equals(70);
        Assert.assertTrue(testVariable);
    }

    @Test
    public void given2Nodes_AddThirdNodeInTheMiddleOfLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> nodeToInsertInBetweenList = new MyNode<>();
        firstNode.setData(56);
        secondNode.setData(70);
        nodeToInsertInBetweenList.setData(30);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.insert(nodeToInsertInBetweenList , 56);

        boolean testVariable = myLinkedList.getHead().getData().equals(56)
                && myLinkedList.getHead().getNext().getData().equals(30)
                && myLinkedList.getTail().getData().equals(70);
        Assert.assertTrue(testVariable);
    }



}
