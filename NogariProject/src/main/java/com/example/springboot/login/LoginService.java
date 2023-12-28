package com.example.springboot.login;

import java.util.List;
import java.util.Map;

import com.example.springboot.login.domain.MemberVO;
import com.example.springboot.login.domain.ResultVO;

public interface LoginService {

	/*
	 * 로그인
	 */
	ResultVO<String> doLogin(Map<String, String> param) throws Exception;

	/*
	 * 회원가입
	 */
	ResultVO<String> signup(Map<String, String> param) throws Exception;

	/*
	 * 모든 멤버 보기
	 */
	ResultVO<List<MemberVO>> getAllMembers();

}