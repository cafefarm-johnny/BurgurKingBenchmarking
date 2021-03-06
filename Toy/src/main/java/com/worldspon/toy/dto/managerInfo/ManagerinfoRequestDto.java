package com.worldspon.toy.dto.managerInfo;

import com.worldspon.toy.entity.Managerinfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ManagerinfoRequestDto {

	/**
	 * Managerinfo 요청 전용 DTO 클래스
	 * -------------------------------------
	 * 컬럼명		| 설명
	 * -------------------------------------
	 * managername		| 매니저 이름 정보
	 * managerid		| 매니저 아이디 정보
	 * managerpwd		| 매니저 비밀번호 정보
	 * -------------------------------------
	 * */
	private Long mid;
	private String managername;
	private String managerid;
	private String managerpwd;
	private String sessionid;
	
	public Managerinfo toEntity() {
		return Managerinfo.builder()
				.mid(mid)
				.managername(managername)
				.managerid(managerid)
				.managerpwd(managerpwd)
				.sessionid(sessionid)
				.build();
	}
}
