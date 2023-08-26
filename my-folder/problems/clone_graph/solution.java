/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    public Node dfs(Node node, Map<Node, Node> map){
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node copy = new Node(node.val);
        map.put(node, copy);
        for(Node ne : node.neighbors){
            copy.neighbors.add(dfs(ne, map));
        }
        return copy;
    }
}