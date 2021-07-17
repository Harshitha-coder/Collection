package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.*;

public interface RiverDAO {

	boolean save(RiverDTO dto);

	int totalItems();

	boolean update(RiverDTO dto);

	boolean delete(RiverDTO dto);
}
