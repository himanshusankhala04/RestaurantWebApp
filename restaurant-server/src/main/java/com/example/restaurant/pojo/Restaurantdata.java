package com.example.restaurant.pojo;
// Generated 11-Jun-2021, 11:37:55 am by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Restaurantdata generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "restaurantdata", catalog = "restaurant")
public class Restaurantdata implements java.io.Serializable {

	private Integer id;
	private String name;
	private String location;
	private Date openingTime;
	private Date closingTime;

	public Restaurantdata() {
	}

	public Restaurantdata(String restaurantName, String location, Date openingTime, Date closingTime) {
		this.name = restaurantName;
		this.location = location;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}
	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String restaurantName) {
		this.name = restaurantName;
	}

	@Column(name = "location", length = 40)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "opening_time", length = 16)
	public Date getOpeningTime() {
		return this.openingTime;
	}

	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "closing_time", length = 16)
	public Date getClosingTime() {
		return this.closingTime;
	}

	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}

}
