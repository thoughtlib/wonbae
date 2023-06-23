package com.wonbae.wonbae.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import util.ResponseData;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/list")
    public ResponseData<Object> getList() {
        return boardService.getList();
    }

    @PostMapping("/board/upload")
    public ResponseData<Object> create(HttpServletRequest request, 
                                    @RequestParam("data") String jsonData) {
        return boardService.create(request, jsonData);
    }

    @PutMapping("/board/upload")
    public ResponseData<Object> update(HttpServletRequest request, 
                                    @RequestParam("data") String jsonData) {
        return boardService.update(request, jsonData);
    }

    @DeleteMapping("/board/{id}")
    public ResponseData<Object> delete(HttpServletRequest request, @PathVariable Integer id) {
        return null;
    }
}
