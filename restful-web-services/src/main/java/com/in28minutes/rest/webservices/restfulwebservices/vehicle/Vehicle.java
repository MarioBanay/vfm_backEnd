package com.in28minutes.rest.webservices.restfulwebservices.vehicle;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private Long id;
	private int length;
	private int width;
	private int height;
	private int kerbWeight;
	private int maximumPowerOutput;
	private int maximumSpeed;
	private int cylinderCapacity;
	private int co2;
	private int numberOfDoors;
	private String make;
	private String model;
	private String type;
	private String bodyType;
	private String typeOfFuel;
	private String vin;
	private String colour;
	private String tyres;
	private String registeredKeeper;
	private String owner;
	private String registrationNumber;
	private Date dateOfFirstRegistration;
	private Date dateOfFirstRegistrationInCroatia;
	private Date validThrough;

	public Vehicle() {
		
	}

	public Vehicle(Long id, int length, int width, int height, int kerbWeight, int maximumPowerOutput, int maximumSpeed,
			int cylinderCapacity, int co2, int numberOfDoors, String make, String model, String type, String bodyType,
			String typeOfFuel, String vin, String colour, String tyres, String password,
			String registeredKeeper, String owner, String registrationNumber, Date dateOfFirstRegistration,
			Date dateOfFirstRegistrationInCroatia, Date validThrough) {
		super();
		this.id = id;
		this.length = length;
		this.width = width;
		this.height = height;
		this.kerbWeight = kerbWeight;
		this.maximumPowerOutput = maximumPowerOutput;
		this.maximumSpeed = maximumSpeed;
		this.cylinderCapacity = cylinderCapacity;
		this.co2 = co2;
		this.numberOfDoors = numberOfDoors;
		this.make = make;
		this.model = model;
		this.type = type;
		this.bodyType = bodyType;
		this.typeOfFuel = typeOfFuel;
		this.vin = vin;
		this.colour = colour;
		this.tyres = tyres;
		this.registeredKeeper = registeredKeeper;
		this.owner = owner;
		this.registrationNumber = registrationNumber;
		this.dateOfFirstRegistration = dateOfFirstRegistration;
		this.dateOfFirstRegistrationInCroatia = dateOfFirstRegistrationInCroatia;
		this.validThrough = validThrough;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getKerbWeight() {
		return kerbWeight;
	}

	public void setKerbWeight(int kerbWeight) {
		this.kerbWeight = kerbWeight;
	}

	public int getMaximumPowerOutput() {
		return maximumPowerOutput;
	}

	public void setMaximumPowerOutput(int maximumPowerOutput) {
		this.maximumPowerOutput = maximumPowerOutput;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(int cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public int getCo2() {
		return co2;
	}

	public void setCo2(int co2) {
		this.co2 = co2;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTyres() {
		return tyres;
	}

	public void setTyres(String tyres) {
		this.tyres = tyres;
	}

	public String getRegisteredKeeper() {
		return registeredKeeper;
	}

	public void setRegisteredKeeper(String registeredKeeper) {
		this.registeredKeeper = registeredKeeper;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getDateOfFirstRegistration() {
		return dateOfFirstRegistration;
	}

	public void setDateOfFirstRegistration(Date dateOfFirstRegistration) {
		this.dateOfFirstRegistration = dateOfFirstRegistration;
	}

	public Date getDateOfFirstRegistrationInCroatia() {
		return dateOfFirstRegistrationInCroatia;
	}

	public void setDateOfFirstRegistrationInCroatia(Date dateOfFirstRegistrationInCroatia) {
		this.dateOfFirstRegistrationInCroatia = dateOfFirstRegistrationInCroatia;
	}

	public Date getValidThrough() {
		return validThrough;
	}

	public void setValidThrough(Date validThrough) {
		this.validThrough = validThrough;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result + co2;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + cylinderCapacity;
		result = prime * result + ((dateOfFirstRegistration == null) ? 0 : dateOfFirstRegistration.hashCode());
		result = prime * result
				+ ((dateOfFirstRegistrationInCroatia == null) ? 0 : dateOfFirstRegistrationInCroatia.hashCode());
		result = prime * result + height;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + kerbWeight;
		result = prime * result + length;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + maximumPowerOutput;
		result = prime * result + maximumSpeed;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberOfDoors;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((registeredKeeper == null) ? 0 : registeredKeeper.hashCode());
		result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((typeOfFuel == null) ? 0 : typeOfFuel.hashCode());
		result = prime * result + ((tyres == null) ? 0 : tyres.hashCode());
		result = prime * result + ((validThrough == null) ? 0 : validThrough.hashCode());
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (bodyType == null) {
			if (other.bodyType != null)
				return false;
		} else if (!bodyType.equals(other.bodyType))
			return false;
		if (co2 != other.co2)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (cylinderCapacity != other.cylinderCapacity)
			return false;
		if (dateOfFirstRegistration == null) {
			if (other.dateOfFirstRegistration != null)
				return false;
		} else if (!dateOfFirstRegistration.equals(other.dateOfFirstRegistration))
			return false;
		if (dateOfFirstRegistrationInCroatia == null) {
			if (other.dateOfFirstRegistrationInCroatia != null)
				return false;
		} else if (!dateOfFirstRegistrationInCroatia.equals(other.dateOfFirstRegistrationInCroatia))
			return false;
		if (height != other.height)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kerbWeight != other.kerbWeight)
			return false;
		if (length != other.length)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (maximumPowerOutput != other.maximumPowerOutput)
			return false;
		if (maximumSpeed != other.maximumSpeed)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numberOfDoors != other.numberOfDoors)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (registeredKeeper == null) {
			if (other.registeredKeeper != null)
				return false;
		} else if (!registeredKeeper.equals(other.registeredKeeper))
			return false;
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (typeOfFuel == null) {
			if (other.typeOfFuel != null)
				return false;
		} else if (!typeOfFuel.equals(other.typeOfFuel))
			return false;
		if (tyres == null) {
			if (other.tyres != null)
				return false;
		} else if (!tyres.equals(other.tyres))
			return false;
		if (validThrough == null) {
			if (other.validThrough != null)
				return false;
		} else if (!validThrough.equals(other.validThrough))
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}