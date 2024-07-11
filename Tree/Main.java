import javax.naming.BinaryRefAddr;

public class Main {
    
    public static void main(String[] args) {
        
        BinarySearchTree myBST = new BinarySearchTree();

        // System.out.println("Root: " +myBST.root);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        // System.out.println(myBST.root.left.right.value);


        System.out.println(myBST.contains(100));

        System.out.println(myBST.rContains(52));

        System.out.println(myBST.rContains(0));

        myBST.rInsert(11);

        System.out.println(myBST.rContains(11));

        myBST.deleteNode(82);
        System.out.println(myBST.contains(82));

    }
}
