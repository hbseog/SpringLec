package com.bit.springboard.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.bit.springboard.common.JDBCUtil;
import com.bit.springboard.dto.BoardDTO;
import com.bit.springboard.dto.UserDTO;

@Repository("userDAO")
public class UserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String INSERT_USER = "INSERT INTO T_USER(USER_ID,USER_PW,USER_NAME,USER_EMAIL,USER_TEL)"
			+ " VALUES(?,?,?,?,?)";
	private final String GET_USER = "SELECT * FROM T_USER WHERE ID = ?";
	public void insertUser(UserDTO userDTO) {
		System.out.println("insertBoard 실행");
		
		try {
			//DB Connection 객체 얻기
			conn = JDBCUtil.getConnection();
			
			//실행될 쿼리문 stmt에 담기
			stmt = conn.prepareStatement(INSERT_USER);
			stmt.setString(1, userDTO.getUserId());
			stmt.setString(2, userDTO.getUserPw());
			stmt.setString(3, userDTO.getUserName());
			stmt.setString(4, userDTO.getUserEmail());
			stmt.setString(5, userDTO.getUserTel());
			
			
			//쿼리문 실행
			//insert, delete, update는 executeUpadte 사용
			//select는 executeQuery 사용
			stmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	
	public UserDTO getUser(int userNo) {
		System.out.println("getUser 실행");
		
		UserDTO userDTO = new UserDTO();
		
		try {
			conn = JDBCUtil.getConnection();
			
			stmt = conn.prepareStatement(GET_USER);
			
			stmt.setInt(1, userNo);
			
			//ResultSet은 조회 쿼리 결과 행들을 담아온다.
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				userDTO.setId(rs.getInt("ID"));
				userDTO.setUserId(rs.getString("USER_ID"));
				userDTO.setUserPw(rs.getString("USER_PW"));
				userDTO.setUserName(rs.getString("USER_NAME"));
				userDTO.setUserEmail(rs.getString("USER_EMAIL"));
				userDTO.setUserTel(rs.getString("USER_TEL"));
				userDTO.setUserRegdate(rs.getDate("USER_REGDATE"));
			}
		} catch(Exception e) {
			System.out.println(e.getMessage()+"여기가 에러");
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return userDTO;
	}
	
}
