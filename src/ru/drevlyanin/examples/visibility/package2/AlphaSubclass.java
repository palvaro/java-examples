package ru.drevlyanin.examples.visibility.package2;

import ru.drevlyanin.examples.visibility.package1.Alpha;
import ru.drevlyanin.examples.visibility.package1.Beta;

public class AlphaSubclass extends Alpha {
  private static void privateStaticAlphaSubclassMethod() { }

  static void packageStaticAlphaSubclassMethod() { }

  protected static void protectedStaticAlphaSubclassMethod() { }

  public static void publicStaticAlphaSubclassMethod() { }

  private static void visibilityTest() {
    // Alpha
    /**
     * privateStaticAlphaMethod() has private access in ru.drevlyanin.examples.visibility.package1.Alpha
     */
//    Alpha.privateStaticAlphaMethod();
    /**
     * packageStaticAlphaMethod() is not public in ru.drevlyanin.examples.visibility.package1.Alpha; cannot be accessed from outside package
     */
//    Alpha.packageStaticAlphaMethod();
    Alpha.protectedStaticAlphaMethod();
    Alpha.publicStaticAlphaMethod();

    // Beta
    /**
     * privateStaticBetaMethod() has private access in ru.drevlyanin.examples.visibility.package1.Beta
     */
//    Beta.privateStaticBetaMethod();
    /**
     * packageStaticBetaMethod() is not public in ru.drevlyanin.examples.visibility.package1.Beta; cannot be accessed from outside package
     */
//    Beta.packageStaticBetaMethod();
    /**
     * protectedStaticBetaMethod() has protected access in ru.drevlyanin.examples.visibility.package1.Beta
     */
//    Beta.protectedStaticBetaMethod();
    Beta.publicStaticBetaMethod();

    // AlphaSubclass
    AlphaSubclass.privateStaticAlphaSubclassMethod();
    AlphaSubclass.packageStaticAlphaSubclassMethod();
    AlphaSubclass.protectedStaticAlphaSubclassMethod();
    AlphaSubclass.publicStaticAlphaSubclassMethod();

    // Gamma
    /**
     * privateStaticGammaMethod() has private access in ru.drevlyanin.examples.visibility.package2.Gamma
     */
//    Gamma.privateStaticGammaMethod();
    Gamma.packageStaticGammaMethod();
    Gamma.protectedStaticGammaMethod();
    Gamma.publicStaticGammaMethod();
  }
}