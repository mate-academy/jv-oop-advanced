package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
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
        System.out.println("Figure: "
                + this.type.name().toLowerCase()
                + ", area: "
                + (firstSide * secondSide)
                + " units, first side "
                + firstSide
                + " units, second side "
                + secondSide
                + " units, color: "
                + this.color.name().toLowerCase());
    }
}
