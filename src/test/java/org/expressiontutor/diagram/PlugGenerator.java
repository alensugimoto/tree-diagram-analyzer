package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class PlugGenerator extends Generator<Plug> {

    public PlugGenerator() {
        super(Plug.class);
    }

    @Override
    public Plug generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<Integer> i = gen().type(int.class);
        return new Plug(i.generate(r, s), i.generate(r, s));
    }

}
