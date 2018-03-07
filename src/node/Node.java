package no;

/**
 *
 * @author ivan
 */
public class Node {

    public static void main(String[] args) {

        new Node().run();
    }

    private static class BinaryTree {

        BinaryTree left;
        BinaryTree right;
        int valor;

        public BinaryTree(int valor) {
            this.valor = valor;
        }
    }

    private void run() {
        BinaryTree raiz = new BinaryTree(8);
        nodeInsert(raiz, 10);
        nodeInsert(raiz, 3);
        nodeInsert(raiz, 14);
        nodeInsert(raiz, 13);
        nodeInsert(raiz, 1);
        nodeInsert(raiz, 6);
        nodeInsert(raiz, 4);
        nodeInsert(raiz, 7);

    }

    private void nodeInsert(BinaryTree node, int valor) {
        if (valor < node.valor) {
            if (node.left != null) {
                nodeInsert(node.left, valor);
            } else {
                node.left = new BinaryTree(valor);
            }
        } else if (valor > node.valor) {
            if (node.right != null) {
                nodeInsert(node.right, valor);
            } else {
                node.right = new BinaryTree(valor);
            }
        }
    }

}
