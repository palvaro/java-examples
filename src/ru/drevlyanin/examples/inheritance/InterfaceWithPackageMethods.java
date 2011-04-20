package ru.drevlyanin.examples.inheritance;

interface InterfaceWithPackageMethods extends BaseInterface {
  /**
   * Idea Warning: @Override is not allowed when implementing interface method
   */
//  @Override
  void packageMethod();

  /**
   * Idea Warning: @Override is not allowed when implementing interface method
   */
//  @Override
  void publicMethod();
}