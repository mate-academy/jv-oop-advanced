package core.basesyntax;

public class Circle extends FigureForm {
    private double radius;
    private String color;

    public Circle(double radius, Color randomColor) {
        this.radius = radius;
        randomColor = Color.valueOf(ColorSupplier.getRandomColor());
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        color = Color.WHITE.name();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Figure.Circle + ", area: " + getArea() + " sq.units, "
                + "side: " + radius + " units, " + "color: " + color);
    }
}
