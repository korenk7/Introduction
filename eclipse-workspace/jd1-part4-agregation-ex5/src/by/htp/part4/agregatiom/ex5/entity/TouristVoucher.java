package by.htp.part4.agregatiom.ex5.entity;



public class TouristVoucher implements Comparable<TouristVoucher> {
	
	static int VoucherId;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String hotelName;
	String countryName;
	TypeOfVoucher voucherType;
	TypeOfTransport transportType;
	TypeOfEating eatingType;
	int daysOfTravelling;
	int price;
	private VoucherStatus status;
	
	
	public TouristVoucher(String hotelName, String countryName, TypeOfVoucher voucherType,
			TypeOfTransport transportType, TypeOfEating eatingType, int daysOfTravelling, int price, VoucherStatus status) {
		super();
		id = VoucherId;
		VoucherId++;
		this.hotelName = hotelName;
		this.countryName = countryName;
		this.voucherType = voucherType;
		this.transportType = transportType;
		this.eatingType = eatingType;
		this.daysOfTravelling = daysOfTravelling;
		this.price = price;
		this.status = status;
	}

	public VoucherStatus getStatus() {
		return status;
	}


	public void setStatus(VoucherStatus status) {
		this.status = status;
	}

	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public TypeOfVoucher getVoucherType() {
		return voucherType;
	}


	public void setVoucherType(TypeOfVoucher voucherType) {
		this.voucherType = voucherType;
	}


	public TypeOfTransport getTransportType() {
		return transportType;
	}


	public void setTransportType(TypeOfTransport transportType) {
		this.transportType = transportType;
	}


	public TypeOfEating getEatingType() {
		return eatingType;
	}


	public void setEatingType(TypeOfEating eatingType) {
		this.eatingType = eatingType;
	}


	public int getDaysOfTravelling() {
		return daysOfTravelling;
	}


	public void setDaysOfTravelling(int daysOfTravelling) {
		this.daysOfTravelling = daysOfTravelling;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "TouristVoucher [id=" + id + ", hotelName=" + hotelName + ", countryName=" + countryName
				+ ", voucherType=" + voucherType + ", transportType=" + transportType + ", eatingType=" + eatingType
				+ ", daysOfTravelling=" + daysOfTravelling + ", price=" + price + ", status=" + status + "]";
	}

	@Override
	public int compareTo(TouristVoucher o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	

}
