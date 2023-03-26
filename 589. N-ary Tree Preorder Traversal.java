/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();

        bfs(list, root);

        return list;
    }

    public void bfs(List<Integer> list, Node node) {

        if (node == null) return;
        list.add(node.val);
        node.children.forEach(child -> bfs(list, child));
    }
}