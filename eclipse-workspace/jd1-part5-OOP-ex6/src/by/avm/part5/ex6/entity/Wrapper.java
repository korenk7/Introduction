package by.avm.part5.ex6.entity;

import java.util.Objects;

public abstract class Wrapper {
	
	private String matherial;
	private int cost;
	
	public String getMatherial() {
		return matherial;
	}
	public void setMatherial(String matherial) {
		this.matherial = matherial;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, matherial);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrapper other = (Wrapper) obj;
		return cost == other.cost && Objects.equals(matherial, other.matherial);
	}
	
	@Override
	public String toString() {
		return "Wrapper [matherial=" + matherial + ", cost=" + cost + "]";
	}
	
	

}
