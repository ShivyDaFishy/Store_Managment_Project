public class Skittles extends Candy {

/*
 * Instance Variables - creates a variable to hold the information 
 */
  
private String skittleType;

/*
 * Constructor - sets the default values
 */
  
  public Skittles () {
    skittleType = "Lemon";
  }

 /*
 * Parametalized Constructor - Sets the order in which the information is retrieved
 */
  
public Skittles (String name, double price, String size, String skittleType) {
super(name, price, size);
this.skittleType = skittleType;

}

  /*
 * Getter Methods - retrieves the information about the designated variable
 */

  
public String getsSkittlesType (){
  return skittleType;
}

/*
 * Setter methods - sets the information to the designated variable.
 */
  
  public void setsSkittlesType(String skittleType){
    this.skittleType = skittleType;
  }

  /*
 * To String method - gets all the information combined
 */

  public String toString() {
    return (super.toString() + "\n Skittle Type: " + getsSkittlesType());
  }
}