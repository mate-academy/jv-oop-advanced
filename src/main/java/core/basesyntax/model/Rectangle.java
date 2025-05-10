package core.basesyntax.model;

public class Rectangle extends Figure {
    private int wight;
    private int length;

    public Rectangle(String color, int wight, int length) {
        super(color);
        this.wight = wight;
        this.length = length;
    }

    @Override
    public double getArea() {
        return wight * length;
    }

    @Override
    public void draw() {
        String name = getClass().getSimpleName();
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: " + name + ", area: " + area + " eq. units, color: " + color);
    }
}
