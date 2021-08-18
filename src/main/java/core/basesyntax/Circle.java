package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, InformationAboutFigure {
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
    public void figureInfo() {
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.radius + " units, color: "
                + getColor()
        );
    }
}
