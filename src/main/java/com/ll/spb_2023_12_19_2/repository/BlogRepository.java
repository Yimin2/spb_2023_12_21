package com.ll.spb_2023_12_19_2.repository;

import com.ll.spb_2023_12_19_2.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
