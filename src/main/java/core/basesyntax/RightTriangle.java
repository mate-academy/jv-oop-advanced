package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int height, int secondLeg, String color) {
        this.firstLeg = height;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    public void setSide(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setHeight(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getsecondLeg() {
        return this.secondLeg;
    }

    public int getfirstLeg() {
        return this.firstLeg;
    }

    @Override
    public int countArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t firstLeg - " + this.firstLeg + " units;"
                + "\n\t side - " + this.secondLeg + " units.";
    }
}
