package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideOne;
    private final int sideTwo;
    private final int sideThree;

    public RightTriangle(String color, int sideOne, int sideTwo, int sideThree) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, side one: " + this.sideOne + ", side two: "
                + this.sideTwo + ", side three: " + this.sideThree + ". Color: " + this.color);
    }
}
