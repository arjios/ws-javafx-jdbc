package model.entities;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCompany;
	private Integer id;
	private Integer type;
	private String name;
	private Integer costCenter;
	
	
	public Department() {
	}

	public Department(Integer idCompany, Integer id, Integer type, String name, Integer costCenter) {
		this.idCompany = idCompany;
		this.id = id;
		this.type = type;
		this.name = name;
		this.costCenter = costCenter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(Integer costCenter) {
		this.costCenter = costCenter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}