package by.avm.part5.ex6.entity;

import java.util.Objects;

public abstract class Candy {

	private String name;
	private int cost;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void candyIdentification() {
		
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		return cost == other.cost && Objects.equals(name, other.name) && weight == other.weight;
	}
	
	@Override
	public String toString() {
		return "Candy [name=" + name + ", cost=" + cost + ", weight=" + weight + "]";
	}
	
	
	
}
