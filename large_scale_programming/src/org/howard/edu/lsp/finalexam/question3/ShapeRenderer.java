package org.howard.edu.lsp.finalexam.question3;

//ShapeRenderer.java
/**
* Class responsible for rendering shapes.
*/
public class ShaperRenderer {
	private final ShapeFactory factory;

    public ShapeRenderer() {
        this.factory = ShapeFactory.getInstance();
    }

    /**
     * Renders a shape based on the given type.
     * @param shapeType the type of shape to render
     */
    public void renderShape(String shapeType) {
        Shape shape = factory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        }
}
//Chat GPT
