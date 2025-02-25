package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideOne;
    private final int sideTwo;
    private final int sideThree;

    public IsoscelesTrapezoid(String color, int sideOne, int sideTwo, int sideThree) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, side one: " + sideOne + ", side two: "
                + sideTwo + " side three: " + sideThree + ". Color: " + color);
    }
}
