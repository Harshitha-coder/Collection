package com.xworkz.datastore.tester;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOImpl;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;

public class HighwayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HighwayDTO highway1 = new HighwayDTO("NH67", 49, "Karnataka", HighwayType.NATIONAL, 337D, true, "NHIDCL");
		HighwayDTO highway2 = new HighwayDTO("SH17", 17, "Mysore", HighwayType.STATE, 144D, true, "SPWD");
		HighwayDTO highway3 = new HighwayDTO("MDR650", 650, "BangloreRural", HighwayType.DISTRICTROADS, 1049D, true,
				"DPWD");
		HighwayDTO highway4 = new HighwayDTO("NH7", 7, "Punjab", HighwayType.NATIONAL, 845D, true, "NHIDCL");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(highway1);
		dao.save(highway2);
		dao.save(highway3);
		dao.save(highway4);

		Collection<HighwayDTO> temp = dao.findAll();
		for (HighwayDTO highwayDTO : temp) {
			System.out.println(highwayDTO);
		}

		Collection<Integer> num = dao.findAllNumber();
		for (Integer highwayDTO : num) {
			System.out.println(highwayDTO);
		}
		System.out.println("total items:" + dao.totalItems());

		Collection<HighwayDTO> type = dao.findByHighwayType(HighwayType.NATIONAL);
		for (HighwayDTO highwayDTO : type) {
			System.out.println("highway type:" + highwayDTO);
		}
		Collection<HighwayDTO> name = dao.findByStateName("Karnataka");
		for (HighwayDTO highway : name) {
			System.out.println("state name:" + highway);
		}
		Collection<Integer> number = dao.findNumberByStateName("Karnataka");
		for (Integer highway : number) {
			System.out.println("number found:" + highway);
		}

		boolean exist = dao.exist(highway4);
		System.out.println("element exist:" + exist);

		double length = dao.findLengthByNumber(7);
		System.out.println("length found:" + length);

		boolean condition = dao.isCondition(650);
		System.out.println("condition:" + condition);

		HighwayDTO max = dao.findByMaxLength();
		System.out.println("max length:" + max);

		HighwayDTO min = dao.findByMinLength();
		System.out.println("min length:" + min);
	}

}
