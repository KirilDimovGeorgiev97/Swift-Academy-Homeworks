package ThirdTask;

public class Address {

	private String country;
	private String city;
	private String municipality;
	private int postalCode;
	private String street;
	private int number;
	private int floor;
	private int apartmentNo;
	
	protected Address (String country,String city,String municipality,int postalCode,String street,int number,int floor,int apartmentNo) {
		this.country=country;
		this.city=city;
		this.municipality=municipality;
		this.postalCode=postalCode;
		this.street=street;
		this.number=number;
		this.floor=floor;
		this.apartmentNo=apartmentNo;
	}
	
	protected String getCountry() {
		return this.country;
	}
	
	protected String getCity() {
		return this.city;
	}
	
	protected String getMunicipality() {
		return this.municipality;
	}
	
	protected int getPostalCode() {
		return this.postalCode;
	}
	
	protected String getStreet() {
		return this.street;
	}
	
	protected int getNumber() {
		return this.number;
	}
	
	protected int getFloor() {
		return this.floor;
	}
	
	protected int getApartmentNo() {
		return this.apartmentNo;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", municipality=" + municipality + ", postalCode="
				+ postalCode + ", street=" + street + ", number=" + number + ", floor=" + floor + ", apartmentNo="
				+ apartmentNo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (apartmentNo != other.apartmentNo)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (floor != other.floor)
			return false;
		if (municipality == null) {
			if (other.municipality != null)
				return false;
		} else if (!municipality.equals(other.municipality))
			return false;
		if (number != other.number)
			return false;
		if (postalCode != other.postalCode)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	
	
	
}
