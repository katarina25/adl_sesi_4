package adl_days4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array array = new Array();
		//array.bljr();
		array.cth();
	}
	
	public void bljr()
	{
		
		int[] myarray;
		//deklarsi variable hanya size
		myarray = new int[10];
		//deklarsi dengan isi array
		int array1 []= {3,4,2,5,4,7,8,5,9};
		myarray[0]=1;
		myarray[4]=1;
		
		System.out.println("\n\nprint array secara manual");
		for (int i =0;i<myarray.length; i++) {
			System.out.print(myarray[i] + " ");
		}
		
		System.out.println();
		
		for (int angka : array1) {
			System.out.print(angka+ " ");
			
		}
		
		System.out.print("====address sebelum passing reference==== ");
		System.out.print(myarray);
	}

	public void cth() {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah barang : ");
		int jmlh = scan.nextInt();
		String[] barang = new String[jmlh];
		for (int i=0;i<barang.length;i++) {
			System.out.print("masukan barang indeks ke "+ i + " = ");
			barang[i]=scan.next ();
		}
		
		for(String namaBarang : barang) {
			System.out.println(namaBarang);
		}
		
		
		
	}
	public void nilaiMhs() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan jumlah data mahasiswa : ");
		
		int jmlh = scan.nextInt();
		String[] namaMhs = new String[jmlh];
		int[] nilai = new int[jmlh];
		for (int i=0;i<jmlh;i++) {
			System.out.print("masukan nama mahasiswa ke "+ i + " = ");
			namaMhs[i]=scan.next ();
			System.out.print("masukan nilai mahasiswa ke "+ i + " = ");
			
		}
		
		for(String namaBarang : barang) {
			System.out.println(namaBarang);
		}
	}
	
}
