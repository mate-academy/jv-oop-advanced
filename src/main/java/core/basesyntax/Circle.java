package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, InfoFigure {
    private final String name = "circle";
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.radius + " units, "
        );
    }


}
