package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestRun {
	
	public static void main (String[] args) {
		
		/*
		 * JDBC용 객체 // JAVA에서 객체는 전부 주소값을 가지고 있다.
		 * - Connection : DB의 연결정보를 담고있는 객체
		 * - [Prepared]Statement : 연결된 DB에 SQL문을 전달해서 실행하고 그 결과를 받아내는 객체 ******
		 * - ResultSet : SELECT문 실행 후 조회된 결과물들이 담겨있는 객체
		 * 
		 * * JDBC 과정 (순서중요!)
		 * 1) jdbc driver 등록 : 해당 DBMS(오라클)가 제공하는 클래스 등록
		 * 2) Connection 생성 : 연결하고자 하는 DB정보 입력해서 해당 DB와 연결하면서 생성
		 * 3) Statement 생성 : Connection 객체를 이용해서 생성 (sql문 실행 및 결과받는 객체)
		 * 4) sql문 전달하면서 실행 : Stastment 객체를 이용해서 sql문 실행
		 * 5) 결과 받기
		 * 		> SELECT문 실행 => ResultSet 객체 (조회된 데이터들이 담겨있음) => 6_1)
		 * 		> 	DML문 실행 => int (처리된 행수)						=> 6_2)
		 * 
		 * 6_1) ResultSet에 담겨있는 데이터들을 하나씩 하나씩 뽑아서 vo객체에 주섬주섬 옮겨 담기 [+ ArrayList에 담게 되는 것]
		 * 6_2) 트랜젝션 처리 (성공적으로 수행했으면 commit, 실패했으면 rollback)
		 * 
		 * 7) 다 사용한 JDBC용 객체들 반드시!!! 자원 반납(close) -- 반납은 역순으로 3, 2, 1로 해야 한다.
		 * => 생성된 역순으로
		 */
		
		// 1. 각자 pc(localhost)에 JDBC계정에 연결한 후 TEST 테이블에 INSERT 해보기
		// insert문 => 처리된 행수 (int) => 트랜젝션 처리
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		
		
		// 필요한 변수들 먼저 셋팅
		int result = 0;			// 결과(처리된 행수)를 받아줄 변수
		// 자료형 conn = 값;
		Connection conn = null;	// DB의 연결정보를 보관할 객체
		// Statement stmt = 값;
		Statement stmt = null; // sql문 전달해서 실행 후 결과 받는 객체
		
		// 앞으로 실행할 sql문 ("완성형태"로 만들어두기) (맨 뒤에 세미콜론 없어야 됨!!)
		// String sql = "INSERT INTO TEST VALUES(1, '차은우', SYSDATE)";
		// String sql = "INSERT INTO TEST VALUES(" + num + ", ' " +  name , " ', SYSDATE)" ;
		String sql = "INSERT INTO TEST VALUES(" + num + ", '" + name + "', SYSDATE)";


		// Class.forName(클래스명)
		// Class.forName("oracle.jdbc.driver.클래스명"); => try ~~~ catch 문
		// Class.forName("oracle.jdbc.driver.클래스명")
		//					패키지명,			클래스명
		//				java가 제공하는 게 아님, 오라클이 제공하는 패키지임.
		//				그 패키지, dev의 폴더에 있는 것을 연동할 것임.
		try {
			
			// 1) jdbc driver 등록
			// 외부 파일을 마치 내것처럼 등록하겠다라는 의미!
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ojdbc6.jar 파일을 추가 안 했을 경우 예외가 발생함. | 추가는 했는데 오타가 있을 경우 => 예외가 발생함.
			System.out.println("jdbc driver 등록 성공");
			
			// 2) Connection 객체 생성 : DB에 연결 (url, 계정명, 비밀번호)
			// DriverManager.getConnection("jdbc:oracle:thin:127.0.0.1", "JDBC", "JDBC")
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			// 3) Statement 객체 생성
			stmt = conn.createStatement(); // 이걸로 끝입니다.
			
			// 4, 5) sql문 전달하면서 실행 후 결과 받기 (처리된 행수)
			// result = stmt.executeUpdate(내가실행할쿼리문);
			result = stmt.executeUpdate(sql);
			// 내가 실행할 sql문이 dml문(insert, update, delete) => stmt.executeUpdate("dml문") : int
			// 내가 실행할 sql문이 select문 => stmt.executeQuery("select문") : ResultSet
			
			// 6) 트랜젝션 처리
			if(result > 0) { // 성공했을 경우 commit;
				conn.commit();
			}else { // 실패했을 경우 rollback;
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			// 7) 다 사용한 jdbc 자원 반납 (생성된 역순으로)
			
			try {
				stmt.close(); // 예외처리 -- 1번
				conn.close(); // -- 2번
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
			
		if(result > 0) {
			System.out.println("성공적으로 삽입되었습니다.");
		}else {
			System.out.println("실패했습니다!!!!!!!");
		}
		
		*/
		
		
		// 2. 내 PC의 DB상에 JDBC계정에 TEST테이블의 모든 데이터 조회해보기
		//		select문 => 결과 ResultSet(조회된 데이터들 담겨있음) 받기 => ResultSet으로부터 데이터 뽑기
		
		// 필요한 변수들 셋팅
		Connection conn = null; // 객체는 항상 주소값을 가지고 있기 때문에 null; 로 초기화를 줌.
		Statement stmt = null;
		ResultSet rset = null; // select문이 실행되어 조회된 결과값들이 처음에 실질적으로 담기는 객체
		
		// 실행할 sql문
		String sql = "SELECT * FROM TEST WHERE TNAME LIKE '차%'";
		
		// 1) jdbc driver 등록
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			// 3) Statement 객체 생성 -- 필수 생성
			stmt = conn.createStatement();
			
			// 4, 5) sql문 전달해서 실행 후 결과 받기 (ResultSet)
			// rset = stmt.executeQuery(쿼리문)
			rset = stmt.executeQuery(sql); // 데이터 개수만큼 돌려야 한다.
			// rset에는 커서의 개념이 있다.
			// rset.next
			
			
			// 6)
			while(rset.next()) { // 행 커서 움직여주는 역할, 뿐만 아니라 해당 행이 있으면 true, 없으면 false
				// 현재 참조하는 rset으로부터 어떤 컬럼에 해당하는 값을 어떤 타입으로 뽑을건지 제시해야 됨!
				int tno = rset.getInt("TNO");
				String tname = rset.getString("TNAME");
				Date tdate = rset.getDate("TDATE");
				
				System.out.println(tno + ", " + tname + ", " + tdate);
				
			} // 계속 다음 커서로 이동함. => 다 뽑으면 false로 끝남
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 7) 다 쓴 jdbc용 객체 반납
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}