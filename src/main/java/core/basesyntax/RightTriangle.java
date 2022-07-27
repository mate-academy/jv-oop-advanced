package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int height, int side, String color) {
        this.firstLeg = height;
        this.secondLeg = side;
        this.color = color;
    }

    public void setSide(int side) {
        this.secondLeg = side;
    }

    public void setHeight(int height) {
        this.firstLeg = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSide() {
        return this.secondLeg;
    }

    public int getHeight() {
        return this.firstLeg;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t firstLeg - " + this.firstLeg + " units;"
                + "\n\t side - " + this.secondLeg + " units.";
    }
}
