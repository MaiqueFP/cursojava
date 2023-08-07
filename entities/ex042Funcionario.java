package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.ex042nivelTrabalho;

public class ex042Funcionario {
	
	private String name;
	private ex042nivelTrabalho level;
	private Double baseSalario;
	
	private ex042Departamento departamento;
	//o proximo item e lista devido a sua associação
	private List<ex042HoraContrato> contratos = new ArrayList<>();
		
	public ex042Funcionario() {
	}

	public ex042Funcionario(String name, ex042nivelTrabalho level, Double baseSalario, ex042Departamento departamento) {
		this.name = name;
		this.level = level;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ex042nivelTrabalho getLevel() {
		return level;
	}

	public void setLevel(ex042nivelTrabalho level) {
		this.level = level;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public ex042Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(ex042Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ex042HoraContrato> getContrato() {
		return contratos;
	}
	
	public void addContrato(ex042HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ex042HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double salarioDoMes(int mes, int ano) {
		double total = baseSalario;
		Calendar cal = Calendar.getInstance();
		for(ex042HoraContrato c : contratos ) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (c_ano == ano && c_mes == mes) {
				total += c.valorTotal();
			}
		}
		return total;
	}

}
