package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {

    private int firstLag;
    private int secondLag;

    public Rectangle(String color, String name, int firstLag, int secondLag) {
        super(color, name);
        this.firstLag = firstLag;
        this.secondLag = secondLag;
    }

    @Override
    public int calculateArea() {
        return firstLag * secondLag;
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
                + "secondLag: "
                + secondLag
                + ", "
                + "color: "
                + super.getColor();
    }

}
