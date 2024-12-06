package org.howard.edu.lsp.finalexam.question3;

//ShapeFactory.java
/**
* Factory class for creating Shape objects. Implements Singleton pattern.
*/
public class ShapeFactory {
 private static ShapeFactory instance;

 private ShapeFactory() {}

 /**
  * Returns the singleton instance of ShapeFactory.
  * @return ShapeFactory instance
  */
 public static synchronized ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }
 
 /**
  * Creates a shape object based on the given shape type.
  * @param shapeType the type of shape to create
  * @return a Shape object or null if the type is unknown
  */
 public Shape createShape(String shapeType) {
     if (shapeType.equalsIgnoreCase("circle")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("rectangle")) {
         return new Rectangle();
     } else if (shapeType.equalsIgnoreCase("triangle")) {
         return new Triangle();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
         return null;
     }
 }
}
