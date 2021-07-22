package com.xworkz.unique.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.xworkz.unique.comparator.KitchenItemNameComparator;
import com.xworkz.unique.comparator.KitchenItemPriceComparator;
import com.xworkz.unique.comparator.KitchenUsedForComparator;
import com.xworkz.unique.dto.KitchenItemDTO;

public class KitchenItemImpl implements KitchenItemDAO {

	Set<KitchenItemDTO> set = new HashSet<KitchenItemDTO>();

	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		boolean added = this.set.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
		List<KitchenItemDTO> list=new ArrayList<KitchenItemDTO>(this.set);
		KitchenUsedForComparator usedFor=new KitchenUsedForComparator();
		 Collections.sort(list, usedFor);
		 return list ;
	}
	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedForDesc() {
		List<KitchenItemDTO> list=new ArrayList<KitchenItemDTO>(this.set);
		KitchenUsedForComparator usedFor=new KitchenUsedForComparator();
		 Collections.sort(list, Collections.reverseOrder(usedFor));
		 return list ;
	}
	@Override
	public Collection<KitchenItemDTO> findAllSortByName() {
		List<KitchenItemDTO> list=new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemNameComparator name=new KitchenItemNameComparator();
		 Collections.sort(list, name);
		 return list ;
	}
	
	@Override
	public Collection<KitchenItemDTO> findAllSortByPriceDesc() {
		List<KitchenItemDTO> list=new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemPriceComparator price=new KitchenItemPriceComparator();
		 Collections.sort(list, price.reversed());
		 return list ;
	}
} 
