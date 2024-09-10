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