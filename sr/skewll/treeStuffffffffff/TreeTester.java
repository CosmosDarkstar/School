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

		class thisIsStupid implements Tree.Visitor {

			@Override
			public void visit(Object data) {

			}

		}

		Tree flobt = new Tree("Mary");
		Tree q = new Tree("had");
		Tree e = new Tree("a");
		Tree r = new Tree("little");
		Tree i = new Tree("lamb");
		Tree y = new Tree("its");
		Tree u = new Tree("fleece");
		Tree wg = new Tree("was");
		Tree o = new Tree("white");
		Tree p = new Tree("as");
		Tree obt = new Tree("snow");

		flobt.addSubtree(q);
		flobt.addSubtree(e);
		flobt.addSubtree(r);
		flobt.addSubtree(i);
		flobt.addSubtree(y);
		flobt.addSubtree(u);
		flobt.addSubtree(wg);
		flobt.addSubtree(o);
		flobt.addSubtree(p);
		flobt.addSubtree(obt);

		System.out.println(flobt.postorder());

	}

}
