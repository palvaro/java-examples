package ru.drevlyanin.examples.inheritance;

/**
 * Requirements in Overriding and Hiding
 * http://java.sun.com/docs/books/jls/third_edition/html/classes.html#8.4.8.3
 */
class ClassWithProtectedMethods extends BaseClass {
  /**
   * method does not override or implement a method from a supertype
   */
//  @Override
  protected void privateMethod() { }

  @Override
  protected void protectedMethod() { }

  @Override
  protected void packageMethod() { }

  /**
   * publicMethod() in ru.drevlyanin.examples.inheritance.ClassWithProtectedMethods cannot override publicMethod() in
   * ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was public
   */
//  @Override
//  protected void publicMethod() { }
}