package exam;
import java.util.Scanner;
public class ScoreMultiIfExam {
	public static void main(String[] args) {
/*���� if, if���� ��ø  scanner Ŭ������ �̿��ؼ� �Է�
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
		
		if (score >=0 & score < 60) {
			System.out.println("F����");
		} else if (score >=60 & score < 70) {
			System.out.println("D����");
		}  else if (score >=70 & score < 80) {
			System.out.println("C����");
		}  else if (score >=80 & score < 90) {
			System.out.println("B����");
		}  else if (score >=90 & score <= 100) {
			System.out.println("A����");
		}  else {
			System.out.println("�߸��� �Է��Դϴ�.");
		} 
	}
}
