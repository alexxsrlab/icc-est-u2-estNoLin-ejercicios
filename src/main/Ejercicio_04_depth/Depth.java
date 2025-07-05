package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    //EXPLICACION DEL METODO EN EXPLICACION.md
    
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        return Math.max(left, right) + 1;
    }
}