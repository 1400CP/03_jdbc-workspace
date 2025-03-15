package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.BookController;
import com.kh.model.vo.Book;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public static void printBooks(ArrayList<Book> bs) {
		BookController bc = new BookController();
		
		for(Book b : bs) {
			bc.addBook(b);
			System.out.println(b);
		}


		boolean flag = true; // 메뉴 스위치
	
		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");

			System.out.println("===============================");
			
			sc.nextLine();

			System.out.print("메뉴번호를 입력해주세요 : ");
			int search = sc.nextInt();
			
			if (search == 1) {
				System.out.println(bc.getAllBook());
				
			} else if (search == 2) {
				System.out.println(bc.onlySearchBook());

			} else if (search == 3) {
				ArrayList<Book> magazineList = bc.onlySearchMagazine();
				
				for(Book b : magazineList) {
					System.out.println(b);
				}
				
			} else if (search == 4) {
				flag = true;
			}
			
			break;
			
		case 2:
			System.out.print("책 번호를 입력하세요 : ");
			String bNo = sc.nextLine();
			
			System.out.print("책 제목을 입력하세요 : ");
			sc.nextLine();
			String title = sc.nextLine();
			
			System.out.print("작가를 입력하세요 : ");
			String author = sc.nextLine();
			
			System.out.print("출판사를 입력하세요 : ");
			String publisher = sc.nextLine();
			
			System.out.print("가격을 입력하세요 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("간단한 설명을 입력하세요 : ");
			String description = sc.nextLine();
			
			System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
			Boolean bkOrMaga = sc.nextBoolean(); // bkOrMaga = 0x123
			
			System.out.println("=========================================");
			
			
			if (bkOrMaga.equals(true)) { // 일반 도서
				bc.addBook(new Book(bNo, title, author, publisher, price, description));
				
			} else if (bkOrMaga.equals(false)) { // 잡지 도서 추가
				
				System.out.print("출간연도를 입력하세요 : ");
				int year = sc.nextInt();
				
				System.out.print("출간월을 입력하세요 : ");
				int month = sc.nextInt();
				
				bc.addBook(new Magazine(bNo, title, author, publisher, price, description, year, month));
									
			} break;
			
		case 3:// 3. 책 찾기
			System.out.println("===============================");
			System.out.println("어떤 방법으로 책을 찾겠습니까?");
			System.out.println("1. bNo으로 책 찾기");
			System.out.println("2. 책 제목으로 책 찾기");
			System.out.println("3. 출간연도로 잡지 찾기");
			System.out.println("4. 출판사로 책 찾기");
			System.out.println("5. 특정 가격 밑으로 책 찾기");
			System.out.println("6. 이전으로");
			System.out.println("===============================");
			System.out.print("메뉴번호를 입력해주세요 : ");
			search = sc.nextInt();
			sc.nextLine();

			
			if (search == 1) {						// bNo으로 책 찾기
				
				System.out.print("bNo을 입력하세요 : ");
				bNo = sc.nextLine();
				
			} else if (search == 2) {				// 책 제목으로 책 찾기
				System.out.print("책 제목을 입력하세요 : ");
				title = sc.nextLine();
				
				ArrayList<Book> searchList = bc.searchBookByTitle(title);
				
				if(searchList.isEmpty()) {
					System.out.println("책이 없습니다.");
				}else {
					System.out.println(searchList);
				}
			
			} else if (search == 3) {				// 출간연도로 잡지 찾기
				System.out.print("출간연도를 입력하세요 : (올해 --> 2024) : ");
				int year = sc.nextInt();
				
				//magazineOfThisYearInfo()
				
				sc.nextLine();
				ArrayList<Book> mList = bc.magazineOfThisYearInfo(year);
				
				if(mList.isEmpty()) {
					System.out.println(year + "년도에 출간된 잡지가 없습니다.");
				}else {
					System.out.println(mList);
				}
				
			} else if (search == 4) {				// 4. 출판사로 책 찾기 (책 제목 찾기랑 똑같다)
				System.out.print("출판사를 입력하세요 : ");
				publisher = sc.nextLine();
				
				//bc.searchBookByPublisher()
				ArrayList<Book> publishList =  bc.searchBookByPublisher(publisher);
				
					if(publishList.isEmpty()) {
						System.out.println("존재하지 않는 책입니다.");
						
					}else {
						
						for(Book b : publishList) {
							System.out.println(b);
						}
					
					}
				
			} else if (search == 5) {				// 5. 특정 가격 밑으로 책 찾기
				System.out.print("가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				
				//bc.searchBookByPrice()
				ArrayList<Book> pList = bc.searchBookByPrice(price); // [] | 뭐라도 담겨있음
				
				if(pList.isEmpty()) {
					System.out.println((price + "원 가격보다 싼 책은 없다."));
				}else {
					System.out.println(pList);
				}
				
			} else if (search == 6)
				flag = true;						// 6. 이전으로
			
			else
				System.out.println("잘못 입력하셨습니다.");
			
			break;
			
			
		case 4:// 4. 전체책 가격 합계 및 평균 조회
			
			System.out.println("전체 책 가격 합계 : " );
			System.out.println(bc.getTotalPrice());
			
			System.out.println("전체 책 가격 평균 : " );
			System.out.println(bc.getAvgPrice());
			
			break;
			
		case 5: 
			System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
			
			return;
			
		default:
			
			break;
			
		}
		
	}
	
}
