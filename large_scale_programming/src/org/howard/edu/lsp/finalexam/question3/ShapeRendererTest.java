package org.howard.edu.lsp.finalexam.question3;

//ShapeRendererTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.IntegerSet;
import org.junit.jupiter.api.BeforeEach;

/**
* JUnit tests for the ShapeRenderer class.
*/
public class ShapeRendererTest {
	private Shape shape;
	
	@BeforeEach
	public void setUp() {
		shape = new Shape();
	}
	
    @Test
    public void testCircleCreation() {
        shape.getInstance().createShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        Shape shape = ShapeFactory.getInstance().createShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    public void testTriangleCreation() {
        Shape shape = ShapeFactory.getInstance().createShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    public void testUnknownShapeCreation() {
        Shape shape = ShapeFactory.getInstance().createShape("hexagon");
        assertNull(shape);
    }
}
