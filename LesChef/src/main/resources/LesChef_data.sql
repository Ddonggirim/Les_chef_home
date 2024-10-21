SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' FROM user_tables;

insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('한식', 'korean', '../image1/ListIcon/한식가로.png', '국/찌개', '밥/면', '반찬');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('일식', 'japanese', '../image1/ListIcon/boardmain.jpg', '국/전골', '면', '밥');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('중식', 'chinese', '../image1/ListIcon/boardmain.jpg', '튀김/찜', '면', '밥');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('양식', 'western', '../image1/ListIcon/boardmain.jpg', '스프/스튜', '면', '빵');


insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(1, '성게 미역국', 0, '1', '30분', '2', '하', null, '../image1/ListIcon/recipePic/1seaweedSoupMain.jpg', '한식', '국/찌개');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(2, '곤드레 전', 0, '1', '20분', '2', '하', null, '../image1/ListIcon/recipePic/2GondrejeonMain.jpg', '한식', '기타');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(3, '미역 오이냉국', 0, '1', '10분', '2', '하', null, '../image1/ListIcon/recipePic/3ccassMain.jpg', '한식', '국/찌개');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(4, '아욱 된장국', 0, '1', '20분', '2', '하', null, '../image1/ListIcon/recipePic/4spswcmMain.jpg', '한식', '국/찌개');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(5, '목살 김치찜', 0, '1', '90분', '3', '하', null, '../image1/ListIcon/예시1.png', '한식', '기타');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(6, '김치 비빔국수', 0, '1', '25분', '2', '하', null, '../image1/ListIcon/예시1.png', '한식', '밥/면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(7, '꼬막장', 0, '1', '20분', '3', '하', null, '../image1/ListIcon/예시1.png', '한식', '반찬');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(8, '파채 불고기', 0, '1', '35분', '2', '하', null, '../image1/ListIcon/예시1.png', '한식', '반찬');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(9, '감자채볶음', 0, '1', '25분', '4', '하', null, '../image1/ListIcon/예시1.png', '한식', '반찬');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(10, '쇠고기 미역국', 0, '1', '50분', '4', '하', null, '../image1/ListIcon/예시1.png', '한식', '국/찌개');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(11, '김치 순두부찌개', 0, '1', '35분', "4", "하", null, '../image1/ListIcon/예시1.png', '한식', '국/찌개');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(12, "떡국", 0, '1', '25분', "2", "하", null, '../image1/ListIcon/예시1.png', "한식", "국/찌개");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(13, "황태국", 0, '1', '35분', "3", "중", null, '../image1/ListIcon/예시1.png', "한식", "국/찌개");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(14, "오징어뭇국", 0, '1', '30분', "2", "하", null, 이미지, "../image1/ListIcon/예시1.png", "국/찌개");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(15, "콩나물국", 0, '1', '20분', "2", "하", null, "../image1/ListIcon/예시1.png", "한식", "국/찌개");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(16, "참치김치찌개", 0, '1', '25분', "2", "하", null, "../image1/ListIcon/예시1.png", "한식", "국/찌개");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(17, "표고버섯 덮밥", 0, '1', '30분', "2", "하", null, "../image1/ListIcon/예시1.png", "한식", "밥/면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(18, "스팸마요 덮밥", 0, '1', '20분', "1", "하", null, "../image1/ListIcon/예시1.png", "한식", "밥/면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(19, "달걀밥", 0, '1', '15분', "2", "하", null, "../image1/ListIcon/예시1.png", "한식", "밥/면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(20, "콩나물 쫄면", 0, '1', '15분', "2", "하", null, "../image1/ListIcon/예시1.png", "한식", "밥/면");




insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(41, '스키야키', 0, '1', '25분', '3', '중', null, '../image1/ListIcon/recipePic/41sukiyakiMain.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(42, '미소 시루', 0, '1', '30분', '4', '하', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(43, '옥도미 맑은국', 0, '1', '80분', '2', '중', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(44, '어묵전골', 0, '1', '25분', '2', '중', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(45, '밀푀유나베', 0, '1', '45분', '2', '하', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(46, '돈가스 김치나베', 0, '1', '30분', '2', '중', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(47, '우엉 불고기나베', 0, '1', '20분', '2', '하', null, '../image1/ListIcon/예시1.png', '일식', '국/전골');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(48, '야끼소바', 0, '1', '40분', '3', '하', null, '../image1/ListIcon/예시1.png', '일식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(49, '붓카케우동', 0, '1', '15분', '2', '하', null, '../image1/ListIcon/예시1.png', '일식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(50, '된장 버터 옥수수라면', 0, '1', '15분', '2', '하', null, '../image1/ListIcon/예시1.png', '일식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(51, "대파 닭고기우동", 0, '1', '20분', '2', '하', null, '../image1/ListIcon/예시1.png', '일식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(52, "야끼스파게티", 0, '1', '40분', "2", "중", null, '../image1/ListIcon/예시1.png', "일식", '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(53, "카레우동", 0, '1', '25분', "2", "중", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(54, "새우튀김냉메밀", 0, '1', '50분', "3", "중", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(55, "나가사키짬뽕", 0, '1', '30분', "2", "중", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(56, "톳 소바", 0, '1', '15분', "1", "하", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(57, "아보카도 비프 소바", 0, '1', '40분', "1", "하", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(58, "참깨 메밀 소바", 0, '1', '20분', "2", "하", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(59, "냉소바", 0, '1', '25분', "1", "하", null, '../image1/ListIcon/예시1.png', "일식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(60, "연어 아보카도 덮밥", 0, '1', '20분', "2", "하", null, '../image1/ListIcon/예시1.png', "일식", "밥");






insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(81, '마라탕', 0, '1', '40분', '2', '하', null, '../image1/ListIcon/예시1.png', '중식', '기타');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(82, '채소 춘권', 0, '1', '40분', '1', '중', null, '../image1/ListIcon/예시1.png', '중식', '튀김/찜');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(83, '사천식 고추 새우 덮밥', 0, '1', '35분', '2', '중', null, '../image1/ListIcon/예시1.png', '중식', '밥');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(84, '중식 기본 볶음밥', 0, '1', '15분', '2', '하', null, '../image1/ListIcon/예시1.png', '중식', '밥');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(85, '매운 해물 쟁반짜장', 0, '1', '35분', '2', '중', null, '../image1/ListIcon/예시1.png', '중식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(86, '가위면', 0, '1', '30분', '1', '중', null, '../image1/ListIcon/예시1.png', '중식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(87, '중국식 잡채 덮밥', 0, '1', '30분', '1', '중', null, '../image1/ListIcon/예시1.png', '중식', '밥');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(88, '어향 가지 덮밥', 0, '1', '35분', '2', '하', null, '../image1/ListIcon/예시1.png', '중식', '밥');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(89, '중국식 냉면', 0, '1', '30분', '2', '중', null, '../image1/ListIcon/예시1.png', '중식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(90, '게살덮밥', 0, '1', '20분', '1', '하', null, '../image1/ListIcon/예시1.png', '중식', '밥');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(91, "짬뽕", 0, '1', '30분', "2", '하', null, '../image1/ListIcon/예시1.png', "중식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(92, "채식 짜장면", 0, '1', '30분', "3", '중', null, '../image1/ListIcon/예시1.png', "중식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(93, "깐풍 두부 튀김 덮밥", 0, '1', '35분', "1", '하', null, '../image1/ListIcon/예시1.png', "중식", "밥");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(94, "어향 육사 덮밥", 0, '1', '30분', "1", '하', null, '../image1/ListIcon/예시1.png', "중식", "밥");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(95, "어향 육슬 덮밥", 0, '1', '40분', "2", '중', null, '../image1/ListIcon/예시1.png', "중식", "밥");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(96, "유산슬 덮밥", 0, '1', '30분', "2", '중', null, '../image1/ListIcon/예시1.png', "중식", "밥");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(97, "마파두부", 0, '1', '30분', "2", '중', null, '../image1/ListIcon/예시1.png', "중식", "밥");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(98, "파기름 비빔면", 0, '1', '25분', "1", '하', null, '../image1/ListIcon/예시1.png', "중식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(99, "사천탕면", 0, '1', '35분', "2", '중', null, '../image1/ListIcon/예시1.png', "중식", "면");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(100, "해물 볶음 짬뽕", 0, '1', '30분', "2", '중', null, '../image1/ListIcon/예시1.png', "중식", "면");



insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(121, '달걀 파스타', 0, '1', '20분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(122, '까르보나라', 0, '1', '30분', '1', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(123, '통삼겹 크림파스타', 0, '1', '40분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(124, '바지락 크림파스타', 0, '1', '30분', '1', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(125, '날치알 투움바파스타', 0, '1', '40분', '1', '중', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(126, '카치오페페 스파게티', 0, '1', '15분', '1', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(127, '나폴리탄 스파게티', 0, '1', '20분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(128, '상하이 파스타', 0, '1', '25분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(129, '케일 크림파스타', 0, '1', '30분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(130, '새우 오일파스타', 0, '1', '30분', '2', '하', null, '../image1/ListIcon/예시1.png', '양식', '면');
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(131, "토마토스프", 0, '1', '40분', '4', '하', null, '../image1/ListIcon/예시1.png', "양식", "스프/스튜");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(132, "애플 시나몬 스프", 0, '1', '35분', "3", "하", null, '../image1/ListIcon/예시1.png', "양식", "스프/스튜");
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category)
values(12, "애플 시나몬 스프", 0, '1', '35분', "3", "하", null, '../image1/ListIcon/예시1.png', "양식", "스프/스튜");


insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (1, 1, 1, '미역은 물에 담가 10분 정도 불려주세요.', '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (2, 1, 2, '불린 미역은 먹기 좋게 썬 후 물기를 제거해 주세요.', '../image1/ListIcon/recipePic/1seaweedSoup2.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (3, 1, 3, '냄비에 참기름을 두르고 미역을 볶아주세요.', '../image1/ListIcon/recipePic/1seaweedSoup3.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (4, 1, 4, '미역이 부드러워지면 국간장을 넣고 2분정도 더 볶아주세요.', '../image1/ListIcon/recipePic/1seaweedSoup4.jpg');



insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(1, 1, '성게', '60', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(2, 1, '건 미역', '15', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(3, 1, '다시마 육수', '5', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(4, 1, '국간장', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(5, 1, '참기름', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(6, 1, '멸치액젓', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(7, 1, '소금', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(8, 2, '생 곤드레', 200, 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(9, 2, '식용유', null, '적당량');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(10, 2, '소금', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(11, 2, '부침가루', '1', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(12, 2, '물', '1', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(13, 2, '간장', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(14, 2, '맛술', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(15, 2, '식초', '1', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(16, 2, '잘게 썬 양파', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(17, 2, '잘게 썬 홍고추', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(18, 2, '통깨', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(19, 3, '불린 미역', '100', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(20, 3, '생수', '2', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(21, 3, '오이', '1', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(22, 3, '통깨', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(23, 3, '얼음', null, '적당량');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(24, 3, '식초', '1/3', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(25, 3, '설탕', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(26, 3, '국간장', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(27, 3, '소금', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(28, 3, '다진 마늘', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(29, 4, '아욱', '150', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(30, 4, '멸치 다시마 육수', '5', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(31, 4, '대파', '1/2', '대');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(32, 4, '청양고추', '1', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(33, 4, '된장', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(34, 4, '고추장', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(35, 4, '다진 마늘', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(36, 5, '목살', '1', 'kg');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(37, 5, '신김치', '1/2', '포기');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(38, 5, '양파', '1/2', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(39, 5, '대파', '1', '대');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(40, 5, '홍고추', '1', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(41, 5, '청양고추', '1', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(42, 5, '멸치다시마육수(또는 쌀뜨물)', '500', 'ml');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(43, 5, '된장(생략 가능)', '1/2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(44, 5, '김치국물', '1', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(45, 5, '국간장', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(46, 5, '맛술', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(47, 5, '고춧가루', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(48, 5, '설탕', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(49, 5, '다진 마늘', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(50, 5, '후춧가루', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(51, 6, '신김치', '2', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(52, 6, '중면', '200', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(53, 6, '오이', '1/2', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(54, 6, '깨', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(55, 6, '고추장', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(56, 6, '식초', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(57, 6, '올리고당', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(58, 6, '간장', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(59, 6, '설탕', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(60, 6, '맛술', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(61, 6, '참기름', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(62, 6, '후추', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(63, 7, '꼬막', '1', 'kg');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(64, 7, '청주', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(65, 7, '대파', '1/2', '대');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(66, 7, '양파', '1/4', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(67, 7, '청양고추', '2', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(68, 7, '홍고추', '1', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(69, 7, '통깨', null, '약갼');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(70, 7, '간장', '4', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(71, 7, '고춧가루', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(72, 7, '맛술', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(73, 7, '설탕', '1', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(74, 7, '올리고당', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(75, 7, '생강즙', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(76, 7, '다진마늘', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(77, 7, '참기름', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(78, 7, '깨소금', '1', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(79, 7, '후춧가루', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(80, 8, '소고기(설도)', '300', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(81, 8, '양파', '80', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(82, 8, '당근', '30', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(83, 8, '대파', '100', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(84, 8, '배', '1/2', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(85, 8, '진간장', '5', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(86, 8, '국간장', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(87, 8, '올리고당', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(88, 8, '후추', '1', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(89, 8, '설탕', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(90, 8, '다진 마늘', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(91, 8, '맛술', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(92, 9, '감자', '2', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(93, 9, '당근', '1/3', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(94, 9, '양파', '1/4', '개');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(95, 9, '통깨', null, '약간');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(96, 9, '식용유', null, '적당량');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(97, 9, '다진 마늘', '1/2', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(98, 9, '소금', '1/4', '작은술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(99, 10, '자른 쇠고기 양지(또는 등심)', '100', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(100, 10, '자른 미역', '20', 'g');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(101, 10, '참기름(또는 들기름)', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(102, 10, '국간장', '2', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(103, 10, '다진 마늘', '1', '큰술');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(104, 10, '물(또는 쌀뜨물)', '7', '컵');
insert into recipe_Ingredient(recipe_Ingredient_Id, recipe_Id, ingredient_Name, ingredient_Volume, ingredient_Unit) values(105, 10, '멸치 액젓(또는 참치액젓)', '1', '큰술');