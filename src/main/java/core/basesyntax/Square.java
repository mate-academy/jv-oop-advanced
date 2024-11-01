package core.basesyntax;

public class Square extends Figure implements AreaCalculator {

    private int firstLag;

    public Square(String color, String name, int firstLag) {
        super(color, name);
        this.firstLag = firstLag;
    }

    @Override
    public int calculateArea() {
        return firstLag * firstLag;
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
