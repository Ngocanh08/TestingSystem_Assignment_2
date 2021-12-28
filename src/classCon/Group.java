package classCon;

import java.time.LocalDate;
import java.util.Date;

public class Group {

	public Group() {
		// TODO Auto-generated constructor stub
	}
	public int id;
	public String name;
	public String CreatorID;
	public Date CreateDate;
	public LocalDate createDate;
	public Account[] accounts;
	
	
	
	public Group(int id, String name, String creatorID, Date createDate, LocalDate createDate2, Account[] accounts) {
		super();
		this.id = id;
		this.name = name;
		CreatorID = creatorID;
		CreateDate = createDate;
		this.accounts = accounts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatorID() {
		return CreatorID;
	}
	public void setCreatorID(String creatorID) {
		CreatorID = creatorID;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
}
