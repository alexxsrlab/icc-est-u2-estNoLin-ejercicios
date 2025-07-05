package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        ///EXPLICARE MAS O MENOS LO QUE HACE CADA LINEA DE CODIGO 

        // EJERCICIO 1
        System.out.println("EJERCICIO 1  ");
        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");

        InsertBST insertBST = new InsertBST();
        Node root1 = null;
        root1 = insertBST.insert(root1, 5); // Insertar raiz
        int[] values1 = { 3, 7, 2, 4, 6, 8 }; // Valores a insertar
        for (int v : values1) {
            root1 = insertBST.insert(root1, v); // Insertar cada valor en BST
        }

        System.out.println("Output:");
        printLevels(root1); // Imprimir arbol por niveles
        System.out.println();

        // EJERCICIO 2
        System.out.println("EJERCICIO 2");
        System.out.println("Input: ");
        // Construimos el arbol
        Node root2 = new Node(4);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(7));
        root2.getLeft().setLeft(new Node(1));
        root2.getLeft().setRight(new Node(3));
        root2.getRight().setLeft(new Node(6));
        root2.getRight().setRight(new Node(9));
        printLevels(root2); // Imprime el arbol original

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        Node inverted = invertBinaryTree.invertTree(root2); // Invierte el arbol

        System.out.println("Output:");
        printLevels(inverted); // Imprime el arbol invertido
        System.out.println();

        // EJERCICIO 3
        System.out.println("EJERCICIO 3");
        System.out.println("Input: ");
        Node root3 = new Node(4);
        root3.setLeft(new Node(2));
        root3.setRight(new Node(7));
        root3.getLeft().setLeft(new Node(1));
        root3.getLeft().setRight(new Node(3));
        root3.getRight().setLeft(new Node(6));
        root3.getRight().setRight(new Node(9));
        printLevels(root3); // Imprime el arbol original

        System.out.println("Output:");
        ListLevels listLevels = new ListLevels();
        List<List<Node>> levels = listLevels.listLevels(root3); // Obtiene la lista de niveles
        for (List<Node> level : levels) {
            for (Node node : level) {
                System.out.print(node.getValue() + " "); // Imprime valores por nivel
            }
            System.out.println();
        }
        System.out.println();

        // EJERCICIO 4
        System.out.println("EJERCICIO 4");
        System.out.println("Input: ");
        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        root4.getLeft().getLeft().setLeft(new Node(8));
        printLevels(root4); // Imprime el arbol

        Depth depth = new Depth();
        int maxDepth = depth.maxDepth(root4); // Calcula la profundidad maxima
        System.out.println("Output: " + maxDepth);
    }

    // Método para imprimir el arbol por niveles
    public static void printLevels(Node root) {
        ListLevels listLevels = new ListLevels();
        List<List<Node>> levels = listLevels.listLevels(root); // Obtiene nodos por niveles
        for (List<Node> level : levels) {
            for (Node node : level) {
                System.out.print(node.getValue() + " "); // Imprime valores de un nivel
            }
            System.out.println(); 
        }
    }
}
