public class Const2 {
    
        String name;
      
        // public constructor
        public Const2() {
          name = "Programiz";
        }
      }
      
      class Main {
        public static void main(String[] args) {
      
          // object is created in another class
          Const2 obj = new Const2();
          System.out.println("Company name = " + obj.name);
        }
      }
    

