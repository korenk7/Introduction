package by.avm.part5.ex6.entity;

import java.util.Objects;

public class Present {

	private Candy candy;
	private Wrapper wrapper;
	private int cost;
	
	public Present(Candy candy, Wrapper wrapper) {
		this.candy = candy;
		this.wrapper = wrapper;
		this.cost = candy.getCost()+wrapper.getCost();
	}
	
	public Candy getCandy() {
		return candy;
	}
	public void setCandy(Candy candy) {
		this.candy = candy;
	}
	public Wrapper getWrapper() {
		return wrapper;
	}
	public void setWrapper(Wrapper wrapper) {
		this.wrapper = wrapper;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(candy, cost, wrapper);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Present other = (Present) obj;
		return Objects.equals(candy, other.candy) && cost == other.cost && Objects.equals(wrapper, other.wrapper);
	}
	@Override
	public String toString() {
		return "Present [candy=" + candy + ", wrapper=" + wrapper + ", cost=" + cost + "]";
	}
	
	
	
	

}
