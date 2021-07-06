package org.expressiontutor.diagram;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class TokenGenerator extends Generator<Token> {

    public TokenGenerator() {
        super(Token.class);
    }

    @Override
    public Token generate(SourceOfRandomness r, GenerationStatus s) {
        Generator<String> name = gen().type(String.class);
        return new Token(name.generate(r, s));
    }

}
