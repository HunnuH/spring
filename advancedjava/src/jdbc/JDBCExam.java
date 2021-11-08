package jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class JDBCExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�˻�********");
		System.out.print("1. ��ü �μ� �˻�:");
		System.out.print("2. �μ����˻�:");
		System.out.print("3. ��ġ�ΰ˻�:");
		int selectNum = key.nextInt();
		MyDeptDAO dao = new MyDeptDAO();
		ArrayList<MyDeptDTO> deptlist = null;
		switch(selectNum) {
			case 1:
				deptlist = dao.getDeptList();
				break;
			case 2:
				System.out.print("�μ���:");
				String deptname = key.next();
				deptlist = dao.findByDeptName(deptname);
				//�޼ҵ� ȣ�� ����� ����ϱ�
				break;
			case 3:
				System.out.print("��ġ:");
				String loc = key.next();
				deptlist = dao.findByLoc(loc);
				//�޼ҵ� ȣ�� ����� ����ϱ�
				break;
		}
				for (int i = 0; i < deptlist.size(); i++) {
					MyDeptDTO dept = deptlist.get(i);
					System.out.println(dept.getDeptno()+","+dept.getDeptname()+","+dept.getLoc()+","+dept.getMgr());
		}
	}
}