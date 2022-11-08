package core.basesyntax.Model;

public class Circle extends Figures {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getMeasure() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure Circle, measure: " + getMeasure()
                                        + ", Color: " + getColor()
                                    + " , Radius is: " + getRadius());

    }
}
