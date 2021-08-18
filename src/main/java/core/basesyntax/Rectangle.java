package core.basesyntax;

public class Rectangle extends Figure {
    private static final int MAX_SIDE = 20;
    private int sideA;
    private int sideB;

    public Rectangle() {
        sideA = this.getRandom().nextInt(MAX_SIDE);
        sideB = this.getRandom().nextInt(MAX_SIDE);
        this.setColor();
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public Double getArea() {
        return (double)sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.format("Figure: rectangle, area: %f, sideA: %d, sideB: %d, color: %s",
                this.getArea(), this.getSideA(), this.getSideB(), this.getColor());
    }
}
