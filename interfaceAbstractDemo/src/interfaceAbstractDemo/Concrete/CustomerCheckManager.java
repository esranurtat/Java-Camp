package interfaceAbstractDemo.Concrete;



import interfaceAbstractDemo.Abstarct.ICheckCustomerService;
import interfaceAbstractDemo.Abstarct.ICustomerService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICheckCustomerService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

	
	
	

}
