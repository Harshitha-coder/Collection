package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;

public class HighwayDAOImpl implements HighwayDAO {

	List<HighwayDTO> list = new ArrayList<HighwayDTO>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean added = this.list.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Collection<HighwayDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Collection<Integer> allNumber = new ArrayList<Integer>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			allNumber.add(temp.getNumber());
		}
		return allNumber;
	}

	@Override
	public int totalItems() {
		int totalItems = this.list.size();
		return totalItems;
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> highwayType = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getType().equals(type)) {
				highwayType.add(temp);
			}
		}
		return highwayType;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sName) {
		Collection<HighwayDTO> stateName = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getStateName().equals(sName)) {
				stateName.add(temp);
			}
		}
		return stateName;
	}

	@Override
	public Collection<Integer> findNumberByStateName(String sName) {
		Collection<Integer> number = new ArrayList<Integer>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getStateName().equals(sName)) {
				number.add(temp.getNumber());
			}
		}
		return number;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean exist = this.list.contains(dto);
		return exist;
	}

	public boolean isCondition(int number) {
		Iterator<HighwayDTO> highway = this.list.iterator();
		boolean condition = false;
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getNumber() == number) {
				condition = temp.isCondition();
			}
		}
		return condition;
	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> highway = this.list.iterator();
		double length = 0;
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getNumber() == no) {
				length = temp.getLength();
			}
		}
		return length;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		HighwayDTO maxLength = null;
		maxLength = Collections.max(list);
		return maxLength;

	}

	@Override
	public HighwayDTO findByMinLength() {
		HighwayDTO minLength = null;
		minLength = Collections.min(list);
		return minLength;

	}
}
