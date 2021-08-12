package core.classes;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Circle extends Figure implements AreaCalculator, Draw {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * PI * radius;
    }

    @Override
    public void drawing() {
        DecimalFormat decimalFormat = new DecimalFormat( "#.#" );
        System.out.println("Figure: " + this.name + ", area: " + decimalFormat.format(area()) + " sq.units, radius: " +
                radius + " units, " + "color: " + this.color);
    }
}
