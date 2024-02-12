package hospital_app_Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Medorder {
	@Id
	private int medorderId;
	private String dosage;
	private String frequency;
	private String orderDate;
	private String instructions;

	@ManyToMany(fetch = FetchType.LAZY)
	private List<Item> item;

	public int getMedorderId() {
		return medorderId;
	}

	public void setMedorderId(int medorderId) {
		this.medorderId = medorderId;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

}
