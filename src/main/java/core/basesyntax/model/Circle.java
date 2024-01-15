package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(System.lineSeparator()).append(
                        "This is a CIRCLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Radius = ").append(radius)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
