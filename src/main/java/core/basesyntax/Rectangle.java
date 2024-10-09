package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
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
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void toDraw() {
        System.out.println("The Figure: Rectangle; First side = " + firstSide
                + "   Second side = " + secondSide + "/n" + " Area: " + getArea()
                + "/n" + "; Color: " + getColor());
    }
}
