package com.ll.spb_2023_12_19_2.dto;

import com.ll.spb_2023_12_19_2.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntitiy() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
