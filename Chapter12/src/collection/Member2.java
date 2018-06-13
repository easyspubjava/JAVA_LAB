package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{

	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member2(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member2){
			Member2 member = (Member2)obj;
			if( this.memberId == member.memberId )
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		
		return mem1.getMemberId() - mem2.getMemberId();
	}
}
