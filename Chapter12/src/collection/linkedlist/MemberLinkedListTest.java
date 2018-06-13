package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkecList memberArrayList = new MemberLinkecList();
		
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");
		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}
