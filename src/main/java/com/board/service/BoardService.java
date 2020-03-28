package com.board.service;

import java.util.List;

import com.board.dto.BoardVO;

public interface BoardService {
	
	public List<BoardVO> list() throws Exception;

}
