package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	ICustomerCheckService �CustomerCheckService ;
	
	public StarbucksCustomerManager(ICustomerCheckService �CustomerCheckService ) {
		this.�CustomerCheckService = �CustomerCheckService;
	}
	@Override
	public void save(Customer customer) {
	try {
		if(this.�CustomerCheckService.CheckIfRealPerson(customer)) {
		    super.save(customer);
		}
		else {
		    System.out.println("Not a valid person");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	        
 }

}

