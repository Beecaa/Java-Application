
package chapter_10_assignment.shapeHierachy;


  class Circle extends TwoDimensionalShape{
     private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override 
public String getDescription(){
    return "Circle with radius" + radius;
}   




}
