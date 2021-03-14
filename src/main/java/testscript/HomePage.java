package testscript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BaseClass;
import utilities.ExcelReader;

public class HomePage extends BaseClass{


	void test() {
		System.out.println(prop.getProperty("url"));
	}
	
	
	public static ArrayList<Object[]> data() throws IOException{
		
		ArrayList<Object[]> store = new ArrayList<Object[]>();
		String filepath = "C:\\Users\\Deep\\eclipse-workspace\\qa\\testdata\\testdata.xlsx";
	

		
		for (int i=0; i<ExcelReader.rowcount;i++) {
		
		String firstname = ExcelReader.ReadSheet(filepath, 0, i, 0);
		String lastname = ExcelReader.ReadSheet(filepath, 0, i, 1);
		System.out.println(firstname);
		store.add(new Object[] {firstname,lastname});
		}
		
	
		return store;
		
		
	}
	

	public Iterator<Object[]> datapro() throws IOException {
		ArrayList<Object[]> tedata=	data();
		
		return tedata.iterator();
	}
	
	
	
	

	public void Test23(String firstname, String lastname) {
		
		System.out.println(firstname);
		System.out.println(lastname);
	}
	
	

	
	
	
	
	
	
	
	
	
}
