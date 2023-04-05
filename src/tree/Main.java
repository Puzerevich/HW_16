package tree;

public class Main {
    public static void main(String[] args) {

        SimpleTree  simpleTree = new SimpleTree ();

        simpleTree.addNode(20);
        simpleTree.addNode(25);
        simpleTree.addNode(85);
        simpleTree.addNode(14);
        simpleTree.addNode(30);
        simpleTree.addNode(88);
        simpleTree.addNode(10);
        simpleTree.addNode(96);
        simpleTree.addNode(50);
        simpleTree.addNode(32);

        simpleTree.printTree();
    }
}
