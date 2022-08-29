package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    private String getFigureName() {
        String figureFullName = this.getClass().getName();
        int lastIdx = figureFullName.lastIndexOf('.');
        return figureFullName.substring(lastIdx + 1);
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureName();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor();
    }

}
