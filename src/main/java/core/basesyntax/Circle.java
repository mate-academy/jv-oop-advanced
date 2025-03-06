package core.basesyntax;

public class Circle extends Figure implements Area {
    private double radius;

    public Circle(Color color, double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            System.out.println("Promień nie może być mniejszy od 0");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        System.out.println("Circle color: " + getColor() + " Promień wynosi: " + getRadius());
        return super.toString();
    }
}
