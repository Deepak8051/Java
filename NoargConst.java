class NoargConst {

  int i;

  // constructor with no parameter
  private NoargConst() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    NoargConst obj = new NoargConst();
    System.out.println("Value of i: " + obj.i);
  }
}
