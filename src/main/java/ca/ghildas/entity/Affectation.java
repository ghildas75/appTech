package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

@Entity

public class Affectation implements Serializable {
@EmbeddedId
 private AffectationIdentity affectationIdentity;
@ManyToOne(fetch = FetchType.LAZY)
@MapsId("techincianId")
private Technician technician;
@MapsId("preposeId")
private Prepose prepose;
@ManyToOne(fetch = FetchType.LAZY)
@MapsId("ticketId")
private Ticket ticket; private String statut;
 private String service;
 private String lieuOrgine;
 @Temporal(TemporalType.TIMESTAMP)
 private Date heureArrive;
 @Temporal(TemporalType.TIMESTAMP)
 private Date heureActivation;
 @Temporal(TemporalType.TIMESTAMP)
 private Date punchIn;
 @Temporal(TemporalType.TIMESTAMP)
 private Date punchOut;
 
 
 
public Affectation(Technician technician, Prepose prepose, Ticket ticket, String statut, String service,
		String lieuOrgine, Date heureArrive, Date heureActivation, Date punchIn, Date punchOut) {
	super();
	this.technician = technician;
	this.prepose = prepose;
	this.ticket = ticket;
	this.statut = statut;
	this.service = service;
	this.lieuOrgine = lieuOrgine;
	this.heureArrive = heureArrive;
	this.heureActivation = heureActivation;
	this.punchIn = punchIn;
	this.punchOut = punchOut;
	this.affectationIdentity= new AffectationIdentity(technician.getEmployeId(),prepose.getEmployeId(),ticket.getTicketId());
}





public Affectation() {
	super();
}





public AffectationIdentity getAffectationIdentity() {
	return affectationIdentity;
}


public void setAffectationIdentity(AffectationIdentity affectationIdentity) {
	this.affectationIdentity = affectationIdentity;
}


public String getStatut() {
	return statut;
}


public void setStatut(String statut) {
	this.statut = statut;
}


public String getService() {
	return service;
}


public void setService(String service) {
	this.service = service;
}


public String getLieuOrgine() {
	return lieuOrgine;
}


public void setLieuOrgine(String lieuOrgine) {
	this.lieuOrgine = lieuOrgine;
}


public Date getHeureArrive() {
	return heureArrive;
}


public void setHeureArrive(Date heureArrive) {
	this.heureArrive = heureArrive;
}


public Date getHeureActivation() {
	return heureActivation;
}


public void setHeureActivation(Date heureActivation) {
	this.heureActivation = heureActivation;
}


public Date getPunchIn() {
	return punchIn;
}


public void setPunchIn(Date punchIn) {
	this.punchIn = punchIn;
}


public Date getPunchOut() {
	return punchOut;
}


public void setPunchOut(Date punchOut) {
	this.punchOut = punchOut;
}



public Ticket getTicket() {
	return ticket;
}


public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}



 
 

}
