package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.dto.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

	@Override
	public int boardCount() throws Exception {
		return dao.boardCount();
	}

	@Override
	public BoardVO boardDetail(int bno) throws Exception {
		return dao.boardDetail(bno);
	}

	@Override
	public void boardInsert(BoardVO boardDAO) throws Exception {
		dao.boardInsert(boardDAO);
	}

	@Override
	public void boardUpdate(BoardVO boardDAO) throws Exception {
		dao.boardUpdate(boardDAO);
	}

	@Override
	public void BoardDelete(int bno) throws Exception {
		dao.BoardDelete(bno);
	}

	@Override
	public void hitPlus(int bno) throws Exception {
		dao.hitPlus(bno);		
	}
}
