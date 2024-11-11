package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getS() {
        return side1 * side2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Прямокутник { сторона1 = " + this.side1 + ", сторона2 = " + this.side2
                            + ", площа = " + getS() + ", колір - " + getColor() + " }");
    }
}
