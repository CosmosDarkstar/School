package skewll.treeStuffffffffff;

/**
 * This program tests the binary search tree class.
 */
public class TreeTester {
	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();
		t.add("Mary");
		t.add("had");
		t.add("a");
		t.add("little");
		t.add("lamb");
		t.add("its");
		t.add("fleece");
		t.add("was");
		t.add("white");
		t.add("as");
		t.add("snow");

		t.print();

		Tree verp = new Tree();
		Tree flobt = new Tree("Mary");
		verp.addSubtree("had");
		verp.addSubtree("a");
		verp.addSubtree("little");
		verp.addSubtree("lamb");
		verp.addSubtree("its");
		verp.addSubtree("fleece");
		verp.addSubtree("was");
		verp.addSubtree("white");
		verp.addSubtree("as");
		verp.addSubtree("snow");

	}
}
