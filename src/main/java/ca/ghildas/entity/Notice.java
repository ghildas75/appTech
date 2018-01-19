package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Notice implements Serializable {
@EmbeddedId
private NoticeIdentity noticeIdentity;
private String byPhone;
private Date  heureAppel;
private String bySms;
private Date heureSms;
@ManyToOne
@MapsId("customerId")
private Customer customer;
@ManyToOne
@MapsId("employeId")
private Technician techicianNotice;

public Notice() {
	super();
}



public Notice(String byPhone, Date heureAppel, String bySms, Date heureSms, Customer customer,
		Technician technicianNotice) {
	
	this.byPhone = byPhone;
	this.heureAppel = heureAppel;
	this.bySms = bySms;
	this.heureSms = heureSms;
	this.customer=customer;
	this.techicianNotice=technicianNotice;
	 this.noticeIdentity= new  NoticeIdentity(technicianNotice.getEmployeId(), customer.getCustomerId());
   
}




public NoticeIdentity getNoticeIdentity() {
	return noticeIdentity;
}

public void setNoticeIdentity(NoticeIdentity noticeIdentity) {
	this.noticeIdentity = noticeIdentity;
}

public String getByPhone() {
	return byPhone;
}

public void setByPhone(String byPhone) {
	this.byPhone = byPhone;
}

public Date getHeureAppel() {
	return heureAppel;
}

public void setHeureAppel(Date heureAppel) {
	this.heureAppel = heureAppel;
}

public String getBySms() {
	return bySms;
}

public void setBySms(String bySms) {
	this.bySms = bySms;
}

public Date getHeureSms() {
	return heureSms;
}

public void setHeureSms(Date heureSms) {
	this.heureSms = heureSms;
}



public Customer getCustomer() {
	return customer;
}



public void setCustomer(Customer customer) {
	this.customer = customer;
}



public Technician getTechicianNotice() {
	return techicianNotice;
}



public void setTechicianNotice(Technician techicianNotice) {
	this.techicianNotice = techicianNotice;
}







	
}
