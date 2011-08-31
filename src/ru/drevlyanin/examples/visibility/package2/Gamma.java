package ru.drevlyanin.examples.visibility.package2;

import ru.drevlyanin.examples.visibility.package1.Alpha;
import ru.drevlyanin.examples.visibility.package1.Beta;

public class Gamma {
  private static void privateStaticGammaMethod() { }

  static void packageStaticGammaMethod() { }

  protected static void protectedStaticGammaMethod() { }

  public static void publicStaticGammaMethod() { }

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
    /**
     * protectedStaticAlphaMethod() has protected access in ru.drevlyanin.examples.visibility.package1.Alpha
     */
//    Alpha.protectedStaticAlphaMethod();
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
    /**
     * privateStaticAlphaSubclassMethod() has private access in ru.drevlyanin.examples.visibility.package2.AlphaSubclass
     */
//    AlphaSubclass.privateStaticAlphaSubclassMethod();
    AlphaSubclass.packageStaticAlphaSubclassMethod();
    AlphaSubclass.protectedStaticAlphaSubclassMethod();
    AlphaSubclass.publicStaticAlphaSubclassMethod();

    // Gamma
    Gamma.privateStaticGammaMethod();
    Gamma.packageStaticGammaMethod();
    Gamma.protectedStaticGammaMethod();
    Gamma.publicStaticGammaMethod();
  }
}