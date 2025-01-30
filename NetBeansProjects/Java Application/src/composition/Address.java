package composition;


public class Address {
    String city;
    String state;
    String country;
    String street;
  

    public Address(String city, String state, String country, String street ) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.street = street;
        
        
    }
   public void displayAddress(){
       System.out.printf("Address: %s %s %s %s",city,state,country,
               street);
   }
   
   
    }

          
    

