package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempleDTO temple1 = new TempleDTO(1, "Veeraanjaneya", "Chickballapur", 50, "Puliyogare", 3, true, "Anjaneya",
				false);
		TempleDTO temple2 = new TempleDTO(2, "Nandhi Bhogeshwara", "Nandhi", 100, "Pongal", 5, true, "Shiva", true);
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

		TempleDTO temp = dao.findFirstItem();
		System.out.println(temp);
		dao.findLastItem();

		dao.findByName("Iskon");
		dao.findByLocation("Nandhi");
		dao.findByLocationAndName("Veeraanjaneya", "Chickballapur");

		Collection<TempleDTO> alldata = dao.findAll();
		for (TempleDTO templeDTO : alldata)
			System.out.println(templeDTO);

		Collection<TempleDTO> loc = dao.findAllTempleByLocationStartsWith('M');
		for (TempleDTO templeDTO : loc) {
			System.out.println(templeDTO);
		}
		Collection<TempleDTO> fee = dao.findAllTempleByEntryFeeGreaterThan(50);
		for (TempleDTO templeDTO : fee) {
			System.out.println(templeDTO);
		}
		Collection<TempleDTO> poojaries = dao.findAllTempleByNoOfPoojariesGreaterThan(3);
		for (TempleDTO templeDTO : poojaries)
			System.out.println(templeDTO);
		String var = dao.findLocationByName("Iskon");
		System.out.println(var);// to check whether it is returning value or not
		Collection<String> location = dao.findAllLocations();
		for (String value : location) {
			System.out.println(value);
		}

	}
}
