package Week5_Basic;

public class BTSTest {
	public static void main(String[] args) {
		BST tree = new BST();
		int[] arrQ8 = {11, 12, 34, 55, 66, 77, 88};
		int[] arrQ9 = {2, 7, 9, 4, 1, 5, 3, 6, 0, 8};
		
		
        System.out.println("Inserting :");
        
//		Q8
		for(int i = 0; i < arrQ8.length; i++) {
			tree.insert(arrQ8[i]);
			System.out.print(arrQ8[i] + " ");
		}

//		Q9
//		for(int i = 0; i < arrQ9.length; i++) {
//			tree.insert(arrQ9[i]);
//			System.out.print(arrQ9[i] + " ");
//		}
		
//		balance the tree
        tree.root = tree.buildBTree(tree.root); 
        System.out.println("\n"); 
        System.out.println("Preorder traversal of balanced BST is :"); 
        tree.preorderSubtree(tree.root);
        System.out.println(); 
        
		tree.search(77);
		
		
		
		
		
		
//		System.out.println("Inserting :");

//		int data = 0;
//		for (int k = 1; k <= 10; k++) {
//			data = (int) (Math.random() * 100);
//			System.out.print(data + " ");
//			tree.insert(data);
//		}

//		Q8
//		for(int i = 0; i < arrQ8.length; i++) {
//			tree.insert(arrQ8[i]);
//			System.out.print(arrQ8[i] + " ");
//		}

//		Q9
//		for(int i = 0; i < arrQ9.length; i++) {
//			tree.insert(arrQ9[i]);
//			System.out.print(arrQ9[i] + " ");
//		}
//		
//		System.out.println();
//		tree.traversal("preorder");
//		tree.traversal("inorder");
//		tree.traversal("postorder");
//		System.out.println();
//		
//		tree.search(77);
//		System.out.println(tree.times);

	}

}
