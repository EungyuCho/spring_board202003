package com.board.dao;

import java.util.List;

import com.board.dto.BoardVO;

public interface BoardDAO {
	public List<BoardVO> list() throws Exception;
	public int boardCount() throws Exception;
	public BoardVO boardDetail(int bno) throws Exception;
	public void boardInsert(BoardVO BoardVO) throws Exception;
	public void boardUpdate(BoardVO BoardVO) throws Exception;
	public void BoardDelete(int bno) throws Exception;
	public void hitPlus(int bno) throws Exception;
}
