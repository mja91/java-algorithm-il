package algorithm.recursive_tree_graph;

public class 이진트리순회_DFS {

    public static class Node {
        int val;
        Node lt;
        Node rt;

        public Node(int val) {
            this.val = val;
            this.lt = null;
            this.rt = null;
        }
    }

    Node root;
    public void dfs(Node root) {
        if (root != null) {
//            System.out.print(root.val + " "); // 전위순회
            dfs(root.lt);
//            System.out.print(root.val + " "); // 중위순회
            dfs(root.rt);
//            System.out.print(root.val + " "); // 후위순회
        }
    }

    public static void main(String[] args) {
        이진트리순회_DFS tree = new 이진트리순회_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}