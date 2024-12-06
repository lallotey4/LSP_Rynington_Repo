package org.howard.edu.lsp.finalexam.question3;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("circle");
        assertNotNull(shape, "Circle should be instantiated");
        assertTrue(shape instanceof ShapeFactory.Circle, "Shape should be an instance of Circle");
    }

    @Test
    public void testRenderRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("rectangle");
        assertNotNull(shape, "Rectangle should be instantiated");
        assertTrue(shape instanceof ShapeFactory.Rectangle, "Shape should be an instance of Rectangle");
    }

    @Test
    public void testRenderTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("triangle");
        assertNotNull(shape, "Triangle should be instantiated");
        assertTrue(shape instanceof ShapeFactory.Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    public void testRenderUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("hexagon");
        assertNull(shape, "Unknown shape should return null");
    }

    @Test
    public void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "ShapeFactory should be a singleton");
    }
}
