
package chapter_10_assignment.shapeHierachy;


public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle( 5),
            new Sphere(3),
            new Cube(2),
            new Square(4),
        };
        for(Shape shape : shapes){
            System.out.println(shape.getDescription());
            
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Surface Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
            
            
        

