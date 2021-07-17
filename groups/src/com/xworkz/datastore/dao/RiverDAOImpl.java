package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOImpl implements RiverDAO {

	List<RiverDTO> list = new ArrayList<RiverDTO>();

	@Override
	public boolean save(RiverDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		System.out.println("river was added:" + added);
		return added;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public boolean update(RiverDTO dto) {
		boolean exist = this.list.contains(dto);
		if (exist) {
			System.out.println("river found,will update:" + dto);
			int indexOfRiver = this.list.indexOf(dto);
			this.list.set(indexOfRiver, dto);
		} else {
			System.out.println("river not found");
		}
		return false;
	}

	@Override
	public boolean delete(RiverDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("river removed:" + dto);
			this.list.remove(dto);
		}
		return false;
	}
}
