package duLieu;

import java.time.LocalDate;

import classCon.Account;
import classCon.Department;
import classCon.Group;
import classCon.Position;
import classCon.Position.PositionName;

public class duLieuCon {

	public duLieuCon() {
		// TODO Auto-generated constructor stub
	}

	Department dep1, dep2, dep3;
	Department[] listDepartment = new Department[3];
	Account acc1, acc2, acc3;
	Account[] listAccount = new Account[3];
	Position pos1, pos2, pos3;
	Position[] listPositiont = new Position[3];
	Group group1, group2, group3;
	Group[] listGroup = new Group[3];

	// Tạo Department
	public void duLieuCon1() {

		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		// Tạo Position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		// Tạo Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		group1.createDate = LocalDate.of(2021, 1, 1);
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		group2.createDate = LocalDate.of(2020, 2, 1);
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		group3.createDate = LocalDate.of(2019, 9, 23);
		// Tạo Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.groups = new Group[] { group3, group2 };
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		// add Group Account
		group1.accounts = new Account[] { acc1 };
		group2.accounts = new Account[] { acc1, acc2 };
		group3.accounts = new Account[] { acc2 };

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

		// câu 1:
		System.out.println("câu 1");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban.");
		} else {
			System.out.println("Phòng ban của nv này là: " + acc2.department.name);
		}

		// câu 2
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
//	câu 3
			System.out.println("câu 3");
			System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban."
					: "Phòng của nhân viên này là: " + acc2.department.name);
// câu 4:
			System.out.println("câu 4");
			System.out.println(
					acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
// câu 5:
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
	}
}
