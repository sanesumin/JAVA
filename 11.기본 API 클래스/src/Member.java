
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		System.out.println(hashcode());
		System.out.println(id.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
