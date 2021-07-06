package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class HoleGenerator extends Generator<Hole> {

    public HoleGenerator() {
        super(Hole.class);
    }

    @Override
    public Hole generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<Plug> plug = gen().type(Plug.class);
        return new Hole(plug.generate(r, s));
    }

}
