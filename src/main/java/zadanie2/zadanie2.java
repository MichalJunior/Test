package zadanie2;

public class zadanie2 {
    public static void main(String[] args) {
        Tree  tree = new Tree();

        tree.addValue(3);
        tree.addValue(10);
        tree.addValue(45);
        tree.addValue(67);
        tree.addValue(76);


        tree.Contain(45);
        tree.findMaxValue();
        tree.findMInValue();
    }
}
