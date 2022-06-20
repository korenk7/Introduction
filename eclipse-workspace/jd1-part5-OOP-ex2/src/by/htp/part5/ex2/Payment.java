package by.htp.part5.ex2;

import java.util.Arrays;

public class Payment {
	
	private int summ;
	private int size;
	private int capacity = 1;
	private Product[] productList = new Product[capacity];
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getSumm() {
		return summ;
	}

	public void setSumm(int summ) {
		this.summ = summ;
	}


	public Product[] getProductList() {
		return productList;
	}


	public void setProductList(Product[] productList) {
		this.productList = productList;
	}



	
	@Override
	public String toString() {
		return "Payment [summ=" + summ + ", size=" + size + ", capacity="
				+ capacity + ", productList=" + Arrays.toString(productList) + "]";
	}




	public class Product{
		
		private int cost;
		private String name;
		
		public Product() {
			
		}
		
		public Product(String name, int cost) {
			this.name = name;
			this.cost = cost;
			
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Product [cost=" + cost + ", name=" + name + "]";
		}
		
		
		
		
		
	}

	
	
}
