package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempleDTO temple1 = new TempleDTO(1, "Veeraanjaneya", "Chickballapur", 50, "Puliyogare", 3, true, "Anjaneya",
				false);
		TempleDTO temple2 = new TempleDTO(2, "Nadhi Bhogeshwara", "Nandhi", 100, "Pongal", 5, true, "Shiva", true);
		TempleDTO temple3 = new TempleDTO(3, "Iskon", "Rajajinagar", 150, "Dhal Kichadi", 6, true,
				"Radha Krishnachandra", true);
		TempleDTO temple4 = new TempleDTO(4, "Chamundeshwari", "Mysore", 100, "Ladu", 8, false, "Chamundeshwari",
				false);
		TempleDTO temple5 = new TempleDTO(5, "Annaporneshwari", "Horanadu", 150, "Payasa", 4, false, "Annaporneshwari",
				false);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(temple1);
		dao.save(temple2);
		dao.save(temple3);
		dao.save(temple4);
		dao.save(temple5);

		System.out.println("total size:" + dao.totalItems());

		TempleDTO removetemple5 = new TempleDTO(5, "Annaporneshwari", "Horanadu", 150, "Payasa", 4, false,
				"Annaporneshwari", false);
		dao.delete(removetemple5);
		System.out.println("total size:" + dao.totalItems());

		dao.findFirstItem();
		dao.findLastItem();

		dao.findByName("Iskon");
		dao.findByLocation("Nandhi");
		dao.findByLocationAndName("Veeraanjaneya", "Chickballapur");

		dao.findAll();
		// dao.findAllTempleByLocationStartsWith('e');
		dao.findAllTempleByEntryFeeGreaterThan(50);
		dao.findAllTempleByNoOfPoojariesGreaterThan(3);
		dao.findLocationByName("Iskon");
		dao.findAllLocations();
	}

}
