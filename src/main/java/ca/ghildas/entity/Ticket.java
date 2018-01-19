package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Ticket implements Serializable{
@Id
@GeneratedValue
private Long 	ticketId;
private String description;
private String type;
private int duree;
@DateTimeFormat(pattern="yyyy-MM-dd")
private  Date dateCreation;
private String note;
private Date dateDipso;

@OneToMany(
        mappedBy = "ticket", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
private Collection<Affectation> employes;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="ticket_prepose")
private Prepose preposeTicket;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="ticket_customer")
private Customer customer;

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Collection<Affectation> getEmployes() {
	return employes;
}
public void setEmployes(Collection<Affectation> employes) {
	this.employes = employes;
}

public Ticket() {
	super();
}



public Ticket(String description, String type, int duree, Date dateCreation, String note, Date dateDipso,
		Collection<Affectation> employes, Prepose prepose, Customer customer) {
	super();
	this.description = description;
	this.type = type;
	this.duree = duree;
	this.dateCreation = dateCreation;
	this.note = note;
	this.dateDipso = dateDipso;
	this.employes = employes;
	this.preposeTicket = prepose;
	this.customer = customer;
}
public Ticket(String description, String type, int duree, Date dateCreation, String note) {
	super();
	this.description = description;
	this.type = type;
	this.duree = duree;
	this.dateCreation = dateCreation;
	this.note = note;
	
}
public Long getTicketId() {
	return ticketId;
}
public void setTicketId(Long ticketId) {
	this.ticketId = ticketId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public Date getDateDipso() {
	return dateDipso;
}
public void setDateDipso(Date dateDipso) {
	this.dateDipso = dateDipso;
}
public Prepose getPrepoposeTicket() {
	return preposeTicket;
}
public void setPrepoposeTicket(Prepose prepoposeTicket) {
	this.preposeTicket = prepoposeTicket;
}




	


}
