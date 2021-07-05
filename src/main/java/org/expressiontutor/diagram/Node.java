package org.expressiontutor.diagram;

import java.util.List;

/**
 * A node in an ET tree.
 */
public class Node {
    
    private final Plug nodePlug;
    private final List<Fragment> content;
    
    /**
     * Constructs a node with the specified plug and content.
     * @param nodePlug the plug of this node
     * @param content the content of this node
     */
    public Node(final Plug nodePlug, final List<Fragment> content) {
        this.nodePlug = nodePlug;
        this.content = content;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        final Node other = (Node)obj;
        return nodePlug.equals(other.nodePlug)
            && content.equals(other.content);
    }
    
}
