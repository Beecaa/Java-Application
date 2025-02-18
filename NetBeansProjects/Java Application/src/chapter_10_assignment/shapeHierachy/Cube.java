
package chapter_10_assignment.shapeHierachy;


 class Cube extends ThreeDimensionalShape {
     private double side;
     public Cube(double side){
         this.side = side;
     }
    @Override public double getArea(){
        return 6 * side * side;
    }
    @Override public double getVolume(){
        return 6* side * side * side;
    }
    @Override public String getDescription(){
        return "Cube with sides" + side;
    }
}
