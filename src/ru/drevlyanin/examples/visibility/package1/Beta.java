package ru.drevlyanin.examples.visibility.package1;

import ru.drevlyanin.examples.visibility.package2.AlphaSubclass;
import ru.drevlyanin.examples.visibility.package2.Gamma;

public class Beta {
  private static void privateStaticBetaMethod() { }

  static void packageStaticBetaMethod() { }

  protected static void protectedStaticBetaMethod() { }

  public static void publicStaticBetaMethod() { }

  private static void visibilityTest() {
    // Alpha
    /**
     * privateStaticAlphaMethod() has private access in ru.drevlyanin.examples.visibility.package1.Alpha
     */
//    Alpha.privateStaticAlphaMethod();
    Alpha.packageStaticAlphaMethod();
    Alpha.protectedStaticAlphaMethod();
    Alpha.publicStaticAlphaMethod();

    // Beta
    Beta.privateStaticBetaMethod();
    Beta.packageStaticBetaMethod();
    Beta.protectedStaticBetaMethod();
    Beta.publicStaticBetaMethod();

    // AlphaSubclass
    /**
     * privateStaticAlphaSubclassMethod() has private access in ru.drevlyanin.examples.visibility.package2.AlphaSubclass
     */
//    AlphaSubclass.privateStaticAlphaSubclassMethod();
    /**
     * packageStaticAlphaSubclassMethod() is not public in ru.drevlyanin.examples.visibility.package2.AlphaSubclass; cannot be accessed from outside package
     */
//    AlphaSubclass.packageStaticAlphaSubclassMethod();
    /**
     * protectedStaticAlphaSubclassMethod() has protected access in ru.drevlyanin.examples.visibility.package2.AlphaSubclass
     */
//    AlphaSubclass.protectedStaticAlphaSubclassMethod();
    AlphaSubclass.publicStaticAlphaSubclassMethod();

    // Gamma
    /**
     * privateStaticGammaMethod() has private access in ru.drevlyanin.examples.visibility.package2.Gamma
     */
//    Gamma.privateStaticGammaMethod();
    /**
     * packageStaticGammaMethod() is not public in ru.drevlyanin.examples.visibility.package2.Gamma; cannot be accessed from outside package
     */
//    Gamma.packageStaticGammaMethod();
    /**
     * protectedStaticGammaMethod() has protected access in ru.drevlyanin.examples.visibility.package2.Gamma
     */
//    Gamma.protectedStaticGammaMethod();
    Gamma.publicStaticGammaMethod();
  }
}