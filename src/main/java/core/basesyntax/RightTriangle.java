package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements FindArea {
    private int firsLeg;
    private int secondLeg;
    private double thirdLeg;

    public RightTriangle() {
        super();
        this.firsLeg = new Random().nextInt(1, 10);
        this.secondLeg = new Random().nextInt(1, 10);
        this.thirdLeg = Math.sqrt(Math.pow(firsLeg, 2) + Math.pow(secondLeg, 2));
    }

    @Override
    public double getArea() {
        return (double) firsLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("\nRight triangle "
                + "color: " + this.getColor()
                + " area: " + this.getArea()
                + " first leg: " + firsLeg
                + " second leg: " + secondLeg
                + " third leg: " + thirdLeg);
    }
}
