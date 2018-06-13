package collection.linkedlist;

import java.util.LinkedList;

import collection.Member;

public class MemberLinkecList {

	private LinkedList<Member> linkedList;

	public MemberLinkecList(){
		linkedList = new LinkedList<Member>();
	}
	
	public void addMember(Member member){
		linkedList.add(member);
	}
	
	public boolean removeMember(int memberId){
		
		for(int i =0; i<linkedList.size(); i++){
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){
				linkedList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		for(Member member : linkedList){
			System.out.println(member);
		}
		System.out.println();
	}
}
