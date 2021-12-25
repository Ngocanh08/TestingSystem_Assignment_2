package classCon;

import java.time.LocalDate;

import classCon.Department;
import classCon.Group;
import classCon.Position;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;
}
