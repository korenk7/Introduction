package by.htp.part4.agregatiom.ex5.entity;

import java.util.Arrays;

public class TouristVouchers {
	

	private TouristVoucher[] vouchers;
	private int size;
	private int capacity;
	
	
	public TouristVouchers(int capacity_) {
		super();
		this.capacity = capacity_;
		size = 0;
		this.vouchers = new TouristVoucher[capacity];
		// default vouchers[0] cause "new "make null value....
		vouchers[0]=new TouristVoucher("def","def",TypeOfVoucher.Rest,TypeOfTransport.Avia,TypeOfEating.All_Inclusive,0,0,VoucherStatus.Visible);

		
	}


	public TouristVoucher[] getVouchers() {
		return vouchers;
	}


	public void setVouchers(TouristVoucher[] vouchers) {
		this.vouchers = vouchers;
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





	@Override
	public String toString() {
		return "TouristVouchers [vouchers=" + Arrays.toString(vouchers) + ", size=" + size
				+ ", capacity=" + capacity + "]";
	}
	
	
	
	
	

}
