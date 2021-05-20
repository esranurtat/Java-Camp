package interfaceAbstractDemo;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.GregorianCalendar;

import Adapters.mernisServiceAdapters;
import interfaceAbstractDemo.Abstarct.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new mernisServiceAdapters());
		Customer customer=new Customer();
		
		customer.setFirstName("Esra Nur");
		customer.setLastName("Tat");
		customer.setDateOfBird((new GregorianCalendar(2005, 10 , 18).getTime()));
		customer.setNationalityId("10124215938");
		customerManager.save(customer);

	}

	

}
