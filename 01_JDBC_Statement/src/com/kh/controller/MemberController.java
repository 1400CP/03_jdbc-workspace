package com.kh.controller;

import com.kh.model.vo.Member;

// Controller : View를 통해서 사용자가 요청한 기능에 대해서 처리하는 담당
//				해당 메소드로 전달된 데이터 [가공처리 한 후] Dao로 전달하면서 호출
//				Dao로부터 반환받은 결과에 따라 성공인지 실패인지 판단 후 응답화면 결정(View 메소드 호출)

public class MemberController {
	
	/**
	 * 사용자가 회원 추가 요청을 처리해주는 메소드
	 * @param userId ~ hobby : 사용자가 입력했던 정보들이 담겨있는 매개변수
	 * 
	 */
	public void insertMember(String userId, String userPwd, String userName, String gender, String age, String email, String phone, String address, String hobby) {
		
		// view로부터 전달받은 값을 바로 dao쪽으로 전달 x
		// 어딘가에 담아서 전달
		// => vo(Member 객체)
		
		// 방법1) 기본생성자로 생성한 후 각 필드의 setter 메소드를 통해서 일일이 담는 방법
		// 방법2) 아예 매개변수 생성자로 생성과 동시에 담는 방법
		
		// Member m = new Member(); ==> 기본생성자 (getter-setter)
		Member m = new Member(userId, userPwd, userName, gender, Integer.parseInt(age), email, phone, address, hobby);
		// age는 형변환을 해야 한다. int 와 String은 다르니까
		
		
		
		
		
		
	}
	
	
	
	
}