package com.xworkz.unique.dao;

import java.util.Collection;

import com.xworkz.unique.dto.KitchenItemDTO;

public interface KitchenItemDAO {

	boolean saveUnique(KitchenItemDTO dto);

	Collection<KitchenItemDTO> findAllSortByUsedFor();

	Collection<KitchenItemDTO> findAllSortByUsedForDesc();
	
	Collection<KitchenItemDTO> findAllSortByName();
	
	Collection<KitchenItemDTO> findAllSortByPriceDesc();

}
