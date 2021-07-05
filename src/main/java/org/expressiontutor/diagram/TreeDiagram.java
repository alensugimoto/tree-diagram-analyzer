package org.expressiontutor.diagram;

import java.util.Optional;
import java.util.Set;

/**
 * A diagram of a tree in Expression Tutor.
 */
public class TreeDiagram {
    
    private final Set<Node> nodes;
    private final Set<Edge> edges;
    private final Optional<Node> root;
    
    /**
     * Constructs a new diagram with the given nodes, edges, and root.
     * @param nodes the nodes in this diagram
     * @param edges the edges in this diagram
     * @param root  the root of this diagram
     */
    public TreeDiagram(final Set<Node> nodes, final Set<Edge> edges, final Optional<Node> root) {
        this.nodes = nodes;
        this.edges = edges;
        this.root = root;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeDiagram)) {
            return false;
        }
        final TreeDiagram other = (TreeDiagram)obj;
        return nodes.equals(other.nodes)
            && edges.equals(other.edges)
            && root.equals(other.root);
    }
    
}
