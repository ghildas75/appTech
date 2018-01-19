package ca.ghildas.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("EP")
public class Prepose extends Employe{

	@OneToMany(
	        mappedBy = "prepose", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private Collection<Affectation> ticketsPrepose;
	
	
	@OneToMany(
	        mappedBy = "preposeTicket", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private Collection<Ticket> ticketsEm;
	
	public Prepose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prepose(String userName, String password, String nom, String email, String tel) {
		super(userName, password, nom, email, tel);
		// TODO Auto-generated constructor stub
	}

	public Collection<Affectation> getTicketsPrepose() {
		return ticketsPrepose;
	}

	public void setTicketsPrepose(Collection<Affectation> ticketsPrepose) {
		this.ticketsPrepose = ticketsPrepose;
	}

	public Collection<Ticket> getTicketsEm() {
		return ticketsEm;
	}

	public void setTicketsEm(Collection<Ticket> ticketsEm) {
		this.ticketsEm = ticketsEm;
	}

	
	

}
