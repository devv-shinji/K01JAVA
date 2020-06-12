package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl{
	public DeleteShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			
			csmt.setString(1, scanValue("일련번호"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			
			//out파라미터의 할당된 값을 읽어서 결과를 출력한다.
			int affected = csmt.getInt(2);
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
		new DeleteShop().execute();

	}
}
