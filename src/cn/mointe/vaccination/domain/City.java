package cn.mointe.vaccination.domain;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable {

	private static final long serialVersionUID = 4517611918758392731L;

	private String cityName;
	private List<String> countys;

	public City() {

	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<String> getCountys() {
		return countys;
	}

	public void setCountys(List<String> countys) {
		this.countys = countys;
	}

}
