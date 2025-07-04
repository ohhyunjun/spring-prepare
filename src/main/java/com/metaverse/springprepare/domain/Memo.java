package com.metaverse.springprepare.domain;

import lombok.*;

//@Getter
//@Setter //값 변경
@NoArgsConstructor // 기본 생성자 애너테이션
@AllArgsConstructor // 모든 필드를 파라미터로 받는 생성자
@RequiredArgsConstructor //
public class Memo {
    private String username;
    private String content;
    private String description;
    private String password;


}

