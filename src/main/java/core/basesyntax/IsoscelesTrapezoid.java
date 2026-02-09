package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        int averageBase = topBase + bottomBase / 2;
        return averageBase * height;
    }

    public static IsoscelesTrapezoid getReandomIsoscelesTrapezoid() {
        Random random = new Random();

        String randomColor = new ColorSupplier().getRandomColor();
        int randomTopBase = random.nextInt(VALUES_BOUND);
        int randomBottomBase = random.nextInt(VALUES_BOUND);
        int randomHeight = random.nextInt(VALUES_BOUND);
        return new IsoscelesTrapezoid(randomColor, randomTopBase, randomBottomBase, randomHeight);
    }

    @Override
    public void draw() {
        System.out.println(
                getClass().getName()
                        + "{"
                        + "color="
                        + getColor()
                        + " topBase="
                        + topBase
                        + " bottomBase="
                        + bottomBase
                        + " area="
                        + getArea()
                        + "}"
        );
    }
}
