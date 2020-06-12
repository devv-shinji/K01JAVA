package ex21jdbc.shopping;


import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;
import ex21jdbc.prepared.InsertQuery;

public class InsertShop extends IConnectImpl{
	
	/*
	1.상품입력
		- PreparedStatement객체를 사용하여 작성한다.
		- 클래스명 : ex21jdbc.shopping.InsertShop
		- 상품명, 상품가격, 상품코드를 scanValue() 메소드로 입력받아 사용한다. 
		- 입력이 완료되면 입력된 행의 갯수를 반환하여 출력한다. 
	 */
	public InsertShop() {
		super("kosmo", "1234");
	}

	@Override
	public void execute() {
		try {
			//1. 쿼리문준비: 값의 세팅이 필요한 부분을 ?로 대체한다.
			String query = "INSERT INTO sh_goods VALUES (goods_seq.nextval,?,?,sysdate,?)";
			
			//2. prepared객체 생성: 생성 시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3. DB에 입력할 값을 사용자로부터 입력받음.
			//4. 인파라미터 설정하기: ?의 순서대로 설정하고 DB이므로 인덱스는 1부터 시작.
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			//5. 쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();
			System.out.println(affected + "행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {
		new InsertShop().execute();
	}
}
