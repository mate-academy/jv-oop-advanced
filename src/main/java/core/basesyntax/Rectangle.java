package core.basesyntax;

public class Rectangle extends Figure {
    private final double diagonal;
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = (sideA * sideB);
        this.diagonal = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Rectangle: area: ")
                .append(area)
                .append(", color ")
                .append(color)
                .append(", diagonal ")
                .append(diagonal));
    }
}

