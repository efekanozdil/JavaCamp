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
			System.out.println("Do�rulama Ba�ar�l�");
			super.save(customer);
		}
		
		else {
			System.out.println("Do�rulama BA�ARISIZ!");
		}
		
	}


}
