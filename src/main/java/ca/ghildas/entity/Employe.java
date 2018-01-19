package ca.ghildas.entity;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import javax.validation.constraints.NotNull;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Employe", discriminatorType=DiscriminatorType.STRING,length=2)
public abstract class Employe implements Serializable {
   @Id
   @GeneratedValue
   private  Long employeId;
    @NotNull
   //@Column(unique=true)
  private String userName;
  @NotNull
	private String password;
	private String nom;
	private String email;
	private String tel;
	
public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
@ManyToMany
	@JoinTable(name="USERS_ROLES")
	private Collection<Role> roles;
	
	
	

	public void setIdEmploye(Long idEmploye) {
		this.employeId = idEmploye;

	}

   
	public Employe() {
		super();
	}
	public Employe(String userName, String password, String nom, String email, String tel) {
		super();
		this.userName = userName;
		this.password = password;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
	}


	public Long getEmployeId() {
		return employeId;
	}


	public void setEmployeId(Long employeId) {
		this.employeId = employeId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	

	
	
}
