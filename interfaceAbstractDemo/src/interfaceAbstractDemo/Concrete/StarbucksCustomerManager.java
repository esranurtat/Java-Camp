package interfaceAbstractDemo.Concrete;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstarct.BaseCustomerManager;
import interfaceAbstractDemo.Abstarct.ICheckCustomerService;
import interfaceAbstractDemo.Abstarct.ICustomerService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICheckCustomerService checkCustomerService;

	public StarbucksCustomerManager(ICheckCustomerService checkCustomerService) {
		super();
		this.checkCustomerService = checkCustomerService;
	}

	@Override
	public void save(Customer customer) throws  RemoteException {
		if(checkCustomerService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Login is not valid!"); 
		
		}
	}
	
	
}
