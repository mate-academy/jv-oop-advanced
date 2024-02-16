package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double base;
    private double height;

    public Rectangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("base: " + base + " units, height: " + height + " units");
    }
}
