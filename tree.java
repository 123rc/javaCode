import java.util.Scanner;

public class tree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
        buildtree();

    }
    static Node buildtree()
    {
        Node root=null;
        System.out.println("Enter data");
        int d=sc.nextInt();
        if(d==-1)
        {
            return null;
        }
        root=new Node(d);
        System.out.println("Enter left for "+d);
        root.left=buildtree();
        System.out.println("Enter right for "+d);
        root.right=buildtree();

        return root;
    }
    static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.d+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.d+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.d+" ");
    } 
}
class Node
{
    int d;
    Node left;
    Node right;
    Node(int d)
    {
       this.d=d;
    }
}
