package com.t3h.news.controller;

import com.t3h.news.model.entity.News;
import com.t3h.news.service.INewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private INewsService iNewsService;

    public NewsController(INewsService iNewsService){
        this.iNewsService = iNewsService;
    }

    @GetMapping()
    public ResponseEntity<List<News>> getList(){
        return ResponseEntity.ok(iNewsService.getListNew());
    }

    @PostMapping()
    public ResponseEntity<List<News>> create(@RequestBody News newNews){
        iNewsService.save(newNews);
        return ResponseEntity.ok(iNewsService.getListNew());
    }
}
