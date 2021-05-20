package interfaceAbstractDemo.Abstarct;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICheckCustomerService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
