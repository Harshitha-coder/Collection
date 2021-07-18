package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {

	List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			this.list.remove(dto);
			System.out.println("temple removed:" + dto);
		}
		return false;
	}

	@Override
	public int totalItems() {
		int totalItems = this.list.size();
		return totalItems;
	}

	@Override
	public TempleDTO findFirstItem() {
		TempleDTO firstItem = this.list.get(0);
		System.out.println("firstItem:" + firstItem);
		return firstItem;
	}

	@Override
	public TempleDTO findLastItem() {
		TempleDTO lastItem = this.list.get((list.size() - 1));
		System.out.println("lastItem:" + lastItem);
		return lastItem;
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temple = itr.next();
			if (temple.getName().equals(name)) {
				dto = temple;
				System.out.println("name found:" + dto);
				break;
			}

		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temple = itr.next();
			if (temple.getLocation().equals(loc)) {
				dto = temple;
				System.out.println("location found:" + dto);
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temple = itr.next();
			if (temple.getName().equals(name) && temple.getLocation().equals(location)) {
				dto = temple;
				System.out.println("name and location found:" + dto);
				break;
			}
		}
		return dto;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char ch) {
		char c = ch;
		String s = Character.toString(c);
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getLocation().startsWith(s)) {
				System.out.println("found temple:" + temp);
				tempCollection.add(temp);
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getEntryFee() > cost) {
				System.out.println("temple found by entry fee:" + temp);
				tempCollection.add(temp);

			}
		}
		return tempCollection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojariesGreaterThan(int no) {
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getNoOfPoojaries() > no) {
				System.out.println("temple found by no of poojaries:" + temp);
				tempCollection.add(temp);
			}
		}
		return tempCollection;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = list.iterator();
		String location = null;
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getName().equals(name)) {

				System.out.println("location found by temple name:" + temp);
				location = temp.getLocation();
			}
		}
		return location;
	}

	@Override
	public Collection<String> findAllLocations() {
		Collection<String> location = new ArrayList<String>();
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			System.out.println("location found :" + temp.getLocation());
			location.add(temp.getLocation());
		}

		return location;
	}
}
