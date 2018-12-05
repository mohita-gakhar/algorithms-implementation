package binary.tree.traversal;

import binary.tree.intro.TreeNode;

public class InOrderTraversal {
	
	public static void traverse(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		traverse(root.left);
		System.out.print(root.data+" ");
		traverse(root.right);
	}

}
