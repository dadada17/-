package com.dada.json;

import jakarta.persistence.*;
import lombok.Data;

//db에 json파일 저장하고 싶을 때 테이블 생성 시 컬럼 맞쳐주고
// INSTALL SONAME 'ha_connect'; -> 먼저 실행

// create table 테이블 이름 (
//    json 데이터의 컬럼 맞춰서 생성
// )
// engine=CONNECT table_type=JSON
// File_name='c:\\ 파일경로';


@Entity
@Data//lombok 어노태이션
public class Json {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long user_id;
    private String username;
    private Integer post_count;

}
