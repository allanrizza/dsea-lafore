import algorithms.*;

/**
 * @author Allan G. Rizza
 */
public class Application {
    public static void main(String[] args) {
        BubbleSort.example();

        BinarySearch.example();

        SelectionSort.example();

        InsertionSort.example();

        ObjectSort.example();

        BracketChecker bc = new BracketChecker("{[()]}");
        //BracketChecker bc = new BracketChecker("()[]{}");
        bc.check();
    }
}