package ru.drevlyanin.examples.inheritance;

public class ClassWithPrivateMethods extends BaseClass {
  /**
   * method does not override or implement a method from a supertype
   */
//  @Override
  private void privateMethod() { }

  /**
   * protectedMethod() in ru.drevlyanin.examples.inheritance.ClassWithPrivateMethods cannot override protectedMethod()
   * in ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was protected
   */
//  @Override
//  private void protectedMethod() { }

  /**
   * packageMethod() in ru.drevlyanin.examples.inheritance.ClassWithPrivateMethods cannot override packageMethod() in
   * ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was package
   */
//  @Override
//  private void packageMethod() { }

  /**
   * publicMethod() in ru.drevlyanin.examples.inheritance.ClassWithPrivateMethods cannot override publicMethod() in
   * ru.drevlyanin.examples.inheritance.BaseClass; attempting to assign weaker access privileges; was public
   */
//  @Override
//  private void publicMethod() { }
}