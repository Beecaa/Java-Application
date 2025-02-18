
package chapter_10_assignment.shapeHierachy;


 class Square extends TwoDimensionalShape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override public double getArea(){
        return side*side;
    }
    @Override public String getDescription(){
        return "Square with side" + side;
    }
}
