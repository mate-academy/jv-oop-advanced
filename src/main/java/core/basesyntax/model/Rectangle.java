package core.basesyntax.model;

import core.basesyntax.model.Figure;
public class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(String color,double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double getLength() {return length;}

    public void setLength(double length) {this.length = length;}
    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public void draw(){
        System.out.println("Figure " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor() + ", length: " + getLength() + ", width: " + getWidth());
    }
}
