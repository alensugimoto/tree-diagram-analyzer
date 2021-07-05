package org.expressiontutor.diagram;

public class Edge {

    private final Plug plug1;
    private final Plug plug2;
    
    public Edge(final Plug plug1, final Plug plug2) {
        this.plug1 = plug1;
        this.plug2 = plug2;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Edge)) {
            return false;
        }
        final Edge other = (Edge)obj;
        return (plug1.equals(other.plug1) && plug2.equals(other.plug2))
            || (plug1.equals(other.plug2) && plug2.equals(other.plug1));
    }
    
}
