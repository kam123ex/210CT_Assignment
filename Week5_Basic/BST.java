package Week5_Basic;

import java.util.*; 

public class BST {

	public BTNode root;
	BTNode s;
	int times = 0;
	
	public BST() {
		setRoot(null);
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	public BTNode buildBTree(BTNode root) {
		Vector<BTNode> nodes = new Vector<BTNode>();
		storeBSTNodes(root, nodes);
		int nl = nodes.size();
		return buildBTreeRec(nodes, 0, nl - 1); 
	}
	
	public BTNode buildBTreeRec(Vector<BTNode> nodes, int start, int end) {
		if (start > end) 
            return null; 
		int mid = (start + end) / 2; 
        BTNode node = nodes.get(mid); 
        node.left = buildBTreeRec(nodes, start, mid - 1); 
        node.right = buildBTreeRec(nodes, mid + 1, end); 
  
        return node; 
	}
	
	public void storeBSTNodes(BTNode root, Vector<BTNode> nodes) {
		if (root == null) 
            return; 
		
		  storeBSTNodes(root.left, nodes); 
	      nodes.add(root); 
	      storeBSTNodes(root.right, nodes);
	}
	
	
	
	public void insert(int item) {
		setRoot(insertSubtree(root, item));
	}

	public BTNode insertSubtree(BTNode root, int item) {
		
		if (root == null) {
			root = new BTNode(item);
		} else if (item < root.data) {
			root.left = insertSubtree(root.left, item);
		} else if (item > root.getData()) {
			root.right = insertSubtree(root.right, item);
		}
		return root;
		

	}
	
	public void search(int item) {
		
		s = searchRec(root, item);
		if(s == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("\nThe " +s.data +" is valid");
			System.out.println("The number of comparison is " + times);

		}
		System.out.println();
	}
	
	public BTNode searchRec(BTNode root, int item) {
		times++;
		if (root == null) 
			return null;;
		if (root.data == item)
			return root;
		 else if (item < root.data) 
			return searchRec(root.left, item);
		 else if (item > root.data) 
			return searchRec(root.right, item);
		 else 
			return root;
		
	}
	
	public void traversal(String check) {
		
		switch(check) {
		case "preorder":
			System.out.println("Preorder traversal: ");
			preorder();
			System.out.println();
			break;
		case "inorder":
			System.out.println("Inorder traversal: ");
			inorder();
			System.out.println();
			break;
		case "postorder":
			System.out.println("Postorder traversal: ");
			postorder();
			System.out.println();
			break;
		}
		
	}
	public void visit(BTNode root) {
		System.out.print(Integer.toString(root.data) + " ");
	}

	public void preorder() {
		preorderSubtree(root);
		System.out.println();
	}

	public void preorderSubtree(BTNode root) {
		if (root == null) {
			return;
		}
		
		visit(root);
		preorderSubtree(root.left);
		preorderSubtree(root.right);

	}

	public void inorder() {
		inorderSubtree(root);
		System.out.println();
	}

	public void inorderSubtree(BTNode root) {
		if (root == null) {
			return;
		}

		inorderSubtree(root.left);
		visit(root);
		inorderSubtree(root.right);

	}

	public void postorder() {
		postorderSubtree(root);
		System.out.println();
	}

	public void postorderSubtree(BTNode root) {
		if (root == null) {
			return;
		}

		postorderSubtree(root.left);
		postorderSubtree(root.right);
		visit(root);
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

}