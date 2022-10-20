import java.io.File;
import java.util.Scanner;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("***Visitor Pattern!***");
		//System.out.println("^^^Iterator Method!^^^");
		System.out.println("Checking for the product "+product.name);
		System.out.println("<_><_><_><_><_><_><_>");


            }




	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

	}

}
