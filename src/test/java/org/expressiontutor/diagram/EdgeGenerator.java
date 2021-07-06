package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class EdgeGenerator extends Generator<Edge> {

    public EdgeGenerator() {
        super(Edge.class);
    }

    @Override
    public Edge generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<Plug> plug = gen().type(Plug.class);
        return new Edge(plug.generate(r, s), plug.generate(r, s));
    }

}
