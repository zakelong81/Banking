package com.example.bank;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue
	private Integer AccountID;

	@Size(min=3, message="Name should have atleast 3 characters!!")
	private String Name;

  //@Column(unique=true)
  @Size(min=3, message="User name should have atleast 3 characters!!")
  private String UseName;

  private String Password;
  private Double Balance;

  public BankAccount(Integer accountID, String useName, String name ) {
    //super();
    AccountID = accountID;
    UseName = useName;
    Name = name;
  }
  public Integer getAccountID() {
		return AccountID;
	}
	public void setAccountID(Integer accountID) {
		AccountID = accountID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUseName() {
		return UseName;
	}
}
