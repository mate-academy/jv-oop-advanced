package core.basesyntax;

public class Circle extends Figure implements Area {
    private double radius;
    public double getRadius() {return radius; }
    public void setRadius (double radius) {this.radius = radius; }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
