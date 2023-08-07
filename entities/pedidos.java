package entities;



import java.util.Date;

import entities.enums.ordemDeStatus;

public class pedidos {
	
	private Integer id;
	private Date moment;
	private ordemDeStatus status;
	
	public pedidos() {
	}

	public pedidos(Integer id, Date moment, ordemDeStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public ordemDeStatus getStatus() {
		return status;
	}

	public void setStatus(ordemDeStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "pedidos [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	
	
}