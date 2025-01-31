package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;
import com.kh.view.MemberMenu;

// Controller : View를 통해서 사용자가 요청한 기능에 대해서 처리하는 담당
//				해당 메소드로 전달된 데이터 [가공처리 한 후] Dao로 전달하면서 호출하는 역할
//              Dao로 부터 반환 받은 결과에 따라 성공인지 실패인지 판단 후 응답화면 결정(View 메소드 호출)
public class MemberController {
	
	/** 
	 * 사용자가 회원 추가 요청을 처리해주는 메소드 
	 * @param userId   : 사용자가 입력했던 정보들이 담겨있는 매개변수 
	 * @param userPwd
	 * @param userName
	 * @param gender
	 * @param age
	 * @param email
	 * @param phone
	 * @param address
	 * @param hobby
	 */
	public void insertMember(String userId, String userPwd, String userName, String gender, String age, String email,
			String phone, String address, String hobby) {
			
		// view로 부터 전달받은 값을 바로 dao 쪽을 전달 x
		// 어딘가에(Member 객체_ 주섬주섬 담아서 전달
		
		// 방법1) 기본생성자로 생성한 후 각 필드의 setter 메소드를 통해서 일일히 담는 방법
		// Member m = new Member(); -- getter/setter
		// 방법2) 아싸리 매개변수 생성자로 생성과 동시에 담는 방법
		
		Member m = new Member(userId, userPwd, userName, gender, Integer.parseInt(age), email, phone, address, hobby);
		// age는 형변환을 해야 한다. int 와 String은 다르니까
		// System.out.println(m);
		
		int result = new MemberDao().insertMember(m);
		
		if(result > 0 ) {	// 성공
			new MemberMenu().displaySuccess("성공적으로 회원 추가 되었습니다.");
		}else { 			// 실패
			new MemberMenu().displayFail("회원 추가를 실패했습니다.");
		}
		
		
		/**
		 * 사용자의 회원 전체 조회 요청을 처리해주는 메소드
		 */}
	
	public void selectList() {
		ArrayList<Member> list = new MemberDao().selectList();
	
	// 조회 결과가 있는지 없는지 판단 한 후 사용자가 보게될 응답화면 결정
	if(list.isEmpty()) { 					// 텅 비어있을 경우 == 조회된 데이터 없었을 경우
			new MemberMenu().displayNoData("전체 조회 결과가 없습니다");
		}else { 							// 뭐라도 조회된 데이터가 있을 경우
			new MemberMenu().displayMemberList(list);
		}					
	}													
							
	/**
	 * 사용자의 아이디로 회원 검색 요청을 처리해주는 메소드
	 * @param userId 사용자가 입력한 검색하고자 하는 회원 아이디값
	 */
	public void selectByUserId(String userId) {
		Member m = new MemberDao().selectByUserId(userId);
		
		if(m == null) {		// 검색 결과가 없을 경우 (조회된 데이터 없음)
			new MemberMenu().displayNoData(userId + "에 해당하는 조회결과가 없습니다.");
		}else {				// 검색 결과가 있을 경우 (조회된 데이터 한 행 있음)
			new MemberMenu().displayMemberList(m);
			
		}
	}
	
	/**
	 * 이름으로 키워드 검색 요청시 처리해주는 메소드
	 * @param keyword		사용자가 입력한 검색할 회원명(키워드)
	 */
	public void selectByUserName(String keyword) {								// list -> 1) 텅빈 리스트 
		ArrayList<Member> list = new MemberDao().selectByUserName(keyword);		// 		or 2) 뭐라도 있는 리스트
		
		if(list.isEmpty()) {			// 텅빈 리스트일 경우 => 검색 결과 없음
			new MemberMenu().displayNoData(keyword + "에 해당하는 검색결과가 없습니다.");
		}else {							// 뭐라도 있는 경우
			new MemberMenu().displayMemberList(list);							// 메소드 재활용 가능!!
		}
	}
		
	
	/**
	 * 정보 변경 요청을 처리해주는 메소드
	 * @param userId		: 변경하고자 하는 회원 아이디
	 * @param userPwd		: 변경할 비밀번호
	 * @param email			: 변경할 이메일
	 * @param phone			: 변경할 전번
	 * @param address		: 변경할 주소
	 */
	public void updateMember(String userId, String userPwd, String email, String phone, String address) {
		
		Member m = new Member(); // 기본 생성자? 매개 변수 생성자?? 자기 맘대로 하면 된다. 다만, 매개 변수 생성자는 vo(그릇)을 건드려야 한다.
		m.setUserId(userId);
		m.setUserPwd(userPwd);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
								// 현재는 기본 생성자에서 작업처리함.
		
		// new MemberDao().updateMember(m); // Member 에서 m은 반드시 줘야합니다. (변수 중요!)
		
		// result는 int 형으로 출력됨.
		int result = new MemberDao().updateMember(m);
		
		if (result > 0) {			// 성공
			new MemberMenu().displaySuccess("성공적으로 회원 정보가 변경되었습니다.");
		}else {						// 실패
			new MemberMenu().displayFail("회원 정보 변경에 실패하였습니다.");
		}
		
		
	}

	/*
	public void deleteMember(String userId) {
		Member m = new Member();
		m.setUserId(userId);
		
		int result = new MemberDao().deleteMember(m);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보가 변경되었습니다.");
		}else {
			new MemberMenu().displayFail("다시 입력");
		}
		
		
	}
	*/
	
	/**
	 * 회원 탈퇴 요청 처리해주는 메소드
	 * @param userId	사용자가 입력한 탈퇴시키고자 하는 회원 아이디값
	 */
	public void deleteMember(String userId) {
		
		int result = new MemberDao().deleteMember(userId);
		
		if (result > 0) {	// 성공
			new MemberMenu().displaySuccess("성공적으로 탈퇴했습니다.");
		}else {				// 실패
			new MemberMenu().displayFail("실패했습니다. 다시 시도하세요.");
		}
		
		
		
		
	}
	
}
