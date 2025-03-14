package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double printArea() {
        return ((firstSide + secondSide) * height) / 2.0;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: isosceles trapezoid, area: " + printArea();
        String secondPart = " sq. units, shorter site: " + firstSide;
        String thirdPart = " units, longer site: " + secondSide + " units, height: ";
        String fourthPart = height + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart + fourthPart);
    }
}
