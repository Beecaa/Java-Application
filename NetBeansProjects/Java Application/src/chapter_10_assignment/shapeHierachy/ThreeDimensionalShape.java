
package chapter_10_assignment.shapeHierachy;


abstract class ThreeDimensionalShape extends Shape{
public abstract double getArea();
public abstract double getVolume();

@Override public String getDescription(){
return "this is a three dimensional shape.";
}

}

