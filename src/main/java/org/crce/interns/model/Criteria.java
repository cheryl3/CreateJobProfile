package org.crce.interns.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_schema.criteria")
public class Criteria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3811312899431633680L;

	@Id
	@Column(name="criteria_id")
	 private String criteria_id;
	
	@Column(name="eligible_branches")
	private String eligible_branches;
	
	@Column(name="year_of_passing")
	private String year_of_passing;
	
	@Column(name="placed_students_allowed")
	private String placed_students_allowed;
	
	@Column(name="percentage")
	private String percentage;
	
	@Column(name="cgpa")
	private String cgpa;
	
	@Column(name="no_of_live_kts_allowed")
	private String no_of_live_kts_allowed;
	
	@Column(name="no_of_dead_kts_allowed")
	private String no_of_dead_kts_allowed;
	
	@Column(name="year_gap_allowed")
	private String year_gap_allowed;
	
	@Column(name="ssc_percentage")
	private String ssc_percentage;
	
	@Column(name="hsc_or_dip_percentage")
	private String hsc_or_dip_percentage;
	
	@Column(name="last_date_to_apply")
	private String last_date_to_apply;

	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="criteria_id",insertable=false,updatable=false)
	public String getCriteria_id() {
		return criteria_id;
	}

	public void setCriteria_id(String criteria_id) {
		this.criteria_id = criteria_id;
	}

	public String getEligible_branches() {
		return eligible_branches;
	}

	public void setEligible_branches(String eligible_branches) {
		this.eligible_branches = eligible_branches;
	}

	public String getYear_of_passing() {
		return year_of_passing;
	}

	public void setYear_of_passing(String year_of_passing) {
		this.year_of_passing = year_of_passing;
	}

	public String getPlaced_students_allowed() {
		return placed_students_allowed;
	}

	public void setPlaced_students_allowed(String placed_students_allowed) {
		this.placed_students_allowed = placed_students_allowed;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getNo_of_live_kts_allowed() {
		return no_of_live_kts_allowed;
	}

	public void setNo_of_live_kts_allowed(String no_of_live_kts_allowed) {
		this.no_of_live_kts_allowed = no_of_live_kts_allowed;
	}

	public String getNo_of_dead_kts_allowed() {
		return no_of_dead_kts_allowed;
	}

	public void setNo_of_dead_kts_allowed(String no_of_dead_kts_allowed) {
		this.no_of_dead_kts_allowed = no_of_dead_kts_allowed;
	}

	public String getYear_gap_allowed() {
		return year_gap_allowed;
	}

	public void setYear_gap_allowed(String year_gap_allowed) {
		this.year_gap_allowed = year_gap_allowed;
	}

	public String getSsc_percentage() {
		return ssc_percentage;
	}

	public void setSsc_percentage(String ssc_percentage) {
		this.ssc_percentage = ssc_percentage;
	}

	public String getHsc_or_dip_percentage() {
		return hsc_or_dip_percentage;
	}

	public void setHsc_or_dip_percentage(String hsc_or_dip_percentage) {
		this.hsc_or_dip_percentage = hsc_or_dip_percentage;
	}

	public String getLast_date_to_apply() {
		return last_date_to_apply;
	}

	public void setLast_date_to_apply(String last_date_to_apply) {
		this.last_date_to_apply = last_date_to_apply;
	}
	
	
}
