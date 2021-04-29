import java.io.Serializable;
import javax.faces.bean.ManagedBean;


/**
 * @author Mahshid Farrahinia
 *  This public class creates a Serializable ValidationBean class  
 *  It meets the required conventions of JavaBeans.
 *  So it implement the java.io.Serializable interface,
 *  It contains private variables with default (zero-argument) constructor, the setters, and the getters
 *  
 *
 */

@ManagedBean( name = "validationBean")
public class ValidationBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int quantity;
	
	public ValidationBean() {
		super();
	}
    
	//return the quantity
	public int getQuantity() {
		return quantity;
	}
   //set the quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	/*public String getResult()
	{
		String response = "" ;
		if (quantity != 0)
			response = "<p style=\"background-color:yellow;width:200px;"+
					   "padding:5px\"> Thank you, your order is placed!</p>";
			return response ;
				
	}*/

}
