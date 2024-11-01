package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLag;

    public RightTriangle(String color, String name, int firstLag) {
        super(color, name);
        this.firstLag = firstLag;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.pow(firstLag, 2) * (Math.sqrt(3)) / 4);
    }

    @Override
    public String toString() {
        return "Figure:"
                + "name: "
                + super.getName()
                + ", "
                + "area: "
                + calculateArea()
                + " sq. units, "
                + "firstLag: "
                + firstLag
                + ", "
                + "color: "
                + super.getColor();
    }

}
