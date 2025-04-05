package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.type.name().toLowerCase()
                + ", area: "
                + (((firstSide + secondSide) / 2) * height)
                + " units, first side: "
                + firstSide
                + " units, second side: "
                + secondSide
                + " units, height: "
                + height
                + " units, color: "
                + this.color.name().toLowerCase());
    }
}
