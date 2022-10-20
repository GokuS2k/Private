import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
		try {
			//System.out.println("Inside");
			File text4 = new File("ProductInfo.txt");
			Scanner scnr4 = new Scanner(text4);
			int lineNumber4 = 1;
			int flagb4 = 0;
			List<String> meatProds = new ArrayList<String>();
			//List<String> prodProds = new ArrayList<String>();
			//HashMap<String, ArrayList<String>> proinfo = new HashMap<String, ArrayList<String>>();
			while (scnr4.hasNextLine()) {

				String line4 = scnr4.nextLine();
				String[] parts = line4.split(":");
				if (parts[0].equals("Meat")) {
					meatProds.add(parts[1]);
					System.out.println(lineNumber4 + ". " + parts[1]);

				}
				lineNumber4++;

			}
			System.out.println("Enter your choice: ");
			Scanner scnr5 = new Scanner(System.in);
			int input = scnr5.nextInt();
			ReminderVisitor rv = new ReminderVisitor();
			Product p = new Product();
			p.name = meatProds.get(input-1);
			rv.visitProduct(p);

		}
		catch( Exception e){
			e.printStackTrace();
		}

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
