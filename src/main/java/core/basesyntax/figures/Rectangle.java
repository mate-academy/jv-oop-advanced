package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle. Color: " + getColor()
                + ". Area: " + calculateArea() + ". First side: "
                + firstSide + ". Second side: " + secondSide + '.');
    }

    @Override
    double calculateArea() {
        return firstSide * secondSide;
    }
}
