package com.ll.spb_2023_12_19_2.service;

import com.ll.spb_2023_12_19_2.domain.Article;
import com.ll.spb_2023_12_19_2.dto.AddArticleRequest;
import com.ll.spb_2023_12_19_2.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntitiy());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
