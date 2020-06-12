package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	public UpdateShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("가격"));
			csmt.setString(3, scanValue("제품코드"));
			csmt.setString(4, scanValue("일련번호"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			
			//out파라미터의 할당된 값을 읽어서 결과를 출력한다.
			int affected = csmt.getInt(5);
			if(affected==0)
				System.out.println("오류발생:입력실패");
			else
				System.out.println(affected +"행 입력성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute();

	}
}