package ru.drevlyanin.examples.visibility.package1;

import ru.drevlyanin.examples.visibility.package2.AlphaSubclass;
import ru.drevlyanin.examples.visibility.package2.Gamma;

public class Alpha {
  private static void privateStaticAlphaMethod() { }

  static void packageStaticAlphaMethod() { }

  protected static void protectedStaticAlphaMethod() { }

  public static void publicStaticAlphaMethod() { }

  private static void visibilityTest() {
    // Alpha
    Alpha.protectedStaticAlphaMethod();
    Alpha.privateStaticAlphaMethod();
    Alpha.packageStaticAlphaMethod();
    Alpha.publicStaticAlphaMethod();

    // Beta
    /**
     * privateStaticBetaMethod() has private access in ru.drevlyanin.examples.visibility.package1.Beta
     * */
//    Beta.privateStaticBetaMethod();
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