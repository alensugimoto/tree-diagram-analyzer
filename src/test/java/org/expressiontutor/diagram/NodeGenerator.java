package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.Size;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.List;

public class NodeGenerator extends Generator<Node> {

    private static final @Size(min = 3, max = 30) List<Fragment> CONTENT = null;

    public NodeGenerator() {
        super(Node.class);
    }

    @Override
    public Node generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<Plug> nodePlug = gen().type(Plug.class);
        @SuppressWarnings("unchecked")
        Generator<List<Fragment>> content = 
            (Generator<List<Fragment>>) gen().field(getClass(), "CONTENT");
        return new Node(nodePlug.generate(r, s), content.generate(r, s));
    }

}
