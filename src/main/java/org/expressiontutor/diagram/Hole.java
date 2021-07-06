package org.expressiontutor.diagram;

public class Hole extends Fragment {
    
    private final Plug plug;

    public Hole(final Plug plug) {
        this.plug = plug;
    }

    @Override
    public Object getField() {
        return plug;
    }

}
