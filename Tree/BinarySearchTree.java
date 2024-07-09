public class BinarySearchTree{
    
    private Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    /* Insert In Binary Search Tree Steps:
     * 1. create newNode
     * 2. Check if Tree is Empty | if root == null then root = newNode
     * 3. Else | Create a Temp Variable to move around in the tree | temp = root
     * 4. while loop
     * 5. if newNode.value == temp.value retrun fasle | We cannot insert same value in BST
     * 6. if < left else > right
     * 7. if null insert newNode else move to next
     */

     public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value){
                return false;
            }
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
     }

     /* Conatins Method Steps:
      * 1. check if tree is empty and return null | if root == null return false;
      * 2. If not, | temp = root
      * 3. run while loop until null | while temp != null
      * 4.      if < left
      * 5.      else if > right
      * 6.      else == return true
      * 7. return false
      */

      public boolean contains(int find){
        if(root == null){
            return false;
        }
        Node temp = root;
        while(temp != null){
            if(find < temp.value){
                temp = temp.left;
            }else if(find > temp.value){
                temp = temp.right;
            } else{
                return true;
            }
        }
        return false;
      }
}