package ex20io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
친구를 표현한 최상위 클래스로 해당 프로그램에서는 Friend로 객체생성은 하지 않는다.
상속의 목적으로만 정의된 클래스이다.
 */
abstract class Friend implements Serializable {//상속받아 오버라이딩의 목적으로 선언되었기에 abstract 선언
						//하나라도 추상메소드를 포함하고 있으면 클래스도 추상클래스여야 한다.
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버메소드
	/*
	멤버변수 전체 정보를 출력하는 메소드
	 */
	public void showAllData() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
		System.out.println("주소: "+ addr);
	}
	/*
	간략한 정보만 출력하는 메소드로, 현재 실행부가 없는 상태로 정의되었다. 
	여기서는 오버라이딩을 할 목적으로 정의되었다.
	 */
	public abstract void showBasicInfo();//실행부가 없는 추상메소드 abstract 추가와 {}생략
}

class HighFriend extends Friend {
	String nickname;//Friend 부모클래스를 상속받아, 자식에서 추가로 확장한 멤버변수
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	/*
	고딩친구의 전체정보 출력을 위해 부모에서 정의된 메소드를
	super를 통해 호출하고, 자식에서 확장한 변수를 별도의 print문을 통해 출력하고 있음
	 */
	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명: "+ nickname);
	}
	/*
	자식에서 오버라이딩 하여 재정의한 메소드로 고딩친구의 간략정보를 출력한다.
	 */
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명: "+ nickname);
		System.out.println("전번: "+ phone);
	}
}
	
class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: "+ major);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
	}
}

class FriendInfoHandler {
	//멤버변수
	/*
	Friend타입의 객체배열은 하위클래스인 High, Univ객체를
	모두 저장할 수 있으므로 하나의 배열내에 2개의 객체를 동시에 저장하여 관리할 수 있다.
	 */
	private Friend[] myFriends;//Friend형으로 통합관리가 가능
	private int numOfFriends;//친구정보를 추가할 때마다 +1씩 증가되어 카운팅됨
	
	//생성자: 인자로 전달되는 num크기로 객체배열을 생성한다.
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	//새로운 친구 입력
	public void addFriend(int choice) {
		//사용자로부터 친구정보를 입력받기위한 준비
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		//이름,전화번호,주소는 공통사항. 입력받기
		System.out.print("이름: ");iName = scan.nextLine();
		System.out.print("전화번호: ");iPhone = scan.nextLine();
		System.out.print("주소: ");iAddr = scan.nextLine();
		
		/*
		1. 친구정보를 입력받은후...
		2. 객체배열 0번방에 객체를 저장하고...
		3. numOfFriend 변수를 1 증가시킨다.(후위증가)
		 */
		if (choice==1) {//고딩친구입력
			System.out.print("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		} 
		else if(choice==2) {//대딩친구입력
			System.out.print("전공: "); iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}////end of addFriend
	
	//친구정보 전체보기
	public void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}////end of showAllData
	
	//친구정보 간략보기
	/*
	1. 고딩친구 정보를 Friend 추가
	2. High객체가 Friend타입으로 자동형변환되어 저장
	3. 객체배열에 저장된 객체들을 for문을 통해 순차적으로 출력
		이때, 오버라이딩된 메소드를 통해 항상 해당 객체의
		정보를 출력할 수 있다. (참조변수의 타입에 영향을 받지 않음)
	 */
	public void showSimpleData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다==");
	}////end of showSimpleData
	
	//주소록 검색
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();
		
		for (int i = 0; i < numOfFriends; i++) {
			
			System.out.println("검색중인이름: "+myFriends[i].name);//디버깅용
			
			//검색할 이름과 객체의 이름이 일치하는 경우 모든정보를 출력함
			if (searchName.compareTo(myFriends[i].name)==0) {//일치하면 0
				myFriends[i].showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
			}
		}
	}////end of searchInfo
	
	//주소록 항목 삭제
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		
		/*
		배열의 요소 중 삭제된 요소의 인덱스값을 저장할 용도의 변수
		요소를 삭제한 후 빈자리를 채울 때 사용할 예정임.
		 */
		int deleteIndex = -1;
		
		for (int i = 0; i < numOfFriends; i++) {
			if (deleteName.compareTo(myFriends[i].name)==0) {
				//요소를 삭제하기 위해 참조값을 null로 변경
				myFriends[i] = null;
				//삭제된 요소의 인덱스값 저장
				deleteIndex = i;
				//전체카운트 변수 -1 차감//전체 등록된 인원수 차감
				numOfFriends--;
			}
		}
		if (deleteIndex==-1) {//compareTo로..검색된 결과가 없는 경우.
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			/*
			객체배열에서 검색된 요소를 삭제한 후 입력된 위치의 바로뒤 요소를
			앞으로 하나씩 교환(자리이동)한다.
			 */
			for (int i = deleteIndex; i < numOfFriends; i++) {
				myFriends[i] = myFriends[i+1]; //삭제된 배열의 +1자리부터 앞으로 당긴다.
			}
			System.out.println("==데이터("+ deleteIndex +"번)가 삭제되었습니다==");
		}
	}////end of deleteInfo
	
	//친구정보를 파일형태로 저장하기
	public void saveFriendInfo() {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/friends_info.obj"));
			
			//myFriends 객체배열에 저장된 친구의 정보만큼 반복
			for(int i=0; i<numOfFriends; i++) {
				//객체배열의 i번째 요소를 파일로 저장
				out.writeObject(myFriends[i]);
			}
		}
		catch(Exception e){
			System.out.println("예외발생");
			e.printStackTrace();
		}
	}
	
	
}////end of FriendInfoHandler

public class E13MyFriendSerializableT {
	
	//프로그램에서의 입력메뉴 출력
	public static void menuShow() {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	
	public static void main(String[] args) {
		
		//프로그램 전반에 대한 비즈니스로직을 가진 핸들러 객체 생성
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while (true) {//무한루프
			//메뉴출력을 위한 메소드출력
			menuShow();
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:case 2:
				handler.addFriend(choice);
				break;
			case 3:
				//전체정보출력
				handler.showAllData();
				break;
			case 4:
				//간략정보출력
				handler.showSimpleData();
				break;
			case 5:
				//친구정보검색
				handler.searchInfo();
				break;
			case 6:
				//친구정보삭제
				handler.deleteInfo();
				break;
			case 7: 
				handler.saveFriendInfo();
				System.out.println("프로그램을 종료합니다.");
				return;//main함수의 종료는 프로그램 종료로 이어진다.
			}
		}////end of while
	}////end of main
}////end of class

