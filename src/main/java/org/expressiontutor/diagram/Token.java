package org.expressiontutor.diagram;

public class Token extends Fragment {
    
    private final String text;

    public Token(final String text) {
        this.text = text;
    }

    @Override
    public Object getField() {
        return text;
    }
    
}
