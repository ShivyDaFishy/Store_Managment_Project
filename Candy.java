public class Candy{

/*
 * Instance Variables - creates a variable to hold the information 
 */
  
  public String name;
  public double price;
  public String size;

//----------------------------------------------------------

/*
 * Constructor - sets the default values
 */
  
  public Candy (){
    name = "no name";
    price = 0.0;
    size = "small";
  }

 //----------------------------------------------- 


  /*
 * Parametalized Constructor - Sets the order in which the information is retrieved
 */

  public Candy (String name, double price, String size){
    this.name = name;
    this.price = price;
    this.size = size;
  }
//-----------------------------------------------------------


  /*
 * Getter Methods - retrieves the information about the designated variable
 */

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getSize(){
    return size;
  }
//----------------------------------------------------------------------------

/*
 * Setter methods - sets the information to the designated variable.
 */
  
  public void setName(String name){
    this.name = name;
  }

  public void setPrice (double price){
    this.price = price;
  }

  public void setSize (String size){
    this.size = size;
  }
//-----------------------------------------------------------------------------


/*
 * To String method - gets all the information combined
 */
  
  public String toString() {
    return ("\n Name: " + getName() + "\n Price: " + getPrice() + "\n Size: " + getSize());













    
      
  }
}