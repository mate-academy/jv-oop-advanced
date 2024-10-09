package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
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
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("The Figure: Circle; radius = " + radius
                +  "\n" + " Area: " + getArea()
                + "; Color: " + getColor() + "\n");
    }
}
