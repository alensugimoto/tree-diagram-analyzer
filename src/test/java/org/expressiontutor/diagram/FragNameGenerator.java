package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class FragNameGenerator extends Generator<FragName> {

    public FragNameGenerator() {
        super(FragName.class);
    }

    @Override
    public FragName generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<String> name = gen().type(String.class);
        return new FragName(name.generate(r, s));
    }

}
