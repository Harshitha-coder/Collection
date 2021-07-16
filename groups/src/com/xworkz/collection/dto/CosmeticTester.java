package com.xworkz.collection.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO dto=new CosmeticDTO("Lipstick","Mac",750,true,false,true,40D);
		
		CosmeticDTO dto1=new CosmeticDTO("Compact","Lotus",230,true,false,true,20D);
		
		CosmeticDTO dto2=new CosmeticDTO("Eyelash","Landkiz",230,false,false,true,5D);

		Collection<CosmeticDTO> collection=new ArrayList<CosmeticDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		
		Iterator<CosmeticDTO> iterator=collection.iterator();
		while(iterator.hasNext())
		{
			CosmeticDTO temp=iterator.next();
			System.out.println(temp);
			if (temp.getPrice() != null && temp.getPrice() > 200) {
				System.out.println(" price is high");
			}
		}
		
		CosmeticDTO tempDto=new CosmeticDTO("EYELASH","LANDKIZ",230,false,false,true,5D);
		boolean temp = collection.contains(tempDto);
		System.out.println(temp);

	}
	
	

}
