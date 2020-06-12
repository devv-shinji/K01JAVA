package ex21jdbc.shopping;

import java.sql.SQLException;
import java.text.DecimalFormat;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl{

	//생성자메소드
	public SelectShop() {
		super("kosmo", "1234");
	}
	
	
	/*
	ResultSet 클래스
		: select문 실행시 쿼리의 실행결과가 ResultSet객체에 저장된다.
		결과로 반환된 레코드의 처음부터 마지막까지 next()메소드를 통해
		확인 후 반복하면서 추출하게 된다.
		
		- getXXX()계열의 메소드
		 	오라클의 자료형이
			number타입: getInt()
			char/varchar2타입: getString()
			date타입: getDate()
			메소드로 각 컬럼의 데이터를 추출한다.
		- 인자는 select절의 컬럼순서대로 인덱스(1부터시작)를 사용하거나 컬럼명을 사용할 수 있다.
		- 자료형에 상관없이 getString() 으로 모든 데이터를 추출할 수 있다.--출력 땐 모든 데이터를 문자형으로 출력하기 때문
	 */
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			//아래 숫자포맷 처리를 자바에서 하고 있지만, DB에게 to_char로 역할을 넘기는 것이 좋은 방법이다. 
			DecimalFormat formatter = new DecimalFormat("###,###");
			String goodsname = scanValue("상품명");
			
			String query = "SELECT g_idx, goods_name, goods_price, "
					+ "to_char(regidate, 'yyyy.mm.dd hh24:mi') format1, p_code "
					+ "FROM sh_goods WHERE goods_name='"+ goodsname +"' ORDER BY regidate desc";
			
			/*String query = "SELECT g_idx, goods_name, to_char(goods_price, '9,999,000'), "
					+ "to_char(regidate, 'yyyy.mm.dd hh24:mi') format1, p_code "
					+ "FROM sh_goods WHERE goods_name='"+ goodsname +"' ORDER BY regidate desc";*/
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String idx = rs.getString(1);
				String name = rs.getString(2);
				String price = formatter.format(rs.getInt(3));
				/*String price = rs.getString(3);*/
				String regidate = rs.getString(4);
				String p_code = rs.getString(5);
				
				System.out.printf("| 일련번호:%s | 상품명:%s | 가격:%s | 등록일:%s | 제품코드:%s |\n", 
						idx, name, price, regidate, p_code);
				
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close(); //DB 자원반납
		}
	}
	
	public static void main(String[] args) {
		new SelectShop().execute();
	}
}
