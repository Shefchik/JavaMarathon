package day18;

import com.sun.source.tree.BinaryTree;

public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree(new Node(20));

        tree.Add(tree.getTreeHead(), 14);
        tree.Add(tree.getTreeHead(), 11);
        tree.Add(tree.getTreeHead(), 5);
        tree.Add(tree.getTreeHead(), 8);
        tree.Add(tree.getTreeHead(), 16);
        tree.Add(tree.getTreeHead(), 15);
        tree.Add(tree.getTreeHead(), 18);
        tree.Add(tree.getTreeHead(), 23);
        tree.Add(tree.getTreeHead(), 22);
        tree.Add(tree.getTreeHead(), 27);
        tree.Add(tree.getTreeHead(), 24);
        tree.Add(tree.getTreeHead(), 150);
        tree.dfs(tree.getTreeHead());

    }
// 5 8 11 14 15 16 18 20 22 23 24 27 150

}
