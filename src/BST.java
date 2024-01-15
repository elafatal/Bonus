import java.util.ArrayList;


public class BST{
    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        return temp;
    }
    static Node res;

    static void nextLargerElementUtil(Node root, int x) {
        if (root == null)
            return;

        if (root.data > x) {
            if (res == null || res.data > root.data)
                res = root;
        }

        int numChildren = root.child.size();

        for (int i=0; i<numChildren; i++)
            nextLargerElementUtil(root.child.get(i), x);
    }

    static Node nextLargerElement(Node root, int x) {
        // resultant node
        res = null;

        // Calling helper function
        nextLargerElementUtil(root, x);

        return res;
    }

    public static void main(String[] args) {
        Node root = newNode(20);
        root.child.add(newNode(9));
        root.child.add(newNode(25));
        root.child.get(0).child.add(newNode(5));
        root.child.get(0).child.add(newNode(12));
        root.child.get(1).child.add(newNode(11));
        root.child.get(1).child.add(newNode(14));

        int x = 14;
        System.out.print("Next larger element of " + x + " is ");
        System.out.println(nextLargerElement(root, x).data);


    }}
    // Driver code
