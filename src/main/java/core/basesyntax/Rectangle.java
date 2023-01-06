package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(Shape.RECTANGLE, color);
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
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getShape() + ", area: " + this.getArea()
                + " sq.units, left/right side: " + firstSide + " sq.units, bottom/top side: "
                + secondSide + " sq.units, color: " + this.getColor();
    }
}
