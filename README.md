### 미니 프로젝트

## 스프링 주말 연습


## Controller 쓰는 이유?
```
기존에 Servelet에서 http header처리, body처리, queryString처리 해줘야하는 코드를 스프링이 대신해준다.
(JSON으로 만들고, UTF-8처리 등등..)
```

## 스프링 MVC란?
```
MVC 디자인 패턴 (Model, View, Controller)
https://emongfactory.tistory.com/121
정적 웹페이지 - View / Model(클라이언트 서버로 보낸 정보)
동적 웹페이지 - 템플릿 엔진에게 View / Model(view에 적용할 정보) 전달
템플릿 엔진은 View에 Model을 적용함
HTTP 메시지
@RequestMapping : 요청할때 공통 url 설정
return "redirect:{PATH}"
@ResponseBody -> string을 body에 채워주라

SPA 트렌드
@RestController(Controller + ResponseBody)

```










