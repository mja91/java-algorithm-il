package algorithm.recursive_tree_graph.bfs;

import java.util.Queue;
import java.util.LinkedList;

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

    public static int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                Node current = queue.poll();
                Node lt = current.lt;
                Node rt = current.rt;
                if (lt == null && rt == null) {
                    return l;
                }
                if (lt != null) {
                    queue.offer(lt);
                }
                if (rt != null) {
                    queue.offer(rt);
                }
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        트리_말단노드_최단거리 tree = new 트리_말단노드_최단거리();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        int result = tree.bfs(tree.root);
        System.out.println(result);
    }
}
