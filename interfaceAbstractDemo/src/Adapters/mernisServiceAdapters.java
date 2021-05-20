package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import interfaceAbstractDemo.Abstarct.ICheckCustomerService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class mernisServiceAdapters implements ICheckCustomerService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException,RemoteException {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=client.TCKimlikNoDogrula(
				
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBird().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				
				);


		return result;
	}
	

}
