SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' FROM user_tables;

insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('한식', 'korean', '../image1/ListIcon/한식가로.png', '국/찌개', '밥/면', '반찬');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('일식', 'japanese', '../image1/ListIcon/boardmain.jpg', '국/전골', '면', '밥');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('중식', 'chinese', '../image1/ListIcon/boardmain.jpg', '튀김/찜', '면', '밥');
insert into recipe_category (korean_Name, english_Name, head_Img, sort_One, sort_Two, sort_Three)
values ('양식', 'western', '../image1/ListIcon/boardmain.jpg', '스프/스튜', '면', '빵');


insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(1, '성게 미역국', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/recipePic/1seaweedSoupMain.jpg', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(2, '곤드레 전', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/recipePic/2GondrejeonMain.jpg', '한식', '기타', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(3, '미역 오이냉국', 0, '2024-09-20', '10분', '2', '하', null, '/image1/ListIcon/recipePic/3ccassMain.jpg', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(4, '아욱 된장국', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/recipePic/4spswcmMain.jpg', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(5, '목살 김치찜', 0, '2024-09-20', '90분', '3', '하', null, '/image1/ListIcon/예시1.png', '한식', '기타', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(6, '김치 비빔국수', 0, '2024-09-20', '25분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '밥/면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(7, '꼬막장', 0, '2024-09-20', '20분', '3', '하', null, '/image1/ListIcon/예시1.png', '한식', '반찬', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(8, '파채 불고기', 0, '2024-09-20', '35분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '반찬', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(9, '감자채볶음', 0, '2024-09-20', '25분', '4', '하', null, '/image1/ListIcon/예시1.png', '한식', '반찬', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(10, '쇠고기 미역국', 0, '2024-09-20', '50분', '4', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(11, '김치 순두부찌개', 0, '2024-09-20', '35분', '4', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(12, '떡국', 0, '2024-09-20', '25분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(13, '황태국', 0, '2024-09-20', '35분', '3', '중', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(14, '오징어뭇국', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(15, '콩나물국', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(16, '참치김치찌개', 0, '2024-09-20', '25분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '국/찌개', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(17, '표고버섯 덮밥', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '밥/면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(18, '스팸마요 덮밥', 0, '2024-09-20', '20분', '1', '하', null, '/image1/ListIcon/예시1.png', '한식', '밥/면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(19, '달걀밥', 0, '2024-09-20', '15분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '밥/면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(20, '콩나물 쫄면', 0, '2024-09-20', '15분', '2', '하', null, '/image1/ListIcon/예시1.png', '한식', '밥/면', 0.0);




insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(41, '스키야키', 0, '2024-09-20', '25분', '3', '중', null, '/image1/ListIcon/recipePic/41sukiyakiMain.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(42, '미소 시루', 0, '2024-09-20', '30분', '4', '하', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(43, '옥도미 맑은국', 0, '2024-09-20', '80분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(44, '어묵전골', 0, '2024-09-20', '25분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(45, '밀푀유나베', 0, '2024-09-20', '45분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(46, '돈가스 김치나베', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(47, '우엉 불고기나베', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '국/전골', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(48, '야끼소바', 0, '2024-09-20', '40분', '3', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(49, '붓카케우동', 0, '2024-09-20', '15분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(50, '된장 버터 옥수수라면', 0, '2024-09-20', '15분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(51, '대파 닭고기우동', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(52, '야끼스파게티', 0, '2024-09-20', '40분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(53, '카레우동', 0, '2024-09-20', '25분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(54, '새우튀김냉메밀', 0, '2024-09-20', '50분', '3', '중', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(55, '나가사키짬뽕', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(56, '톳 소바', 0, '2024-09-20', '15분', '1', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(57, '아보카도 비프 소바', 0, '2024-09-20', '40분', '1', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(58, '참깨 메밀 소바', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(59, '냉소바', 0, '2024-09-20', '25분', '1', '하', null, '/image1/ListIcon/예시1.png', '일식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(60, '연어 아보카도 덮밥', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '일식', '밥', 0.0);






insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(81, '마라탕', 0, '2024-09-20', '40분', '2', '하', null, '/image1/ListIcon/예시1.png', '중식', '기타', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(82, '채소 춘권', 0, '2024-09-20', '40분', '1', '중', null, '/image1/ListIcon/예시1.png', '중식', '튀김/찜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(83, '사천식 고추 새우 덮밥', 0, '2024-09-20', '35분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(84, '중식 기본 볶음밥', 0, '2024-09-20', '15분', '2', '하', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(85, '매운 해물 쟁반짜장', 0, '2024-09-20', '35분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(86, '가위면', 0, '2024-09-20', '30분', '1', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(87, '중국식 잡채 덮밥', 0, '2024-09-20', '30분', '1', '중', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(88, '어향 가지 덮밥', 0, '2024-09-20', '35분', '2', '하', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(89, '중국식 냉면', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(90, '게살덮밥', 0, '2024-09-20', '20분', '1', '하', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(91, '짬뽕', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(92, '채식 짜장면', 0, '2024-09-20', '30분', '3', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(93, '깐풍 두부 튀김 덮밥', 0, '2024-09-20', '35분', '1', '하', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(94, '어향 육사 덮밥', 0, '2024-09-20', '30분', '1', '하', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(95, '어향 육슬 덮밥', 0, '2024-09-20', '40분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(96, '유산슬 덮밥', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(97, '마파두부', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '밥', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(98, '파기름 비빔면', 0, '2024-09-20', '25분', '1', '하', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(99, '사천탕면', 0, '2024-09-20', '35분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(100, '해물 볶음 짬뽕', 0, '2024-09-20', '30분', '2', '중', null, '/image1/ListIcon/예시1.png', '중식', '면', 0.0);



insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(121, '달걀 파스타', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(122, '까르보나라', 0, '2024-09-20', '30분', '1', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(123, '통삼겹 크림파스타', 0, '2024-09-20', '40분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(124, '바지락 크림파스타', 0, '2024-09-20', '30분', '1', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(125, '날치알 투움바파스타', 0, '2024-09-20', '40분', '1', '중', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(126, '카치오페페 스파게티', 0, '2024-09-20', '15분', '1', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(127, '나폴리탄 스파게티', 0, '2024-09-20', '20분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(128, '상하이 파스타', 0, '2024-09-20', '25분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(129, '케일 크림파스타', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(130, '새우 오일파스타', 0, '2024-09-20', '30분', '2', '하', null, '/image1/ListIcon/예시1.png', '양식', '면', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(131, '토마토스프', 0, '2024-09-20', '40분', '4', '하', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(132, '애플 시나몬 스프', 0, '2024-09-20', '35분', '3', '하', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(133, '브로콜리 스프', 0, '2024-09-20', '40분', '3', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(134, '소시지 토마토 스튜', 0, '2024-09-20', '25분', '3', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(135, '프랑스식 치킨스튜', 0, '2024-09-20', '100분', '4', '하', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(136, '토마토 가스파초', 0, '2024-09-20', '20분', '4', '하', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(137, '콘스프', 0, '2024-09-20', '35분', '2', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(138, '클램차우더 스프', 0, '2024-09-20', '35분', '4', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(139, '토마토 치킨스튜', 0, '2024-09-20', '60분', '2', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);
insert into recipe (recipe_Id, recipe_Name, view_Num, write_Date, run_Time, portion, cook_Level, user_Id, recipe_Img, major_Category, sub_Category, rating_Avg)
values(140, '단호박스프', 0, '2024-09-20', '45분', '4', '중', null, '/image1/ListIcon/예시1.png', '양식', '스프/스튜', 0.0);

insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (1, 1, 1, '미역은 물에 담가 10분 정도 불려주세요.', '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (2, 1, 2, '불린 미역은 먹기 좋게 썬 후 물기를 제거해 주세요.', '../image1/ListIcon/recipePic/1seaweedSoup2.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (3, 1, 3, '냄비에 참기름을 두르고 미역을 볶아주세요.', '../image1/ListIcon/recipePic/1seaweedSoup3.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (4, 1, 4, '미역이 부드러워지면 국간장을 넣고 2분정도 더 볶아주세요.', '../image1/ListIcon/recipePic/1seaweedSoup4.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (5, 1, 5, "다시마 육수를 넣고 ⅔ 정도 넣고 10분 정도 끓여주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (6, 1, 6, "나머지 다시마 육수를 모두 넣고 성게알과 액젓을 넣어 5분 정도 더 끓여주세요. 부족한 간은 소금으로 맞춰주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (7, 1, 7, "완성된 성게미역국을 그릇에 담고 밥과 함께 즐겨주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (8, 2, 1, "곤드레는 깨끗이 씻어 4cm 길이로 잘라주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (9, 2, 2, "볼에 반죽 재료와 곤드레를 넣고 섞어주세요.", "(tip. 반죽에 전분을 넣어 만들면 반죽이 투명해져서 곤드레의 색감을 살릴 수 있어요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (10, 2, 3, "볼에 양념장 재료를 넣어 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (11, 2, 4, "달군 팬에 약간의 기름을 두른 후 반죽을 올려 얇게 펼쳐주세요. 앞뒤로 노릇하게 구워주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (12, 2, 5, "곤드레 전에 양념장을 곁들여 맛있게 즐겨주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (13, 3, 1, "불린 미역은 물에 30초 정도 데친 후 체에 밭쳐 깨끗이 씻어주세요.", "(tip. 미역은 여러 번 헹궈야 비린내가 나지 않아요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (14, 3, 2, "물기를 짠 후 먹기 좋은 크기로 잘라주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (15, 3, 3, "볼에 미역을 담은 후 양념 재료를 넣어 골고루 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (16, 3, 4, "오이는 얇게 슬라이스로 잘라주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (17, 3, 5, "미역이 들어있는 볼에 오이와 물을 넣어 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (18, 3, 6, "마지막에 얼음, 통깨를 뿌려 완성해주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (19, 4, 1, "아욱의 줄기 끝 부분은 꺾어내고 껍질을 벗겨주세요.", "(tip. 줄기가 가는 아욱은 껍질을 벗기지 않아도 괜찮아요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (20, 4, 2, "큰 잎은 먹기 좋은 크기로 찢어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (21, 4, 3, "손질한 아욱은 흐르는 물에 2~3번 씻어주세요. 줄기가 두꺼운 경우 반으로 썰어주세요.", "(tip. 줄기가 억센 경우 씻을 때 굵은 소금을 넣고 박박 문질러주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (22, 4, 4, "청양고추와 대파는 어슷 썰어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (23, 4, 5, "냄비에 멸치다시마육수를 붓고 된장과 고추장을 넣어 센불에서 끓여 주세요. 육수가 끓어 오르면 아욱과 다진마늘, 청양고추를 넣고 끓여주세요. 마지막으로 대파를 넣어 한소끔 끓인 후 맛있게 즐겨주세요.", "(tip. 부족한 간은 소금을 가감해 조절해 주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (24, 5, 1, "김치는 꼭지를 붙인 채 3등분하여 썰어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (25, 5, 2, "볼에 양념 재료를 넣고 섞어 양념장을 만들어주세요.", "(tip 김치의 숙성 정도에 따라 설탕을 가감해주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (26, 5, 3, "목살은 큼직하게 잘라주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (27, 5, 4, "양파는 굵게 채썰어주세요. 대파와 고추는 어슷하게 썰어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (28, 5, 5, "냄비에 김치를 담고 목살과 양파를 올린 후 양념장과 멸치다시마육수, 된장을 넣어주세요.", "(tip. 부족한 간은 김치국물과 소금을 가감해서 조절해주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (29, 5, 6, "끓기 시작하면 불을 중간불로 줄여 1시간 20분 정도 끓여주세요.", "(tip. 끓이는 중간 뚜껑을 열어 김치가 바닥에 눌지 않도록 저어가며 끓여주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (30, 5, 7, "마지막에 대파와 홍고추, 청양고추를 넣고 한소끔 끓인 후 목살을 먹기 좋은 크기로 잘라 김치와 함께 맛있게 즐겨주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (31, 6, 1, "오이를 가늘게 채 썰어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (32, 6, 2, "김치는 굵게 다져주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (33, 6, 3, "볼에 다진 김치와 양념재료를 넣고 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (34, 6, 4, "끓는 물에 중면을 펼쳐 넣고 면끼리 달라붓지 않도록 저어주세요. 물이 끓어오르면 찬물을 2~3회 반복해서 부어 국수를 삶아주세요. 흐르는 찬물에 중면을 여러 번 씻어 전분기를 없애고 체반에 밭쳐 물기를 빼주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (35, 6, 5, "양념장에 삶은 국수를 넣고 버무려주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (36, 6, 6, "접시에 비빔국수를 담고 삶은 달걀과 오이채, 깨를 올려주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (37, 7, 1, "해감한 꼬막은 깨끗이 비벼 씻어주세요. 끓는 물에 청주를 넣어 온도를 떨어뜨린 다음 꼬막을 넣고 한쪽으로 저어주면서 삶다가 입이 벌어지기 시작하면 체로 건져주세요.", "(tip. 꼬막은 삶을 때 한 방향으로 저어가며 삶아야 살이 한쪽으로 쏠려 껍질을 제거하기 편해요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (38, 7, 2, "삶은 꼬막은 살만 발라주세요.", "(tip. 꼬막 삶은 물은 버리지 말고 해감이 덜 된 꼬막살을 씻어주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (39, 7, 3, "볼에 양념 재료를 넣어 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (40, 7, 4, "대파와 청고추는 송송 썰고, 홍고추는 반으로 갈라 씨를 뺀 후 얇게 썰어주세요. 양파는 잘게 다져주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (41, 7, 5, "볼에 양념과 썰어둔 야채, 꼬막살을 넣어 버무려주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (42, 7, 6, "접시에 담아 통깨를 뿌려 맛있게 즐겨주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (43, 8, 1, "소고기는 물에 30분 정도 담가 핏물을 제거해주세요.", "(tip. 불고기용 소고기는 얇아서 오랫동안 핏물을 빼지 않아도 됩니다.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (44, 8, 2, "양파, 당근은 채 썰고 대파는 길이 7~8cm, 두께 0.5cm 크기로 채 썰어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (45, 8, 3, "배는 껍질을 벗기고 믹서에 곱게 간 뒤 소고기에 넣어주세요.", "(tip. 혹시 배가 없다면 배 음료 80g을 넣어주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (46, 8, 4, "진간장, 국간장을 넣고 골고루 섞어주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (47, 8, 5, "순서 4에 올리고당, 후추, 설탕, 마늘, 맛술을 넣고 잘 버무린 뒤 냉장고에서 30분 정도 숙성시키고 꺼내 기름을 두르지 않은 팬에 넣고 센불로 5분 정도 볶아주세요.", "(tip. 센불에서 빠르게 익히는 게 중요하고 너무 자주 뒤섞지 않는 게 좋아요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (48, 8, 6, "양파, 당근을 넣고 당근이 익을 때까지 2분 정도 볶아주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (49, 8, 7, "볶은 불고기 위에 채 썬 대파를 올려서 맛있게 즐겨보세요!", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (50, 9, 1, "감자는 껍질을 벗기고 채칼을 이용해 3mm 정도로 채 썰어주세요.", "(tip. 채칼을 활용하면 일정한 두께로 썰어져 균일하게 익힐 수 있어요.)(tip. 채칼을 사용할 때는 안전에 유의해 주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (51, 9, 2, "감자가 부서지지 않도록 찬물에 살살 헹궈 전분질을 빼고 물에 5분 정도 담가주세요.", "(tip. 찬물에 헹궈 충분히 전분질을 빼야 진득하지 않게 완성돼요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (52, 9, 3, "체에 밭쳐 물기를 빼주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (53, 9, 4, "당근은 감자와 같은 두께로 채썰고 양파는 얇게 썰어주세요.", "(tip. 단단한 당근은 슬라이서를 이용해 균일한 두께로 썬 후 칼로 일정한 두께로 썰어주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (54, 9, 5, "달군 팬에 기름을 넉넉히 두르고 다진 마늘을 넣고 볶아주세요. 양파, 당근, 감자를 넣어 중간불에서 볶아주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (55, 9, 6, "감자가 투명해지면 소금을 넣어 간을 맞춰주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (56, 9, 7, "마지막에 통깨를 뿌려 완성해 주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (57, 10, 1, "불린 미역은 물에 깨끗하게 헹군 후 체에 밭쳐 물기를 빼주세요.", "(tip. 미역은 미지근한 물이나 뜨거운 물에 불리게 되면 비린내가 올라오게 되니 찬물에 20분 정도 불려주세요.)(tip. 자르지 않은 미역은 불린 후 먹기 좋은 크기로 잘라주세요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (58, 10, 2, "달군 팬에 쇠고기를 넣어 볶다가 참기름을 넣고 쇠고기 겉면의 핏기가 없을 때까지 약불에서 볶아주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (59, 10, 3, "다진 마늘을 넣어 볶다가 국간장과 미역을 넣고 3~4분 정도 볶아주세요.", "(tip. 국간장을 볶을 때 넣으면 쇠고기와 미역에 간이 잘 되면서 기름진 맛을 잡아준답니다.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (60, 10, 4, "물을 넣고 20~30분 정도 충분히 끓여주세요.", "(tip. 20~30분 정도 충분히 끓이면 쇠고기도 더욱 부드럽고 국물의 맛도 진해져요.)", '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (61, 10, 5, "부족한 간은 국간장과 액젓으로 맞춰주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (62, 10, 6, "맛있게 즐겨주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');
insert into recipe_Step (recipe_Step_Id, recipe_Id, step_Num, step_Way, step_Img) values (63, 11, 1, "돼지고기는 먹기 좋은 크기로 썰고 고기 밑간 재료에 10분 정도 재워주세요.", null, '../image1/ListIcon/recipePic/1seaweedSoup1.jpg');

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