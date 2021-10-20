package core.basesyntax;

public class Rectangle extends Figure implements Areacount {
    private int breadth;
    private int length;

    public Rectangle(int breadth,int length,String color) {
        this.breadth = breadth;
        this.length = length;
        setColor(color);
    }

    @Override
    public double getArea() {
        return breadth * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "area: " + getArea() + " || " + "color: " + getColor() + '}';
    }
}
