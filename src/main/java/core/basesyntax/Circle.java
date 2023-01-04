package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
        super.setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void printInfoAboutFigures() {
        super.printInfoAboutFigures();
        System.out.println("radius " + radius);
    }
}
