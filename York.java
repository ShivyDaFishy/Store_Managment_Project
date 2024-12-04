public class York extends Candy {

/*
 * Instance Variables - creates a variable to hold the information 
 */
  
private String chocolateType;

/*
 * Constructor - sets the default values
 */
  
  public York () {
    chocolateType = "Milk Chocolate";
  }


  /*
 * Parametalized Constructor - Sets the order in which the information is retrieved
 */

public York (String name, double price, String size, String chocolateType) {
super(name, price, size);
this.chocolateType = chocolateType;

}

  /*
 * Getter Methods - retrieves the information about the designated variable
 */

public String getChocolateType (){
  return chocolateType;
}

/*
 * Setter methods - sets the information to the designated variable.
 */
  
  public void setChocolateType(String chocolateType){
    this.chocolateType = chocolateType;
  }


/*
 * To String method - gets all the information combined
 */
  
  public String toString() {
   return (super.toString() + "\n Chocolate Type: " + getChocolateType());
  }
}