
class SomeClass {
    public SomeClass() throws Exception 
    {
        System.out.println("Inside SomeClass constructor.");
        throw new Exception("Constructor failure: Something went wrong!");
    }
}

public class ConstructorFailure 
{
    public static void main(String[] args) 
    {
        try 
        {
            SomeClass obj = new SomeClass();
        } 
        catch (Exception e) 
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

