package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int height, int secondLeg, String color) {
        this.firstLeg = height;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    @Override
    public int countArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + countArea() + " sq. units;"
                + "\n\t firstLeg - " + firstLeg + " units;"
                + "\n\t side - " + secondLeg + " units.";
    }
}
