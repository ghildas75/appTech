package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Customer implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long customerId;
private String name;
private String numCivique;
private String ville;
private String pays;
private String codePostal;
private String app;
private String phone;
@NotNull
@Column(unique=true)
private String cell;
private String email;

@OneToMany(mappedBy="customer")
private Collection<Ticket> tickets;
@OneToMany(
        mappedBy = "customer", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
private Collection<Notice> employes;
public Customer() {
	super();
}


public Customer(String name, String numCivique, String ville, String pays, String codePostal, String app,
			String phone, String cell, String email) {
		super();
		this.name = name;
		this.numCivique = numCivique;
		this.ville = ville;
		this.pays = pays;
		this.codePostal = codePostal;
		this.app = app;
		this.phone = phone;
		this.cell = cell;
		this.email = email;
	}


public Long getCustomerId() {
	return customerId;
}


public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getNumCivique() {
	return numCivique;
}


public void setNumCivique(String numCivique) {
	this.numCivique = numCivique;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


public String getPays() {
	return pays;
}


public void setPays(String pays) {
	this.pays = pays;
}


public String getCodePostal() {
	return codePostal;
}


public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}


public String getApp() {
	return app;
}


public void setApp(String app) {
	this.app = app;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public String getCell() {
	return cell;
}


public void setCell(String cell) {
	this.cell = cell;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Collection<Ticket> getTickets() {
	return tickets;
}


public void setTickets(Collection<Ticket> tickets) {
	this.tickets = tickets;
}


public Collection<Notice> getEmployes() {
	return employes;
}


public void setEmployes(Collection<Notice> employes) {
	this.employes = employes;
}




































	









































	}
	


