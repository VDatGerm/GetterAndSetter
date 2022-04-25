package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student arr[] = new Student[10];		
		for (int  i = 0 ; i < arr . length ; i ++) {
			arr[i] = new Student();
			Student s = arr[i];
			System.out.println ( "Nhap Sinh Vien Thu:" + ( i + 1 ));
			
			System.out.println("Nhap ten");
			arr[i].setName(sc.nextLine());
			
			System.out.println("Nhap tuoi");
			arr[i].setOld(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Nhap dia chi");
			arr[i].setAddress(sc.nextLine());
			
			System.out.println("Nhap so dien thoai");
			arr[i].setPhone(sc.nextInt());
			
			System.out.println("Nhap diem trung binh");
			arr[i].setdTB(sc.nextFloat());
			sc.nextLine();
			
			System.out.format("Diem trung binh", arr[i].getdTB());
			
			//in danh sach
			System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s - So dien thoai: %d - Diem trung binh: %.1f", s.getName(),s.getOld(),s.getAddress(),s.getPhone(),s.getdTB());
		}
			for (int i = 0; i < arr.length -1; i++) {
				for (int j = 0 + 1; j < arr.length; j++) {
					if(arr[i].getdTB() > arr[j].getdTB());
					Student p = arr[j];
					arr[j] = p;
				}
			}
		}
			
}