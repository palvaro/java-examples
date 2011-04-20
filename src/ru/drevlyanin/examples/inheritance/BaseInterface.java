package ru.drevlyanin.examples.inheritance;

interface BaseInterface {
  /**
   * modifier private not allowed here
   */
//  private final boolean PRIVATE_CONSTANT = false;
  /**
   * modifier protected not allowed here
   */
//  protected final boolean PROTECTED_CONSTANT = false;
  final boolean PACKAGE_CONSTANT = false;
  public final boolean PUBLIC_CONSTANT = false;

  /**
   * modifier private not allowed here
   */
//  private boolean privateVariable = false;
  /**
   * modifier protected not allowed here
   */
//  protected boolean protectedVariable = false;
  boolean packageVariable = false;
  public boolean publicVariable = false;

  /**
   * modifier private not allowed here
   */
//  private void privateMethod();

  /**
   * modifier protected not allowed here
   */
//  protected void protectedMethod();

  void packageMethod();

  public void publicMethod();
}