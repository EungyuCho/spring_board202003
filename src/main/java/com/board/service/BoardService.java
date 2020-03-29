package com.board.service;

import java.util.List;

import com.board.common.Pagination;
import com.board.dao.BoardDAO;
import com.board.dto.BoardVO;

public interface BoardService {
	
	public List<BoardVO> list(Pagination pagination) throws Exception;
	public int boardCount() throws Exception;
	public BoardVO boardDetail(int bno) throws Exception;
	public void boardInsert(BoardVO BoardVO) throws Exception;
	public void boardUpdate(BoardVO BoardVO) throws Exception;
	public void BoardDelete(int bno) throws Exception;
	public void hitPlus(int bno) throws Exception;
}
