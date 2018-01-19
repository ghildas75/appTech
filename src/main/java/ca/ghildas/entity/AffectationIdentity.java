package ca.ghildas.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class AffectationIdentity implements Serializable {
     
	@NotNull
	 private Long techincianId;
	 @NotNull
	private Long preposeId;
	@NotNull
	private Long ticketId;
	
	
	
	

	public AffectationIdentity(Long techincianId, Long preposeId, Long ticketId) {
		super();
		this.techincianId = techincianId;
		this.preposeId = preposeId;
		this.ticketId = ticketId;
	}

	public Long getTechincianId() {
		return techincianId;
	}

	public void setTechincianId(Long techincianId) {
		this.techincianId = techincianId;
	}

	public Long getPreposeId() {
		return preposeId;
	}

	public void setPreposeId(Long preposeId) {
		this.preposeId = preposeId;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Long getIdTicket() {
		return ticketId;
	}

	public void setIdTicket(Long idTicket) {
		this.ticketId = idTicket;
	}
	/* @Override
	    public int hashCode() {
	        return Object.hash(codeEmploye,idTicket);
	    }*/
	
	
	public AffectationIdentity() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AffectationIdentity that = (AffectationIdentity) o;

        if (!techincianId.equals(that.techincianId)) return false;
         if(!preposeId.equals(that.preposeId))return false;
        return ticketId.equals((that.ticketId));
    }

	
	@Override
    public int hashCode() {
        int result = techincianId.hashCode();
        result = 31 * result + ticketId.hashCode();
        return result;
    }
}
