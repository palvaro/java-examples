package ru.drevlyanin.examples.inheritance;

/**
 * Requirements in Overriding and Hiding
 * http://java.sun.com/docs/books/jls/third_edition/html/classes.html#8.4.8.3
 */
class ClassWithPublicMethods extends BaseClass {
  /**
   * method does not override or implement a method from a supertype
   */
//  @Override
  public void privateMethod() { }

  @Override
  public void protectedMethod() { }

  @Override
  public void packageMethod() { }

  @Override
  public void publicMethod() { }
}