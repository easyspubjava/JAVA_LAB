package collection.arraylist;

import java.util.ArrayList;  // 사용할 클래스 import
import java.util.Iterator;

import collection.Member;    

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList 선언 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member){  //ArrayList 에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(i);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;                   
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
