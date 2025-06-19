package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsP3 
{
	public static void main(String[] args) 
	{
		ArrayList<Medicine> a1=new ArrayList<Medicine>();
		
		Medicine m1=new Medicine();
		m1.setMname("Refresh Tears");
		m1.setExpdate("04/05/2027");
		m1.setMfgdate("07/04/2024");
		
		Medicine m2=new Medicine();
		m2.setMname("Relif");
		m2.setExpdate("02/05/2027");
		m2.setMfgdate("01/04/2024");
		
		Medicine m3=new Medicine();
		m3.setMname("FML");
		m3.setExpdate("30/05/2028");
		m3.setMfgdate("07/04/2025");
		
		Medicine m4=new Medicine();
		m4.setMname("FML-T");
		m4.setExpdate("01/06/2027");
		m4.setMfgdate("05/03/2024");
		
		
		
		a1.add(m1);
		a1.add(m2);
		a1.add(m3);
		a1.add(m4);
		System.out.println(a1);
		Iterator<Medicine> ii=a1.iterator();
		while(ii.hasNext())
		{
			Medicine m=ii.next();
			
			System.out.println("Mname is..."+m.getMname());
			System.out.println("MExpiryDate is..."+m.getExpdate());
			System.out.println("MMFGDate is..."+m.getMfgdate());
			System.out.println();
		}
		
	}
}
