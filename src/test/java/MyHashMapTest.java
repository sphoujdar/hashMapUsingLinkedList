import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest{
    @Test
    public void givenASentence_AddEachWordAndNumberOfOccurrenceToKeyValuePairList_AndReturnTrueIfCorrectForAll(){
        MyMapNodeList<String, Integer> keyValueLinkedList = new MyMapNodeList<>();
        String sentenceToEvaluate = "to be or not not to be";
        String[] wordList = sentenceToEvaluate.split(" ");
        for (String word : wordList) {
            if (keyValueLinkedList.get(word) == null){
                keyValueLinkedList.add(word , 1);
            }else{
                MyMapNode<String,Integer> currentWordNode= (MyMapNode<String, Integer>) keyValueLinkedList.get(word);
                Integer currentWordOccurrenceValue = currentWordNode.getValue();
                currentWordOccurrenceValue += 1;
                keyValueLinkedList.add(word,currentWordOccurrenceValue);
            }
        }
        MyMapNode<String ,Integer> toOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("to");
        MyMapNode<String ,Integer> beOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("be");
        MyMapNode<String ,Integer> orOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("or");
        MyMapNode<String ,Integer> notOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("not");
        boolean testVariable = toOccurrence.getValue() == 2 &&
                               beOccurrence.getValue() == 2 &&
                               orOccurrence.getValue() == 1 &&
                               notOccurrence.getValue() == 2;
        Assert.assertTrue(testVariable);
    }

    @Test
    public void givenASentence_AddEachWordAndNumberOfOccurrenceToHashMap_AndReturnTrueIfCorrectForAll(){
        MyHashMap<String, Integer> keyValueHashMap = new MyHashMap<>();
        String sentenceToEvaluate = "Paranoids are not " +
                "paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        String[] wordList = sentenceToEvaluate.split(" ");
        for (String word : wordList) {
            if (keyValueHashMap.get(word) == null){
                keyValueHashMap.add(word , 1);
            }else{
                MyMapNode<String,Integer> currentWordNode =  keyValueHashMap.get(word);
                Integer currentWordOccurrenceValue = currentWordNode.getValue();
                currentWordOccurrenceValue += 1;
                keyValueHashMap.add(word,currentWordOccurrenceValue);
            }
        }
        MyMapNode<String ,Integer> intoOccurrence = keyValueHashMap.get("into");
        MyMapNode<String ,Integer> paranoidOccurrence = keyValueHashMap.get("paranoid");
        MyMapNode<String ,Integer> becauseOccurrence = keyValueHashMap.get("because");
        MyMapNode<String ,Integer> themselvesOccurrence = keyValueHashMap.get("themselves");
        boolean testVariable = intoOccurrence.getValue() == 1 &&
                               paranoidOccurrence.getValue() == 3 &&
                               becauseOccurrence.getValue() == 2 &&
                               themselvesOccurrence.getValue() == 1;
        Assert.assertTrue(testVariable);
    }

    @Test
    public void givenAHashMap_DeleteOneKeyValueInHashMap_AndReturnTrueIfDeleted(){
        MyHashMap<String, Integer> keyValueHashMap = new MyHashMap<>();
        String sentenceToEvaluate = "Paranoids are not " +
                "paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        String[] wordList = sentenceToEvaluate.split(" ");
        for (String word : wordList) {
            if (keyValueHashMap.get(word) == null){
                keyValueHashMap.add(word , 1);
            }else{
                MyMapNode<String,Integer> currentWordNode =  keyValueHashMap.get(word);
                Integer currentWordOccurrenceValue = currentWordNode.getValue();
                currentWordOccurrenceValue += 1;
                keyValueHashMap.add(word,currentWordOccurrenceValue);
            }
        }

        MyMapNode<String ,Integer> avoidableOccurrenceBeforeDelete = keyValueHashMap.get("avoidable");
        keyValueHashMap.remove("avoidable");
        boolean testVariable = avoidableOccurrenceBeforeDelete.getValue() == 1 &&
                               !keyValueHashMap.remove("avoidable");
        Assert.assertTrue(testVariable);
    }

    @Test
    public void givenKeyValuePairsInHashMap_CheckIfKeyIsPresent_ReturnTrueIfItWorksForPresentAndAbsentCases(){
        MyHashMap<String, Integer> keyValueHashMap = new MyHashMap<>();
        String sentenceToEvaluate = "Paranoids are not " +
                "paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        String[] wordList = sentenceToEvaluate.split(" ");
        for (String word : wordList) {
            if (keyValueHashMap.get(word) == null){
                keyValueHashMap.add(word , 1);
            }else{
                MyMapNode<String,Integer> currentWordNode =  keyValueHashMap.get(word);
                Integer currentWordOccurrenceValue = currentWordNode.getValue();
                currentWordOccurrenceValue += 1;
                keyValueHashMap.add(word,currentWordOccurrenceValue);
            }
        }

        MyMapNode<String ,Integer> avoidableOccurrenceBeforeDelete = keyValueHashMap.get("avoidable");
        keyValueHashMap.remove("avoidable");
        boolean testVariable = avoidableOccurrenceBeforeDelete.getValue() == 1 &&
                               !keyValueHashMap.isPresent("avoidable");
        Assert.assertTrue(testVariable);
    }
}
