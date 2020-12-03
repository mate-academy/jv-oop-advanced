package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(Color color, int legA, int legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    public int getLegA() {
        return legA;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("THIS IS RIGHT TRIANGLE");
    }

    @Override
    public String displayInformation() {
        return "Figure: Right triangle, area: " + getArea()
                + " sq. units, the leg A length: " + legA
                + " units, the leg B length: " + legB + " units, color: " + getColor();
    }
}

