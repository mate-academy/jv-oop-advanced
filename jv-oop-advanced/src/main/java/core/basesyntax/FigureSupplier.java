package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static int side = 0;
    private static int firstleg = 0;
    private static int secondleg = 0;
    private static final Form[] forms = Form.values();
    private static Figure figures;

    public static Form getRandomForm() {
        int index = random.nextInt(forms.length);
        return forms[index];
    }

    public static <side, firstleg, secondleg> Figure getRandomFigure() {
        static final side = random.nextInt(100);
        static final firstleg = random.nextInt(100);
        static final secondleg = random.nextInt(100);
        Form randomForm = getRandomForm();
        if (randomForm.equals(Form.CIRCLE)) {
            figures = new Circle(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        if (randomForm.equals(Form.RECTANGLE)) {
            figures = new Rectangle(getRandomForm(),
                    ColorSupplier.getRandomColor(), firstleg, secondleg);
        }
        if (randomForm.equals(Form.RIGHT_TRIANGLE)) {
            figures = new RightTriangle(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        if (randomForm.equals(Form.SQUARE)) {
            figures = new Square(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        return figures;
    }

    public static Figure getDefaultFigure() {
        return new Circle(Form.CIRCLE, Color.WHITE, 10);
    }

    public static Figure getFigures() {
        return figures;
    }

    public static void setFigures(Figure figures) {
        FigureSupplier.figures = figures;
    }
}
