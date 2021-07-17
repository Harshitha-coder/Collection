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
		System.out.println("temple was added:" + added);
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
		int size = this.list.size();
		return size;
	}

	@Override
	public TempleDTO findFirstItem() {
		TempleDTO firstItem = this.list.get(0);
		System.out.println("firstItem:" + firstItem);
		return firstItem;
	}

	@Override
	public TempleDTO findLastItem() {
		TempleDTO lastItem = this.list.get(3);
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
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("temple found:"+itr.next());
		}
		return null;
	}

	/*
	 * @Override public Collection<TempleDTO> findAllTempleByLocationStartsWith(char
	 * ch) { Iterator<TempleDTO> itr=list.iterator(); while(itr.hasNext()) {
	 * TempleDTO temp=itr.next(); String casted=(String)temp;
	 * if(temp.getLocation().startsWith(c)) {
	  System.out.println("found temple:"+temp);
	 * } } return null; }
	 */
	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getEntryFee() > cost) {

				System.out.println("temple found by entry fee:" + temp);

			}
		}
		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojariesGreaterThan(int no) {
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getNoOfPoojaries() > no) {
				System.out.println("temple found by no of poojaries:" + temp);
			}
		}
		return null;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if (temp.getName().equals(name)) {
				System.out.println("location found by temple name:" + temp);
			}

		}
		return null;
	}

	
	@Override
	public Collection<String> findAllLocations() {
		Iterator<TempleDTO> itr = list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
				System.out.println("location found :" + temp.getLocation());
			}

		return null;
	}
}
