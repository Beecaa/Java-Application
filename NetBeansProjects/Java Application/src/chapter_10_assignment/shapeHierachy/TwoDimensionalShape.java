
package chapter_10_assignment.shapeHierachy;


abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();
    
    @Override public String getDescription(){
        return "this is a two dimensional shape.";
    }
}
