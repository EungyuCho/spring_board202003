# 스프링 게시판 복습👨‍💻
<hr/><br/>


<h2> 개발환경🔧</h2>
<h6>mysql 8.0.19</h6>
<h6>sts 3.9.11</h6>
<h6>mybatis 3.4.1</h6>
<h6>lombok 1.18.2</h6>
<h6>java1.8</h6>
<hr/>

<h2>구현 로그</h2>
<ol>
    <li>      
      pom.xml dependency setting
    </li>
    <li>      
      web.xml encoding, htmlmethodfilter setting
    </li>
    <li>      
      root-context mybatis setting(datasource, sqlSessionFactory, sqlsession), componenet scan base package setting, mybatis-config 생성
    </li>
    <li>      
      resource/mappers/boardMapper.xml 생성해서 mybatis, namespace(com.board.mappers.board), query setting 
    </li>
    <li>      
      boardVO(dto) 생성해서 @Data로 getter setter 등록
    </li>
    <li>      
      dao interface, class 생성해서 @repository 붙혀주고 sqlSession @inject받고나서 private static으로 namespace 인스턴스화하고 하위 메서드 오버라이딩
    </li>
    <li>      
      service 인터페이스, 클래스 구현
    </li>
    <li>      
      controller bookservice @inject로 DI받고 @controller설정 및 mapping 파일 설정
    </li>
    <li>      
      view 생성
    </li>
</ol>
