package com.heeracle.myweb.controller;

import com.heeracle.myweb.model.Board;
import com.heeracle.myweb.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    //내가 필요한 거: db에 있는 타이틀, 내용, 날짜 ... 날짜 ㅈ같이나옴
    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    @GetMapping("/form")
    public String form(){

        //model.addAttribute("board", new Board());
        return "board/form";
    }

//    @PostMapping("/form")
//    public String formSubmit(){
//
//    }


}
