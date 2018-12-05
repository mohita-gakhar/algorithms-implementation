package binary.tree.intro;

import java.util.LinkedList;
import java.util.Queue;

import binary.tree.traversal.InOrderTraversal;

public class InsertLevelOrder {
	
	public static void insert(TreeNode root, int key) {
		
		TreeNode temp = root;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(temp);
		
		while(!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();
			
			if(temp.left == null) {
				temp.left = new TreeNode(key);
				break;
			}else {
				queue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new TreeNode(key);
				break;
			}else {
				queue.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(11); 
        root.left.left = new TreeNode(7); 
        root.right = new TreeNode(9); 
        root.right.left = new TreeNode(15); 
        root.right.right = new TreeNode(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        InOrderTraversal.traverse(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        InOrderTraversal.traverse(root); 
	}

}
