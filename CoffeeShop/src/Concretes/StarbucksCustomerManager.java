package Concretes;
import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{ 	
	private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer){
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Doðrulama Baþarýlý");
			super.save(customer);
		}
		
		else {
			System.out.println("Doðrulama BAÞARISIZ!");
		}
		
	}


}
