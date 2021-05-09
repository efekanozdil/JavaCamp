import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer customer=new Customer(1,"mehmet efekan","özdil","12380285525",1997);
			BaseCustomerManager bs =new StarbucksCustomerManager(new MernisServiceAdapter());
			bs.save(customer);
	}

}
