package ru.drevlyanin.examples.inheritance;

interface InterfaceWithPublicMethods extends BaseInterface {
  /**
   * Idea Warning: @Override is not allowed when implementing interface method
   */
//  @Override
  public void packageMethod();

  /**
   * Idea Warning: @Override is not allowed when implementing interface method
   */
//  @Override
  public void publicMethod();
}