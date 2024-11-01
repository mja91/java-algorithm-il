package algorithm.recursive_tree_graph.dfs;

public class 트리_말단노드_최단거리 {

    public static class Node {
        int val;
        Node lt;
        Node rt;

        public Node(int val) {
            this.val = val;
            lt = null;
            rt = null;
        }
    }

    static Node root;

    public static int dfs(int l, Node root) {
        if (root.lt == null && root.rt == null) {
            return l;
        } else {
            return Math.min(dfs(l+1, root.lt), dfs(l+1, root.rt));
        }
    }

    public static void main(String[] args) {
        final int l = 0;
        트리_말단노드_최단거리 tree = new 트리_말단노드_최단거리();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        int result = tree.dfs(l, tree.root);
        System.out.println(result);
    }
}
