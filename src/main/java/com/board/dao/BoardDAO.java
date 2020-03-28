package com.board.dao;

import java.util.List;

import com.board.dto.BoardVO;

public interface BoardDAO {
	public List<BoardVO> list() throws Exception;
}
