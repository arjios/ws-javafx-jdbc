package model.entities;

import java.io.Serializable;

public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer name;
	private Integer fantasyName;
	private String inscCNPJ;
	private String inscEst;
	private String inscMun;
	private String address;
	
	public Company() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(Integer fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getInscCNPJ() {
		return inscCNPJ;
	}

	public void setInscCNPJ(String inscCNPJ) {
		this.inscCNPJ = inscCNPJ;
	}

	public String getInscEst() {
		return inscEst;
	}

	public void setInscEst(String inscEst) {
		this.inscEst = inscEst;
	}

	public String getInscMun() {
		return inscMun;
	}

	public void setInscMun(String inscMun) {
		this.inscMun = inscMun;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		Company other = (Company) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", fantasyName=" + fantasyName + ", inscCNPJ=" + inscCNPJ
				+ ", inscEst=" + inscEst + ", inscMun=" + inscMun + ", address=" + address + "]";
	}

}