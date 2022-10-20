public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("Visitor Pattern!");
		System.out.println("Checking for the product "+product.name);

	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

	}

}
