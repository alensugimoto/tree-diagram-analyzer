package org.expressiontutor.diagram;

import java.util.Optional;
import java.util.Set;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.Size;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class TreeDiagramGenerator extends Generator<TreeDiagram> {

    private static final @Size(min = 3, max = 30) Set<Node> NODES = null;
    private static final @Size(min = 3, max = 30) Set<Edge> EDGES = null;

    public TreeDiagramGenerator() {
        super(TreeDiagram.class);
    }

    @Override
    public TreeDiagram generate(SourceOfRandomness r, GenerationStatus s) {
        @SuppressWarnings("unchecked")
        Generator<Set<Node>> nodes = (Generator<Set<Node>>) gen().field(getClass(), "NODES");
        @SuppressWarnings("unchecked")
        Generator<Set<Edge>> edges = (Generator<Set<Edge>>) gen().field(getClass(), "EDGES");
        Generator<Optional> root = gen().type(Optional.class, Node.class);
        return new TreeDiagram(
            nodes.generate(r, s),
            edges.generate(r, s),
            root.generate(r, s));
    }
}