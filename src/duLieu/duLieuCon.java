package duLieu;

import java.time.LocalDate;

import classCon.Account;
import classCon.Department;
import classCon.Group;
import classCon.Position;
import classCon.Position.PositionName;

public class duLieuCon {

	public duLieuCon() {
		duLieuCon1();
	}

	Department dep1, dep2, dep3;
	Department[] listDepartment = new Department[3];
	Account acc1, acc2, acc3;
	Account[] listAccount = new Account[3];
	Position pos1, pos2, pos3;
	Position[] listPositiont = new Position[3];
	Group group1, group2, group3;
	Group[] listGroup = new Group[3];

	public void q1() {
		System.out.println("câu 1");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban.");
		} else {
			System.out.println("Phòng ban của nv này là: " + acc2.department.name);
		}

	}

	// câu 2
	public void q2() {
		System.out.println("câu 2");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int countGroup = acc2.groups.length;
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (countGroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (countGroup >= 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
	}

//câu 3
	public void q3() {
		System.out.println("câu 3");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban."
				: "Phòng của nhân viên này là: " + acc2.department.name);
	}

//câu 4:
	public void q4() {
		System.out.println("câu 4");
		System.out.println(
				acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
	}

//câu 5:
	public void q5() {
		System.out.println("câu 5");
		if (group1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
		} else {
			int coungAccInGroup = group1.accounts.length;
			switch (coungAccInGroup) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}
	}

	// câu 6:
	public void q6() {
		System.out.println("câu 6");
		if (acc2.groups == null) {
			System.out.println("Nhân viên nay chua có group");
		} else {
			switch (acc2.groups.length) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;

			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
		}

	}

// câu 7
	public void q7() {
		System.out.println("câu 7");
		String positionName = acc1.position.name.toString();
		switch (positionName) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
	}

	// câu 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban
	// của họ
	public void q8() {

		for (Account ac : listAccount) {

			System.out.println("AccountID123456: " + ac.id + " Email: " + ac.email + " Name: " + ac.fullName);
		}
	}

	// cau 9: In ra thông tin các phòng ban bao gồm: id và name
	public void q9() {
		for (Department department : listDepartment) {
			System.out.println("DpId: " + department.id + " Name: " + department.name);
		}
	}
	// cau 10: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban
	// của
	// họ theo định dạng như sau:

	public void q10() {
		for (int i = 0; i < listAccount.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + "là:");
			System.out.println("Email: " + listAccount[i].email);
			System.out.println("Full name: " + listAccount[i].fullName);
			System.out.println("Phòng ban: " + listAccount[i].department.name);
		}
	}

	// cau 11
	// cau 12 Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question
	// 10
	public void q12() {
		for (int i = 0; i < 2; i++) {
			System.out.println("ID thu: " + listDepartment[i + 1]);
			System.out.println("id: " + listDepartment[i].id);
			System.out.println("name: " + listDepartment[i].name);
		}
	}

	public void q13() {
		for (int i = 0; i < listAccount.length; i++) {
			if (i != 1) {
				System.out.println("id thu: " + listAccount[i] + 1);
				System.out.println("Email: " + listAccount[i].email);
				System.out.println("Full name: " + listAccount[i].fullName);
				System.out.println("Phòng ban: " + listAccount[i].department.name);
			}
		}
	}

	public void q15() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
	}

	public void q16() {
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				
				System.out.print(i);
			}
			i++;
		}
	}
	public void q17() {
		
	}

	// Tạo Department
	public void duLieuCon1() {

		dep1 = new Department(1, "Marketing");

		dep2 = new Department(2, "Sale");

		dep3 = new Department(3, "BOD");

		// Tạo Position
		pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		// Tạo Group
		group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		group1.createDate = LocalDate.of(2021, 1, 1);
		group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		group2.createDate = LocalDate.of(2020, 2, 1);
		group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		group3.createDate = LocalDate.of(2019, 9, 23);
		// Tạo Account
		acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();

		acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.groups = new Group[] { group3, group2 };

		acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		acc3.groups = new Group[] { group3, group2 };

		listDepartment[0] = dep1;
		listDepartment[1] = dep2;
		listDepartment[2] = dep3;

		listAccount[0] = acc1;
		listAccount[1] = acc2;
		listAccount[2] = acc3;

		listPositiont[0] = pos1;
		listPositiont[1] = pos2;
		listPositiont[2] = pos3;

		listGroup[0] = group1;
		listGroup[1] = group2;
		listGroup[2] = group3;

	}

}
