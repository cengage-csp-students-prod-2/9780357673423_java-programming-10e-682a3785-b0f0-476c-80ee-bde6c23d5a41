class Person
 {   
     String firstName;
     String lastName;

     public Person(){
        this.firstName = "";
        this.lastName = "";
     }
      public Person(String firstName, String lastName)
      {
        this.firstName = firstName;
        this.lastName = lastName;
      }
     public String getFirstName()
      {
        return firstName;
       }
      public String getLastName()
      {
       return lastName;
      }
    }  