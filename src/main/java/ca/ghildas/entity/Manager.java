package ca.ghildas.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EM")
public class Manager extends Employe {

	public Manager(String userName, String password, String nom, String email, String tel) {
		super(userName, password, nom, email, tel);
		// TODO Auto-generated constructor stub
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

}
