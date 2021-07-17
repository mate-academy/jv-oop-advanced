package core.basesyntax.util;

import core.basesyntax.enums.Figures;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FigureSupplier {
    private static final int BOUND = 100;
    private Logger logger = MyLogger.getLogger(FigureSupplier.class.getName());
    private Random rnd = new Random();

    public Figure[] getRandomFigures(int maxFiguresQuantity) {
        Figure[] arr = new Figure[rnd.nextInt(maxFiguresQuantity)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomFigure();
        }

        return arr;
    }

    private Figure getRandomFigure() {
        int index = rnd.nextInt(Figures.values().length);
        String figureName = "core.basesyntax.figures." + Figures.values()[index].toString();

        Figure figure = null;

        try {
            Class<Figure> cls = (Class<Figure>) Class.forName(figureName);
            figure = cls.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        } catch (InstantiationException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        } catch (IllegalAccessException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        } catch (InvocationTargetException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        } catch (NoSuchMethodException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        }

        if (figure != null) {
            figure.setColor(ColorSupplier.getRandomColor());
            setupFigureWithRandomParams(figure);
        }

        return figure;
    }

    private void setupFigureWithRandomParams(Figure figure) {
        HashMap<String, Object> childParams = new HashMap<>();
        String simpleName = figure.getClass().getSimpleName();

        switch (simpleName) {
            case "Circle":
                Double radius = getRndNum();
                childParams.put("setRadius", radius);
                figure.setupAdditionalParams(childParams);
                break;
            case "IsoscelesTrapezoid":
                Double firstSide = getRndNum();
                Double secondSide = getRndNum();
                Double height = getRndNum();

                childParams.put("setFirstParallelSide", firstSide);
                childParams.put("setSecondParallelSide", secondSide);
                childParams.put("setHeight", height);
                figure.setupAdditionalParams(childParams);
                break;
            case "Rectangle":
                Double sideA = getRndNum();
                Double sideB = getRndNum();
                childParams.put("setSideA", sideA);
                childParams.put("setSideB", sideB);
                figure.setupAdditionalParams(childParams);
                break;
            case "RightTriangle":
                Double legA = getRndNum();
                Double legB = getRndNum();
                childParams.put("setLegA", legA);
                childParams.put("setLegB", legB);
                figure.setupAdditionalParams(childParams);
                break;
            case "Square":
                Double side = getRndNum();
                childParams.put("setSide", side);
                figure.setupAdditionalParams(childParams);
                break;
            default:
                throw new NoSuchFigureException();
        }
    }

    private Double getRndNum() {
        Double result = Double.valueOf(rnd.nextInt(BOUND));
        if (result < 1) {
            getRndNum();
        }

        return result;
    }
}
