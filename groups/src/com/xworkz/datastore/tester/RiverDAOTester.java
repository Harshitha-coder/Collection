package com.xworkz.datastore.tester;

import com.xworkz.datastore.dto.*;
import com.xworkz.datastore.dao.*;

public class RiverDAOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, true, 3);

		RiverDTO dto1 = new RiverDTO("Ganga", "Gangotri", 2525, true, 4);

		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println("total size:" + dao.totalItems());

		RiverDTO updateKaveri = new RiverDTO("Kaveri", "Talakaveri", 806, true, 4);
		dao.update(updateKaveri);
		System.out.println("total size:" + dao.totalItems());

		RiverDTO removeGanga = new RiverDTO("Ganga", "Gangotri", 2525, true, 4);
		dao.delete(removeGanga);
		System.out.println("total size:" + dao.totalItems());

	}

}
