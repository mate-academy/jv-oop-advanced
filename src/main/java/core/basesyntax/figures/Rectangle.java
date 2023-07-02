package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.firstSide = length;
        this.secondSide = width;
    }

    @Override
    public double getFigureArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first side: " + firstSide
                + ", second side: " + secondSide
                + ", area: " + getFigureArea()
                + ".");
    }
}
