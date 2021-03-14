package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		list.add(new Department(2, 1, 1, "Diretoria", 1));
		list.add(new Department(2, 2, 2, "Hospedagem", 2));
		list.add(new Department(2, 3, 2, "Recepção", 2));
		list.add(new Department(2, 4, 1, "Administração", 4));
		list.add(new Department(2, 5, 1, "Gerencia Administrativa", 4));
		list.add(new Department(2, 6, 1, "Controller", 4));
		list.add(new Department(1, 1, 1, "Diretoria", 1));
		list.add(new Department(1, 2, 2, "Hospedagem", 2));
		list.add(new Department(1, 3, 2, "Recepção", 2));
		list.add(new Department(1, 4, 1, "Administração", 4));
		list.add(new Department(1, 5, 1, "Gerencia Administrativa", 4));
		list.add(new Department(1, 6, 1, "Controller", 4));
		return list;
	}

}
