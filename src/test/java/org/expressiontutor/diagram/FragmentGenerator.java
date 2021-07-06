package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class FragmentGenerator extends Generator<Fragment> {

    public FragmentGenerator() {
        super(Fragment.class);
    }

    @Override
    public Fragment generate(SourceOfRandomness r, GenerationStatus s) {
        @SuppressWarnings("unchecked")
        Generator<Fragment> fragment = (Generator<Fragment>) gen().oneOf(FragName.class, Hole.class, Token.class);
        return fragment.generate(r, s);
    }

}
