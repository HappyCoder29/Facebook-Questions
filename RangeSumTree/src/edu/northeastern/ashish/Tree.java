package edu.northeastern.ashish;

public class Tree {
    public Node root;

    public Tree(){
        createTree();
    }
    private void  createTree(){
        root = new Node(1);

        // first level
        root.left = new Node(2);
        root.right = new Node(3);

        // Second Level
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Third level

        root.left.left.left = new Node(8);
        root.left.right.left = new Node(9);
        root.right.left.right = new Node(10);
        root.right.right.right = new Node(11);

    }

    public int rangeSum(int start, int end){
        Ref<Integer> answer = new Ref<Integer>(0);
        rangeSum(root, answer, start, end);

        return answer.get();
    }
    private void rangeSum(Node node, Ref<Integer> answer,  int start, int end){
        if(node != null){
            if(node.data >= start && node.data <= end){
                answer.set(answer.get() + node.data);
            }
            rangeSum(node.left, answer, start, end);
            rangeSum(node.right, answer, start, end);

        }
    }
}
