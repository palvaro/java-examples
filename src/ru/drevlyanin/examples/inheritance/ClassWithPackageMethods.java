package ru.drevlyanin.examples.inheritance;

/**
 * Requirements in Overriding and Hiding
 * http://java.sun.com/docs/books/jls/third_edition/html/classes.html#8.4.8.3
 */
class ClassWithPackageMethods extends BaseClass {
  /**
   * method does not override or implement a method from a supertype
   */
//  @Override
  void privateMethod() { }

  /**
   * protectedMethod() in ru.drevlyanin.examples.inheritance.ClassWithPackageMethods cannot override protectedMethod()
   * in ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was protected
   */
//  @Override
//  void protectedMethod() { }

  @Override
  void packageMethod() { }

  /**
   * publicMethod() in ru.drevlyanin.examples.inheritance.ClassWithPackageMethods cannot override publicMethod() in
   * ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was public
   */
//  @Override
//  void publicMethod() { }
}