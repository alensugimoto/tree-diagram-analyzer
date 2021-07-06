package org.expressiontutor;

import org.expressiontutor.diagram.TreeDiagram;

public class App {
    public static void main(final String[] args) {
        TreeDiagram t1 = new TreeDiagram(null, null, null);
        TreeDiagram t2 = new TreeDiagram(null, null, null);
        System.out.println(t1.equals(t2));
    }
}
