package algorithm.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리순회_BFS {

    Node root;

    public static class Node {
        int val;
        이진트리순회_BFS.Node lt;
        이진트리순회_BFS.Node rt;

        public Node(int val) {
            this.val = val;
            this.lt = null;
            this.rt = null;
        }
    }

    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            System.out.print(l + " : ");
            for (int i=0; i<length; i++) {
                Node current = queue.poll();
                System.out.print(current.val + " ");
                if (current.lt != null) {
                    queue.offer(current.lt);
                }
                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        이진트리순회_BFS tree = new 이진트리순회_BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs(tree.root);
    }
}
