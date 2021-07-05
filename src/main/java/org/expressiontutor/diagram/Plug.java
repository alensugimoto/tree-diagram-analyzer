package org.expressiontutor.diagram;

public class Plug {
    
    private final int i;
    private final int j;
    
    public Plug(final int i, final int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Plug)) {
            return false;
        }
        final Plug other = (Plug)obj;
        return i == other.i && j == other.j;
    }
    
}
