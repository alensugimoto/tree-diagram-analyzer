package org.expressiontutor.diagram;

public class FragName extends Fragment {
    
    private final String name;

    public FragName(final String name) {
        this.name = name;
    }

    @Override
    public Object getField() {
        return name;
    }

}
