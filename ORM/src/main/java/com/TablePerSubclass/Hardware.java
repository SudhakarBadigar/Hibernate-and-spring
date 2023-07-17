package com.TablePerSubclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue("hard")
@Entity
public class Hardware extends CognizantEmployee {
 private int workingHours;

public Hardware() {
	super();
}

public Hardware(int id, String name, String email, int workingHours) {
	super(id, name, email);
	this.workingHours = workingHours;
}

public int getWorkingHours() {
	return workingHours;
}

public void setWorkingHours(int workingHours) {
	this.workingHours = workingHours;
}


 
 
	

}
