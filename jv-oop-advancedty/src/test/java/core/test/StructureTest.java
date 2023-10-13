package core.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StructureTest {
  private static final List<String> figureClassNames = List
      .of("Circle", "Square", "IsoscelesTrapezoid", "Rectangle", "RightTriangle");
  private static List<Class> allClasses = new ArrayList<>();

  @BeforeClass
  public static void init() {
    try {
      allClasses = getClasses("core.basesyntax");
      if (allClasses.size() == 0) {
        Assert.fail("You should not rename base core.basesyntax package "
            + "and path to project and project name should not contain spaces "
            + "or words in cyrillic");
      }
    } catch (Exception e) {
      throw new RuntimeException("Could not load classes ", e);
    }
  }

  @Test
  public void programStructureTest() {
    for (String className : figureClassNames) {
      checkFigureClassExistence(className);
    }
    List<Class> figureClasses = allClasses.stream()
            .filter(c -> figureClassNames.contains(c.getSimpleName()))
            .collect(Collectors.toList());
    for (Class clazz:figureClasses) {
      checkFigureSuperclassExistence(clazz);
      checkClassInterfaces(clazz);
    }
    checkSuperclass(figureClasses);
  }

  private Class checkFigureClassExistence(String name) {
    Optional<Class> optionalClass = allClasses.stream().filter(c -> c.getSimpleName().equals(name))
            .findAny();
    if (optionalClass.isEmpty()) {
      Assert.fail("You should create class called " + name);
    }
    return optionalClass.get();
  }

  private void checkClassInterfaces(Class clazz) {
    Class[] interfaces = clazz.getInterfaces();
    if (interfaces.length != 0) {
      Assert.fail("Class " + clazz.getSimpleName() + " should not "
              + "implement any interfaces. Let parent class implement them.");
    }
  }

  private void checkFigureSuperclassExistence(Class clazz) {
    Class superclass = clazz.getSuperclass();
    String superclassSimpleName = superclass.getSimpleName();
    if (superclassSimpleName.equals("Object")) {
      Assert.fail("Class " + clazz.getSimpleName()
              + " should have some parent class with common state for all figures - color");
    }
  }

  private void checkSuperclass(List<Class> figureClasses) {
    List<Class> figuresSuperclasses = new ArrayList<>();
    for (Class clazz : figureClasses) {
      Class superclass = clazz.getSuperclass();
      while (!superclass.equals(Object.class)) {
        figuresSuperclasses.add(superclass);
        superclass = superclass.getSuperclass();
      }
    }
    Map<Class, Long> classesMap = figuresSuperclasses.stream().collect(
            Collectors.groupingBy(Function.identity(),
                    Collectors.counting()));
    if (!classesMap.containsValue((long) figureClassNames.size())) {
      Assert.fail("Your figure classes should have common parent");
    }
    int numberOfCommonSuperclasses = 0;
    Class superclass = null;
    for (Map.Entry<Class, Long> entry : classesMap.entrySet()) {
      if (entry.getValue().equals((long) figureClassNames.size())) {
        superclass = entry.getKey();
        numberOfCommonSuperclasses++;
      }
    }
    if (numberOfCommonSuperclasses > 1) {
      Assert.fail("You should have only one common superclass for your figure classes");
    }
    checkSuperClassInterfaces(superclass);
  }

  private void checkSuperClassInterfaces(Class clazz) {
    Class[] interfaces = clazz.getInterfaces();
    if (interfaces.length == 0) {
      Assert.fail("Figures parent class " + clazz.getSuperclass().getSimpleName()
              +" should implement interfaces that describe common"
              + " behavior for all classes of figures");
    }
    if (interfaces.length == 1 && interfaces[0].getDeclaredMethods().length == 2) {
      Assert.fail("You should not put behavior into a single interface if "
              + "the methods are conceptually different from each other.");
    }
  }

  private static List<Class> getClasses(String packageName)
          throws ClassNotFoundException, IOException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    assert classLoader != null;
    String path = packageName.replace('.', '/');
    Enumeration<URL> resources = classLoader.getResources(path);
    List<File> dirs = new ArrayList<File>();
    while (resources.hasMoreElements()) {
      URL resource = resources.nextElement();
      dirs.add(new File(resource.getFile()));
    }
    ArrayList<Class> classes = new ArrayList<Class>();
    for (File directory : dirs) {
      classes.addAll(findClasses(directory, packageName));
    }
    return classes;
  }

  private static List<Class> findClasses(File directory, String packageName)
          throws ClassNotFoundException {
    List<Class> classes = new ArrayList<Class>();
    if (!directory.exists()) {
      return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." + file.getName()));
      } else if (file.getName().endsWith(".class")) {
        classes.add(Class.forName(
                packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }
}
