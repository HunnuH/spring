package exam;
import java.util.Scanner;
public class ScoreSwitchExam {
	public static void main(String[] args) {
/*switch���� �̿�
 * 0~59 f����
 * 60~69 d����
 * 70~79 c����
 * 80~89 b����
 * 90~100 a����
 * 110 or -40 �߸����Է�
 * [�������]
 * ���� : 
 *   ����   */
		Scanner Key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int score = Key.nextInt();
		System.out.println("����:" +score);
		
		if(score < 0 | score >100) {
			System.out.print("�߸��� �Է�");
		}
		else { 
			switch(score/10) {
			case 10:
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7:
				System.out.println("C����");
				break;
			case 6:
				System.out.println("D����");
				break;
			default:
				System.out.println("F����");
				break;
			}
		}
	}
}
