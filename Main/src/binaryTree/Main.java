package binaryTree;

public class Main {
    public static void main(String[] args) {
        int array [] = {7,15,13,14,3,74,15641,185,4156,176,1,2,5,45,97,18,9664,63,123,41};
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < array.length; i++) {
            binaryTree.insert(array[i]);
        }
        System.out.println(binaryTree.search(7));
        binaryTree.inorder();
        binaryTree.deleteKey(7);
    }
}
