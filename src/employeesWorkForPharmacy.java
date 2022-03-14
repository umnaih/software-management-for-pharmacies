
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class employeesWorkForPharmacy {
	
	protected  Pharamacy_Log_in p;
	protected Employee e;
	
	
	
	public employeesWorkForPharmacy(Employee e) {
		super();
		this.p=  p;
	   this.e = e;
	
		
	}



	@Override
	public String toString() {
		return "employeesWorkForPharmacy [Pharamacy: " + p + ", Employee:" + e + "]";
	}
	


	
}
