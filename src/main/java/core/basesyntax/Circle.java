package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        super.setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.print("Name: circle");
        super.draw();
        System.out.println("radius " + radius);
    }
}
