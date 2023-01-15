package core.basesyntax;

import java.util.Random;

public class HelloWorld {

    static enum Colors {
        White,
        Aquamarine,
        Azure,
        BurlyWood,
        CadetBlue,
        Gainsboro,
        Gold,
        Gray,
        Khaki,
        LawnGreen,
        LightGreen,
        LightSkyBlue,
        Linen,
        MediumOrchid,
        MediumPurple,
        MistyRose,
        Olive,
        OliveDrab,
        Orange,
        OrangeRed,
        Orchid,
        PaleTurquoise,
        Peru,
        Pink,
        Plum,
        RoyalBlue,
        SandyBrown,
        SeaGreen,
        SteelBlue;
    }
  
    static enum FiguresShape {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid;
    }

    interface FiguresBeh {
        final String default_color = "White";

        // all are the abstract methods.
        Figure getRandomFigure();
        
        Figure getDefaultFigure();
    }

    abstract class Figure {
        protected double square;
        protected String color;
        private ColorSupplier cs;

        public Figure(ColorSupplier cs) {
            this.cs = cs;
            this.color = this.cs.getRandomColor();
        }

        public Figure(String color) {
            this.cs = new ColorSupplier();
            this.color = color;
        }
        
        public abstract void draw();

    }

    class Square extends Figure {
        private double side;

        public Square(double side, ColorSupplier cs) {
            super(cs);
            this.side = side;
            this.square = side * side;
        }

        @Override
        public void draw() {
            System.out.println(this.getClass().getSimpleName() + ": square, area: "
                    + String.format("%.2f", square) + " sq.units, side: "
                    + String.format("%.2f", side) + " units, color: " + color);
        }
    }

    class Rectangle extends Figure {
        private double side1;
        private double side2;

        public Rectangle(double side1, double side2, ColorSupplier cs) {
            super(cs);
            this.side1 = side1;
            this.side2 = side2;
            this.square = side1 * side2;
        }

        @Override
        public void draw() {
            System.out.println(this.getClass().getSimpleName() + ": square, area: "
                    + String.format("%.2f", square) + " sq.units, side1: "
                    + String.format("%.2f", side1) + ", side2: "
                    + String.format("%.2f", side2) + " units, color: " + color);
        }
    }

    class Circle extends Figure {
        private double radius;
        private final double pi = 3.14159265359;

        public Circle(double radius, ColorSupplier cs) {
            super(cs);
            this.radius = radius;
            squareCalc();
        }

        public Circle(double radius, String color) {
            super(color);
            this.radius = radius;
            squareCalc();
        }

        private void squareCalc() {
            this.square = pi * radius * radius;
        }

        @Override
        public void draw() {
            System.out.println(this.getClass().getSimpleName() + ": square, area: "
                    + String.format("%.2f", square) + " sq.units, radius: "
                    + String.format("%.2f", radius) + " units, color: " + color);
        }
    }

    class RightTriangle extends Figure {
        private double firstLeg;
        private double secondLeg;

        public RightTriangle(double firstLeg, double secondLeg, ColorSupplier cs) {
            super(cs);
            this.firstLeg = firstLeg;
            this.secondLeg = secondLeg;
            this.square = (firstLeg * secondLeg) / 2;
        }

        @Override
        public void draw() {
            System.out.println(this.getClass().getSimpleName() + ": square, area: "
                    + String.format("%.2f", square) + " sq.units, firstLeg: "
                    + String.format("%.2f", firstLeg) + ", secondLeg: "
                    + String.format("%.2f", secondLeg) + " units, color: " + color);
        }
    }

    class IsoscelesTrapezoid extends Figure {
        private double firstLeg;
        private double secondLeg;
        private double height;

        public IsoscelesTrapezoid(double firstLeg, double secondLeg, 
                                  double height, ColorSupplier cs) {
            super(cs);
            this.firstLeg = firstLeg;
            this.secondLeg = secondLeg;
            this.height = height;
            this.square = ((firstLeg + secondLeg) / 2) * height;
        }

        @Override
        public void draw() {
            System.out.println(this.getClass().getSimpleName() + ": square, area: "
                    + String.format("%.2f", square) + " sq.units, firstLeg: "
                    + String.format("%.2f", firstLeg)
                    + ", secondLeg: " + String.format("%.2f", secondLeg) + ", height: "
                    + String.format("%.2f", height) + " units, color: " + color);
        }
    }

    class FigureSupplier implements FiguresBeh {

        private ColorSupplier cs;

        public FigureSupplier() {
            this.cs = new ColorSupplier();
        }

        public Figure getRandomFigure() {
            Random random = new Random();
            FiguresShape[] figureshape = FiguresShape.values();
            Figure fg = null;
            switch (figureshape[random.nextInt(figureshape.length - 1)].toString()) {
                case "Square": {
                    fg = new Square(random.nextDouble() * 100, cs);
                    break;
                }
                case "Rectangle": {
                    fg = new Rectangle(random.nextDouble() * 100, random.nextDouble() * 100, cs);
                    break;
                }
                case "RightTriangle": {
                    fg = new RightTriangle(random.nextDouble() * 100, random.nextDouble() * 100,
                        cs);
                    break;
                }
                case "Circle": {
                    fg = new Circle(random.nextDouble() * 100, cs);
                    break;
                }
                case "IsoscelesTrapezoid": {
                    fg = new IsoscelesTrapezoid(random.nextDouble() * 100, random.nextDouble()
                        * 100,
                        random.nextDouble() * 100, cs);
                    break;
                }
                default: {
                }
            }
            return fg;

        }

        public Figure getDefaultFigure() {
            return new Circle(10.0, default_color);
        }

    }

    class ColorSupplier {

        public String getRandomColor() {
            Random random = new Random();
            Colors[] colors = Colors.values();
            return colors[random.nextInt(colors.length - 1)].toString();
        }
    }

    public static void main(String[] args) {

        HelloWorld.Figure[] figuresarr = new HelloWorld.Figure[6];
        HelloWorld app = new HelloWorld();
        HelloWorld.FigureSupplier fs = app.new FigureSupplier();
        for (int i = 0; i < figuresarr.length; i++) {
            figuresarr[i] = i < figuresarr.length / 2 ? fs.getRandomFigure()
                : fs.getDefaultFigure();
            figuresarr[i].draw();
        }

    }
}
