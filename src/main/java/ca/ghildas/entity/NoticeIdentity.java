package ca.ghildas.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class NoticeIdentity implements Serializable {
    @NotNull
	 private Long employeId;
	@NotNull
     private Long customerId;
	public NoticeIdentity(Long codeEmploye, Long idClient) {
		super();
		this.employeId=codeEmploye;
		this.customerId = idClient;
	}
	public NoticeIdentity() {
		super();
	}
	
	
	public Long getIdEmploye() {
		return employeId;
	}
	public void setIdEmploye(Long idEmploye) {
		this.employeId = idEmploye;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeIdentity that = (NoticeIdentity) o;

        if (employeId!=that.employeId) return false;
        return customerId==(that.customerId);
    }
	@Override
    public int hashCode() {
        int result = employeId.hashCode();
        result = 31 * result + customerId.hashCode();
        return result;
    }

}
