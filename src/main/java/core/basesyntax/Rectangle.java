package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    {
        setName("rectangle");
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super(new ColorSupplier().getRandomColor());
        Random random = new Random();
        this.width = random.nextInt(Figure.MAX_RANDOM_SIDE_VALUE);
        this.height = random.nextInt(Figure.MAX_RANDOM_SIDE_VALUE);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.1f sq.units, width: %.1f units, height: %.1f units, color: %s\n",
                getName(), getArea(), width, height, getColor());
    }
}
