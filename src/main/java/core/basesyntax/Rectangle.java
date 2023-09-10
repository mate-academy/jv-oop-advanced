package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public int getArea() {
        return firstSide * secondSide;
    }

    @Override
    public int getPerimeter() {
        return firstSide * 2 + secondSide * 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first side: " + firstSide
                + ", second side: " + secondSide);
    }
}
