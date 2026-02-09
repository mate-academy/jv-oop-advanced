package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    public static RightTriangle getRandomRightRectangle() {
        Random random = new Random();
        String randomColor = new ColorSupplier().getRandomColor();
        int randomfirstLeg = random.nextInt(VALUES_BOUND);
        int randomsecondLeg = random.nextInt(VALUES_BOUND);
        return new RightTriangle(randomColor, randomfirstLeg, randomsecondLeg);
    }

    @Override
    public void draw() {
        System.out.println(
                getClass().getName()
                        + "{"
                        + "color="
                        + getColor()
                        + " firstLeg="
                        + firstLeg
                        + " secondLeg="
                        + secondLeg
                        + " area="
                        + getArea()
                        + "}"
        );
    }
}
