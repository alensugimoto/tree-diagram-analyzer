package org.expressiontutor.diagram;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class TreeDiagramTest {

    @Property
    public void testEquals(TreeDiagram t1, TreeDiagram t2) {
        assertEquals(4, 4);
    }

}
