package com.sun;

public class Ex3_City {

	public  String cityName;
	private double longitude;
	private double latitude;
	private int temprerature;
	
	public Ex3_City(String cityName, double longitude, double latitude, int temprerature) {
		super();
		this.cityName = cityName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.temprerature = temprerature;
	}


	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public int getTemprerature() {
		return temprerature;
	}



	public void setTemprerature(int temprerature) {
		this.temprerature = temprerature;
	}



	@Override
	public String toString() {
		 System.out.println("cityName=" + cityName + ", longitude=" + longitude + ", latitude=" + latitude + ", temprerature=" + temprerature);
		 return null;
	}
	

}
