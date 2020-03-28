package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.dto.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board.";
	
	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + "list");
	}

	@Override
	public int boardCount() throws Exception {
		return sql.selectOne(namespace + "boardCount");
	}

	@Override
	public BoardVO boardDetail(int bno) throws Exception {
		return sql.selectOne(namespace + "boardDetail", bno);
	}

	@Override
	public void boardInsert(BoardVO boardDAO) throws Exception {
		sql.insert(namespace + "boardInsert", boardDAO);
	}

	@Override
	public void boardUpdate(BoardVO boardDAO) throws Exception {
		sql.update(namespace+"boardUpdate", boardDAO);		
	}

	@Override
	public void BoardDelete(int bno) throws Exception {
		sql.delete(namespace+"boardDelete", bno);
	}

	@Override
	public void hitPlus(int bno) throws Exception {
		sql.update(namespace+"hitPlus", bno);
	}

}
