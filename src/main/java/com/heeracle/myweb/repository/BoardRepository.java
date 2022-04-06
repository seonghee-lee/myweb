package com.heeracle.myweb.repository;

import com.heeracle.myweb.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
