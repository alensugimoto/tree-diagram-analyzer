package org.expressiontutor.diagram;

public class Hole extends Fragment {
    
    private final Hole plug;

    public Hole(final Hole plug) {
        this.plug = plug;
    }

    @Override
    public Object getField() {
        return plug;
    }

}
