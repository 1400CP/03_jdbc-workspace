package com.kh.controller;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;
import com.kh.model.vo.Magazine;

public class BookService {
	
	public int inputBookMenu(Book b) {
		Connection conn = getConnection();
		
		int result = new BookDao().inputBookMenu(conn, b);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
		
	}
	
	public int inputMagazineMenu(Magazine m) {
		Connection conn = getConnection();
		
		int result = new BookDao().inputMagazineMenu(conn, m);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
		
	}
	
	
	// case3_1
	public Book selectBNo(String bNo) {
		// select문, driver, Connection
		Connection conn = getConnection();
		Book b = new BookDao().selectBNo(conn, bNo);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
	}
	
	// case3_2
	public Book selectTitle(String title) {
		// select문, driver, Connection
		Connection conn = getConnection();
		Book b = new BookDao().selectTitle(conn, title);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
	}
	
	//case3_3
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public Magazine selectYear(String year) {
		// select문, driver, Connection
		Connection conn = getConnection();
		Magazine m = new BookDao().selectYear(conn, year);
		
		if(m == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return m;
	}
	
	//case3_4
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public Book selectPs(String publisher) {
		// select문, driver, Connection
		Connection conn = getConnection();
		Book b = new BookDao().selectPs(conn, publisher);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
	}
	
	//case3_5
	// selcect인데 ArrayList가 필요했네. 여러행이었다. 수정필요.
	public Book selectPrice(String price) {
		// select문, driver, Connection
		Connection conn = getConnection();
		Book b = new BookDao().selectPrice(conn, price);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
	}
	
	//case4_1, return을 뭘로 해야 하나?
	public Book getTotalPrice() {
		//driver, Connection, 
		Connection conn = getConnection();
		Book b = new BookDao().getTotalPrice(conn);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
		
	}
	
	//case4_2
	public Book getAvgPrice() {
		//select문 - 한 행 - Book b
		//driver, Connection
		Connection conn = getConnection();
		Book b = new BookDao().getAvgPrice(conn);
		
		if(b == null) {
			rollback(conn);
		}else {
			commit(conn);
		}
		close(conn);
		return b;
		
	}
	
	//case2_1
	public void selectList1() {
		
		
		
	}
	
	//case2_2
	public void selectList2() {
		//select문, ArrayList
		//driver, Connection
		Connection conn = getConnection();
		new BookDao().selectList2(conn);
		
		
	}

}
