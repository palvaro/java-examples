package ru.drevlyanin.examples.inheritance;

class BaseClass {
  private final boolean PRIVATE_CONSTANT = false;
  protected final boolean PROTECTED_CONSTANT = false;
  final boolean PACKAGE_CONSTANT = false;
  public final boolean PUBLIC_CONSTANT = false;

  private boolean privateVariable = false;
  protected boolean protectedVariable = false;
  boolean packageVariable = false;
  public boolean publicVariable = false;

  private void privateMethod() { }

  protected void protectedMethod() { }

  void packageMethod() { }

  public void publicMethod() { }
}