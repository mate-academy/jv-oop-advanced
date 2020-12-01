package core.basesyntax.figures;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle() {
        super();
        this.sideA = random.nextInt(20) + 1;
        this.sideB = random.nextInt(20) + 1;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.format("Figure: rectangle, perimeter: %.2f"
                        + ", area: %.2f"
                        + " sq. units, sideA: %.2f", getPerimeter(), getArea(), getSideA());
        System.out.format(" units, sideB: %.2f"
                        + " units, diagonal: %.2f"
                        + " units, color: %s.%n", getSideB(), getDiagonal(), getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}
