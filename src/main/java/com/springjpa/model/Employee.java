package com.springjpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    //http://www.oracle.com/technetwork/middleware/ias/id-generation-083058.html
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
    @SequenceGenerator(sequenceName = "emp_seq", initialValue = 1, allocationSize = 1, name = "EMP_SEQ")
    Long id;

    @Column(name = "NAME")
    String name;
    @Column(name = "EMAIL")
    String email;

    //@Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    Date dateOfBirth;
    
   	@Column(name = "DOJ")
    Date dateOfJoining;

    

	public Employee(String name, String email, Date dob, Date doj) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dob;
        this.dateOfJoining = doj;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name ='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", DOB =" + dateOfBirth +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
    
    
    public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
}
