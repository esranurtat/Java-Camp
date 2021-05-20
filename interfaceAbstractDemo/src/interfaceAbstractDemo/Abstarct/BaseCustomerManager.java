package interfaceAbstractDemo.Abstarct;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) throws RemoteException{
		System.out.println("saved to database :"+customer.getFirstName());
		
	}

}
