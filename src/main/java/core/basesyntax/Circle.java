package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(){
    }
    public Circle(int radius,String  color) {
        this.radius = radius;
        setColor(color);
        setArea(obtainArea());
    }

    @Override
    public double obtainArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " +  radius + " units, color: " + getColor());
    }
}
