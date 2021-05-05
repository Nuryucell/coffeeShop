package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	ICustomerCheckService ýCustomerCheckService ;
	
	public StarbucksCustomerManager(ICustomerCheckService ýCustomerCheckService ) {
		this.ýCustomerCheckService = ýCustomerCheckService;
	}
	@Override
	public void save(Customer customer) {
	try {
		if(this.ýCustomerCheckService.CheckIfRealPerson(customer)) {
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

