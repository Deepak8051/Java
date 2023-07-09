class Const {
    private String name;
  
    // constructor
    Const() {
      System.out.println("Constructor Called:");
      name = "Deepak";
    }
  
    public static void main(String[] args) {
  
      // constructor is invoked while
      // creating an object of the Main class
      Const obj = new Const();
      System.out.println("The name is " + obj.name);
    }
  }