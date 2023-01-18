package core.basesyntax;

public class Circle extends Figure {
    public double radius;
    public Circle(String color , double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, area: " + getAriaCalculation() + " sq.units, radius: " + radius + " units, color: " + color);
    }
    @Override
    public double getAriaCalculation() {
        return  Math.PI * radius * 2;
    }
}

