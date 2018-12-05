package binary.tree.intro;

public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree() {
		root=null;
	}
	
	public BinaryTree(int item) {
		root = new TreeNode(item);
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(1);
		
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
	}

}
