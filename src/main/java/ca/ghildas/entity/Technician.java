package ca.ghildas.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("ET")
public class Technician  extends Employe{

	
	@OneToMany(
	        mappedBy = "technician", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private Collection<Affectation> ticketsTechnician;
	
	@OneToMany(
	        mappedBy = "techicianNotice", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private Collection<Notice> customers;
	public Collection<Notice> getCustomers() {
		return customers;
	}

	public void setCustomers(Collection<Notice> customers) {
		this.customers = customers;
	}

	public Technician() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technician(String userName, String password, String nom, String email, String tel) {
		super(userName, password, nom, email, tel);
		// TODO Auto-generated constructor stub
	}

	public Collection<Affectation> getTicketsTechnician() {
		return ticketsTechnician;
	}

	public void setTicketsTechnician(Collection<Affectation> ticketsTechnician) {
		this.ticketsTechnician = ticketsTechnician;
	}
	
	
	

	
}
