

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class Problem_No_543 {
    public int diamterOfBinaryTree(Node root){

        int[] diamter = new int[1];
        // function calling
        height(root, diamter);
        return  diamter[0];
        // recursive call
    }
    public int height(Node node, int[]diamter){
        if (node==null){
            return 0;
        }
        // recursive call
        int lDepth = height(node.left, diamter);
        int RDepth = height(node.right, diamter);
        diamter[0] = Math.max(diamter[0], lDepth + RDepth);
        return 1+ Math.max(lDepth, RDepth);
    }


    public static void main(String[] args) {
        Problem_No_543 problem = new Problem_No_543();

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int diameter = problem.diamterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree is: " + diameter);
    }
}



