import javax.naming.BinaryRefAddr;

public class Main {
    
    public static void main(String[] args) {
        
        BinarySearchTree myBST = new BinarySearchTree();

        // System.out.println("Root: " +myBST.root);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);

        myBST.insert(82);

        // System.out.println(myBST.root.left.right.value);


        System.out.println(myBST.contains(100));

        System.out.println(myBST.rContains(52));

        System.out.println(myBST.rContains(0));

        // myBST.rInsert(11);

        System.out.println(myBST.rContains(11));

        // myBST.deleteNode(82);
        System.out.println(myBST.contains(82));

        System.out.println("BFS: "+myBST.BFS());

        System.out.println("DFS PreOrder: "+myBST.DFSPreOrder());

        System.out.println("DFS Post Order: "+myBST.DFSPostOrder());

        System.out.println("DFS In Order: "+myBST.DFSInOrder());
    }
}
