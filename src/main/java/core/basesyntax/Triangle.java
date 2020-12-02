package core.basesyntax;

public class Triangle extends Figure implements Drawable {

    private double hypotenuse;
    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = (sideA * sideB) / 2;
        this.hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Triangle: area: ")
                .append(area)
                .append(", color: ")
                .append(color)
                .append(", hypotenuse: ")
                .append(hypotenuse));
    }
}
