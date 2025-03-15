package com.kh.controller;


import java.util.ArrayList;

import com.kh.model.vo.Book;
import com.kh.model.vo.Magazine;
import com.kh.view.BookMenu;

public class BookController {
	public void inputBookMenu(String title, String author, String publisher, String price, String description) {
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublisher(publisher);
		b.setPrice(Integer.parseInt(price));
		b.setDescription(description);
		
		int result = new BookService().inputBookMenu(b);
		
		if(result > 0) {
			new BookMenu().displaySuccess("추가 성공");
		}else {
			new BookMenu().displayFail("입력 실패. 다시 시도해주세요.");
		}
		
	}
	
	
	public void inputMagazineMenu(String title, String author, String publisher, String price, String description, String year, String month) {
		Magazine m = new Magazine();
		m.setTitle(title);
		m.setAuthor(author);
		m.setPublisher(publisher);
		m.setPrice(Integer.parseInt(price));
		m.setDescription(description);
		m.setYear(Integer.parseInt(year));
		m.setMonth(Integer.parseInt(month));
		
		int result = new BookService().inputMagazineMenu(m);
		
		if(result > 0) {
			new BookMenu().displaySuccess("추가 성공");
		}else {
			new BookMenu().displayFail("입력 실패. 다시 시도해주세요.");
		}
		
	}
	
	
	// case 3_1
	public void selectBNo(String bNo) {
		// select문 => 조회할 거임
		Book b = new BookService().selectBNo(bNo);
		
		if(b == null) {
			new BookMenu().displayFail("실패, 다시 시도");
		}else {
			new BookMenu().displayBookList(b);
		}
	}
	
	// case 3_2
	public void selectTitle(String title) {
		Book b = new BookService().selectTitle(title);
		
		if(b == null) {
			new BookMenu().displayFail("실패, 다시 시도");
		}else {
			new BookMenu().displayBookList(b);
		}
		
	}
	
	//case 3_3
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public void selectYear(String year) {
		
		Magazine m = new BookService().selectYear(year);
		
		if(m == null) {
			new BookMenu().displayFail("실패, 다시 시도");
		}else {
			new BookMenu().displayBookList(m);
		}
		
	}
	
	//case3_4
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public void selectPs(String publisher) {
		Book b = new BookService().selectPs(publisher);
		
		if(b == null) {
			new BookMenu().displayFail("실패, 다시 시도");
		}else {
			new BookMenu().displayBookList(b);
		}
		
	}
	
	//case3_5
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public void selectPrice(String price) {
		Book b = new BookService().selectPrice(price);
		
		if(b == null) {
			new BookMenu().displayFail("실패, 다시 시도");
		}else {
			new BookMenu().displayBookList(b);
		}
		
	}
	
	//case4_1, return을 뭘로 해야 하나?
	public void getTotalPrice() {
		//select문에 한 행. 이라고 생각했는데 근데 값은 숫자네? 참조된 행 수int로 박아?
		
		int result = new BookService().getTotalPrice();
				
		if(b == null) {
			new BookMenu().displayNoData("데이터가 없어요. 재시도");
		}else {
			new BookMenu().displayBookList(b);
		}
		
	}
	
	//case4_2
	public void getAvgPrice() {
		//select문 total이라서 group by인데, 이러면 한 행만 나오니까 book b
		Book b = new BookService().getAvgPrice();
				
		if(b == null) {
			new BookMenu().displayNoData("데이터가 없어요. 재시도");
		}else {
			new BookMenu().displayBookList(b);
		}
		
	}
	
	
	//case2_1
	public void selectList1() {
		
		
		
	}
	
	
	//case2_2
	public void selectList2() {
		//select문 일반도서, ArrayList로 가야함.
		ArrayList<Book> list = new ArrayList<Book>();
		new BookService().selectList2();
		
	}

}
