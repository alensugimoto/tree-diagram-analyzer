package org.expressiontutor.diagram;

public abstract class Fragment {

    public abstract Object getField();

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fragment)) {
            return false;
        }
        final Fragment other = (Fragment)obj;
        return getField().equals(other.getField());
    }

}
