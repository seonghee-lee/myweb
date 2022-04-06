package com.heeracle.myweb.controller;

import com.heeracle.myweb.model.Board;
import com.heeracle.myweb.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardApiController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/test")
    List<Board> all(){
        return boardRepository.findAll();
    }
}
