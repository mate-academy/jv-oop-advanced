import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private double firstBase;
    private double secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, String color) {
        super(color,"isosceles trapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public String draw() {
        return "Shape: " + getName() + ", area: " + getArea() + " sq. units"
                + ", firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " units , height: "
                + height + " units, color: " + getColor();
    }
}
