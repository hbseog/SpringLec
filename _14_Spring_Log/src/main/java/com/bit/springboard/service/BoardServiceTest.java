package com.bit.springboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.springboard.dto.BoardDTO;
import com.bit.springboard.dto.UserDTO;
import com.bit.springboard.service.impl.UserDAO;

public class BoardServiceTest {
//	@Autowired
//	@Qualifier("userService")
//	UserService userService;
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		//1. 스프링 컨테이너 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("root-context.xml");
//		
//		//2. BoardService 변수의 의존성 검색과 의존성 주입
//		BoardService boardService = 
//				(BoardService)factory.getBean("boardService");
//		
//		//3. 글 등록 테스트
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setBoardTitle("test 제목");
//		boardDTO.setBoardContent("test 내용입니다.");
//		boardDTO.setBoardWriter("관리자");
//		
//		//boardService.insertBoard(boardDTO);
//		
//		//글 수정 테스트
//		BoardDTO updateBoard = new BoardDTO();
//		updateBoard.setBoardNo(1);
//		updateBoard.setBoardTitle("update 제목");
//		updateBoard.setBoardContent("update 내용입니다.");
//		
//		//boardService.updateBoard(updateBoard);
//		
//		//글 삭제 테스트
//		boardService.deleteBoard(2);
//		
//		//4. 글 상세 조회 테스트
//		BoardDTO returnBoard = boardService.getBoard(1);
//		
//		//글 목록 조회 테스트
//		List<BoardDTO> boardList = boardService.getBoardList();
//		
//		for(BoardDTO board : boardList) {
//			System.out.println(board);
//		}
//		
//		System.out.println(returnBoard);
		
		
//		--------------------------------------------------------------------------------------
		
		UserService userService = 
				(UserService)factory.getBean("userService");
//		//1.회원가입 테스트
//		UserDTO userDTO = new UserDTO();
//		userDTO.setUserId("bit");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("황보석");
//		userDTO.setUserEmail("lllhades@naver.com");
//		userDTO.setUserTel("010-8997-5101");
//		userService.join(userDTO);
//		
		//2.유저검색 테스트
//		UserDTO userDTO2 = ;
		System.out.println(userService.getUser(1));
		
		//5. 스프링 컨테이너 종료
		factory.close();
		

		
		
	}

}
