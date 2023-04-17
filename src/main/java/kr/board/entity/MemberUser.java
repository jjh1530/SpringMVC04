package kr.board.entity;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

// 인증 후 사용자 정보를 저장
public class MemberUser extends User {  //UserDetails
	
	private Member member;

	public MemberUser(String username, String password, 
			          Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}


	public MemberUser(Member mvo) {
		super(mvo.getMemID(), mvo.getMemPassword(),
			  mvo.getAuthList().stream()
			  .map(auth -> new SimpleGrantedAuthority(auth.getAuth()))
			  .collect(Collectors.toList()));
		this.member=mvo;
		
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}
	
	
	
}
