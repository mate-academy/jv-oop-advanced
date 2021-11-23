package core.basesyntax;

public class Circle extends Figures {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "circle " + "area: " + getArea()
                + " sq.units,  radius: " + radius + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
