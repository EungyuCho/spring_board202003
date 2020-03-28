package com.board.controller;

import java.awt.print.Book;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.board.dao.BoardDAO;
import com.board.dto.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception{
		List<BoardVO> list = boardService.list();
		model.addAttribute("list", list);
	}

	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public ModelAndView writeForm() throws Exception{
		return new ModelAndView("board/boardWrite");
	}
	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public String write(@ModelAttribute("BoardVO") BoardVO board) throws Exception{
		boardService.boardInsert(board);
		return "redirect://localhost:8080/board/list";
	}
	

	
	@RequestMapping(value = "/{bno}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable int bno) throws Exception{
		BoardVO board = boardService.boardDetail(bno);
		boardService.hitPlus(bno);
		return new ModelAndView("board/boardView", "board", board);
	}
	
	@RequestMapping(value="/post/{bno}", method = RequestMethod.GET)
	public ModelAndView updateForm(@PathVariable("bno") int bno) throws Exception{
		BoardVO board = boardService.boardDetail(bno);
		return new ModelAndView("board/boardUpdate", "board", board);
	}
	
	
	@RequestMapping(value="/post/{bno}", method = RequestMethod.PATCH)
	public String update(@ModelAttribute("BoardVO") BoardVO board, @PathVariable("bno") int bno) throws Exception{
		boardService.boardUpdate(board);
		return "redirect://localhost:8080/board/"+bno;
	}
	
	@RequestMapping(value="/post/{bno}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("bno") int bno) throws Exception{
		boardService.BoardDelete(bno);
		return "redirect://localhost:8080/board/list";
	}
}
