package day18;

public class Tree {
    private Node treeHead;

    public void Add(Node treeHead, int value) {
        if (this.treeHead == null) {
            this.treeHead = new Node(value);
        } else {
            AddTo(this.treeHead, value);
        }
    }

    public Node getTreeHead() {
        return treeHead;
    }

    public void setTreeHead(Node treeHead) {
        this.treeHead = treeHead;
    }

    public Tree(Node treeHead) {
        this.treeHead = treeHead;
    }

    private void AddTo(Node node, int value) {

        if (node.CompareTo(value) == 1) {
            if (node.getLeftNode() == null) {
                node.setLeftNode(new Node(value));
                //System.out.println("parent node = " + node.getValue() + " left node = " + node.getLeftNode().getValue());
            } else {
                AddTo(node.getLeftNode(), value);
            }
        } else {
            if (node.getRightNode() == null) {
                node.setRightNode(new Node(value));
                //System.out.println("parent node = " + node.getValue() + " right node = " + node.getRightNode().getValue());
            } else {
                AddTo(node.getRightNode(), value);
            }
        }
    }
    public void dfs(Node node){

        if (node.getLeftNode() != null){
            dfs(node.getLeftNode());
        }
        System.out.println(node.getValue());
        if (node.getRightNode() != null){
            dfs(node.getRightNode());

        }
    }
}