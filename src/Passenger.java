// Create public class Passenger
public class Passenger {
   private String name;
   private int age;


   // empty constructur
   //public Passenger() {


  // }


   // Constructur with arguments/parametrar
   public Passenger(String name, int age) {
       this.name = name;
       this.age = age;


   }


   // Setters methods
   public void setName(String name) {
       this.name = name;


   }


   public void setAge(int age) {
       this.age = age;


   }


   // Getters methods
   public String getName() {
       return name;
   }


   public int getAge() {
       return age;


   }
}



