package interfaceAbstractDemo.Abstarct;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerService {
	void save(Customer customer)throws RemoteException;

}
