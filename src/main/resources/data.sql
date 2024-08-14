-- Insert Boards
INSERT INTO boards ( name) VALUES ( '자유 게시판');
INSERT INTO boards ( name) VALUES ( '개발 게시판');
INSERT INTO boards (name) VALUES ( '일상 게시판');
INSERT INTO boards ( name) VALUES ('사건사고 게시판');

-- 자유 게시판 (board_id = 1)
INSERT INTO articles (title, content, password, board_id) VALUES
                                                              ('자유 게시판 글 1', '자유롭게 이야기해봅시다.', 'password1', 1),
                                                              ('자유 게시판 글 2', '오늘의 주제는 무엇인가요?', 'password2', 1),
                                                              ('자유 게시판 글 3', '모두들 안녕하세요!', 'password3', 1),
                                                              ('자유 게시판 글 4', '주말 계획 공유해요', 'password4', 1),
                                                              ('자유 게시판 글 5', '재미있는 이야기 해요', 'password5', 1),
                                                              ('자유 게시판 글 6', '추천할 만한 영화가 있나요?', 'password6', 1),
                                                              ('자유 게시판 글 7', '좋아하는 음악 공유해요', 'password7', 1),
                                                              ('자유 게시판 글 8', '오늘의 날씨는 어때요?', 'password8', 1),
                                                              ('자유 게시판 글 9', '유머 글을 올려봐요!', 'password9', 1),
                                                              ('자유 게시판 글 10', '다음 모임 일정 공유', 'password10', 1);

-- 개발 게시판 (board_id = 2)
INSERT INTO articles (title, content, password, board_id) VALUES
                                                              ('개발 게시판 글 1', '최신 자바스크립트 트렌드', 'password1', 2),
                                                              ('개발 게시판 글 2', 'Python에서의 비동기 처리', 'password2', 2),
                                                              ('개발 게시판 글 3', 'React와 Vue.js 비교', 'password3', 2),
                                                              ('개발 게시판 글 4', '데이터베이스 최적화 방법', 'password4', 2),
                                                              ('개발 게시판 글 5', '개발자 도구 활용 팁', 'password5', 2),
                                                              ('개발 게시판 글 6', '최고의 코드 편집기 추천', 'password6', 2),
                                                              ('개발 게시판 글 7', 'API 설계 베스트 프랙티스', 'password7', 2),
                                                              ('개발 게시판 글 8', 'CI/CD 파이프라인 구축', 'password8', 2),
                                                              ('개발 게시판 글 9', '클라우드 서비스 비교', 'password9', 2),
                                                              ('개발 게시판 글 10', 'DevOps 문화의 중요성', 'password10', 2);

-- 일상 게시판 (board_id = 3)
INSERT INTO articles (title, content, password, board_id) VALUES
                                                              ('일상 게시판 글 1', '오늘 아침은 뭐 먹었나요?', 'password1', 3),
                                                              ('일상 게시판 글 2', '어제 본 영화 후기', 'password2', 3),
                                                              ('일상 게시판 글 3', '오늘 있었던 일', 'password3', 3),
                                                              ('일상 게시판 글 4', '이번 주말 계획은?', 'password4', 3),
                                                              ('일상 게시판 글 5', '취미 생활 공유', 'password5', 3),
                                                              ('일상 게시판 글 6', '최근에 읽은 책', 'password6', 3),
                                                              ('일상 게시판 글 7', '오늘의 운동 루틴', 'password7', 3),
                                                              ('일상 게시판 글 8', '다이어트 식단 공유', 'password8', 3),
                                                              ('일상 게시판 글 9', '스트레스 해소법', 'password9', 3),
                                                              ('일상 게시판 글 10', '기분 전환 방법', 'password10', 3);

-- 사건사고 게시판 (board_id = 4)
INSERT INTO articles (title, content, password, board_id) VALUES
                                                              ('사건사고 게시판 글 1', '어제 발생한 교통사고', 'password1', 4),
                                                              ('사건사고 게시판 글 2', '화재 사고 발생 소식', 'password2', 4),
                                                              ('사건사고 게시판 글 3', '도난 사건 경고', 'password3', 4),
                                                              ('사건사고 게시판 글 4', '최근 범죄 발생 지역', 'password4', 4),
                                                              ('사건사고 게시판 글 5', '긴급 상황 대처 방법', 'password5', 4),
                                                              ('사건사고 게시판 글 6', '안전 운전의 중요성', 'password6', 4),
                                                              ('사건사고 게시판 글 7', '응급처치 요령', 'password7', 4),
                                                              ('사건사고 게시판 글 8', '화재 예방 팁', 'password8', 4),
                                                              ('사건사고 게시판 글 9', '도로에서 조심해야 할 것들', 'password9', 4),
                                                              ('사건사고 게시판 글 10', '범죄 예방 수칙', 'password10', 4);
INSERT INTO comments (content, password, article_id) VALUES
                                                  ('댓글 1 - 게시글 1', 'password1', 1),
                                                  ('댓글 2 - 게시글 1', 'password2', 1),
                                                  ('댓글 3 - 게시글 1', 'password3', 1),
                                                  ('댓글 4 - 게시글 1', 'password4', 1),
                                                  ('댓글 5 - 게시글 1', 'password5', 1),

                                                  ('댓글 1 - 게시글 2', 'password1', 2),
                                                  ('댓글 2 - 게시글 2', 'password2', 2),
                                                  ('댓글 3 - 게시글 2', 'password3', 2),
                                                  ('댓글 4 - 게시글 2', 'password4', 2),
                                                  ('댓글 5 - 게시글 2', 'password5', 2),

                                                  ('댓글 1 - 게시글 3', 'password1', 3),
                                                  ('댓글 2 - 게시글 3', 'password2', 3),
                                                  ('댓글 3 - 게시글 3', 'password3', 3),
                                                  ('댓글 4 - 게시글 3', 'password4', 3),
                                                  ('댓글 5 - 게시글 3', 'password5', 3),

                                                  ('댓글 1 - 게시글 3', 'password1', 4),
                                                  ('댓글 2 - 게시글 3', 'password2', 4),
                                                  ('댓글 3 - 게시글 3', 'password3', 4),
                                                  ('댓글 4 - 게시글 3', 'password4', 4),
                                                  ('댓글 5 - 게시글 3', 'password5', 4),

                                                  ('댓글 1 - 게시글 3', 'password1', 5),
                                                  ('댓글 2 - 게시글 3', 'password2', 5),
                                                  ('댓글 3 - 게시글 3', 'password3', 5),
                                                  ('댓글 4 - 게시글 3', 'password4', 5),
                                                  ('댓글 5 - 게시글 3', 'password5', 5),

                                                  ('댓글 1 - 게시글 40', 'password1', 6),
                                                  ('댓글 2 - 게시글 40', 'password2', 6),
                                                  ('댓글 3 - 게시글 40', 'password3', 6),
                                                  ('댓글 4 - 게시글 40', 'password4', 6),
                                                  ('댓글 5 - 게시글 40', 'password5', 6),

                                                  ('댓글 1 - 게시글 40', 'password1', 7),
                                                  ('댓글 2 - 게시글 40', 'password2', 7),
                                                  ('댓글 3 - 게시글 40', 'password3', 7),
                                                  ('댓글 4 - 게시글 40', 'password4', 7),
                                                  ('댓글 5 - 게시글 40', 'password5', 7),

                                                  ('댓글 1 - 게시글 40', 'password1', 8),
                                                  ('댓글 2 - 게시글 40', 'password2', 8),
                                                  ('댓글 3 - 게시글 40', 'password3', 8),
                                                  ('댓글 4 - 게시글 40', 'password4', 8),
                                                  ('댓글 5 - 게시글 40', 'password5', 8),

                                                  ('댓글 1 - 게시글 40', 'password1', 9),
                                                  ('댓글 2 - 게시글 40', 'password2', 9),
                                                  ('댓글 3 - 게시글 40', 'password3', 9),
                                                  ('댓글 4 - 게시글 40', 'password4', 9),
                                                  ('댓글 5 - 게시글 40', 'password5', 9),

                                                  ('댓글 1 - 게시글 40', 'password1', 10),
                                                  ('댓글 2 - 게시글 40', 'password2', 10),
                                                  ('댓글 3 - 게시글 40', 'password3', 10),
                                                  ('댓글 4 - 게시글 40', 'password4', 10),
                                                  ('댓글 5 - 게시글 40', 'password5', 10),

                                                  ('댓글 1 - 게시글 40', 'password1', 11),
                                                  ('댓글 2 - 게시글 40', 'password2', 11),
                                                  ('댓글 3 - 게시글 40', 'password3', 11),
                                                  ('댓글 4 - 게시글 40', 'password4', 11),
                                                  ('댓글 5 - 게시글 40', 'password5', 11),

                                                  ('댓글 1 - 게시글 40', 'password1', 12),
                                                  ('댓글 2 - 게시글 40', 'password2', 12),
                                                  ('댓글 3 - 게시글 40', 'password3', 12),
                                                  ('댓글 4 - 게시글 40', 'password4', 12),
                                                  ('댓글 5 - 게시글 40', 'password5', 12),

                                                  ('댓글 1 - 게시글 40', 'password1', 13),
                                                  ('댓글 2 - 게시글 40', 'password2', 13),
                                                  ('댓글 3 - 게시글 40', 'password3', 13),
                                                  ('댓글 4 - 게시글 40', 'password4', 13),
                                                  ('댓글 5 - 게시글 40', 'password5', 13),


                                                  ('댓글 1 - 게시글 40', 'password1', 14),
                                                  ('댓글 2 - 게시글 40', 'password2', 14),
                                                  ('댓글 3 - 게시글 40', 'password3', 14),
                                                  ('댓글 4 - 게시글 40', 'password4', 14),
                                                  ('댓글 5 - 게시글 40', 'password5', 14),

                                                  ('댓글 1 - 게시글 40', 'password1', 15),
                                                  ('댓글 2 - 게시글 40', 'password2', 15),
                                                  ('댓글 3 - 게시글 40', 'password3', 15),
                                                  ('댓글 4 - 게시글 40', 'password4', 15),
                                                  ('댓글 5 - 게시글 40', 'password5', 15),

                                                  ('댓글 1 - 게시글 40', 'password1', 16),
                                                  ('댓글 2 - 게시글 40', 'password2', 16),
                                                  ('댓글 3 - 게시글 40', 'password3', 16),
                                                  ('댓글 4 - 게시글 40', 'password4', 16),
                                                  ('댓글 5 - 게시글 40', 'password5', 16),

                                                  ('댓글 1 - 게시글 40', 'password1', 17),
                                                  ('댓글 2 - 게시글 40', 'password2', 17),
                                                  ('댓글 3 - 게시글 40', 'password3', 17),
                                                  ('댓글 4 - 게시글 40', 'password4', 17),
                                                  ('댓글 5 - 게시글 40', 'password5', 17),

                                                  ('댓글 1 - 게시글 40', 'password1', 18),
                                                  ('댓글 2 - 게시글 40', 'password2', 18),
                                                  ('댓글 3 - 게시글 40', 'password3', 18),
                                                  ('댓글 4 - 게시글 40', 'password4', 18),
                                                  ('댓글 5 - 게시글 40', 'password5', 18),

                                                  ('댓글 1 - 게시글 40', 'password1', 19),
                                                  ('댓글 2 - 게시글 40', 'password2', 19),
                                                  ('댓글 3 - 게시글 40', 'password3', 19),
                                                  ('댓글 4 - 게시글 40', 'password4', 19),
                                                  ('댓글 5 - 게시글 40', 'password5', 19),

                                                  ('댓글 1 - 게시글 40', 'password1', 20),
                                                  ('댓글 2 - 게시글 40', 'password2', 20),
                                                  ('댓글 3 - 게시글 40', 'password3', 20),
                                                  ('댓글 4 - 게시글 40', 'password4', 20),
                                                  ('댓글 5 - 게시글 40', 'password5', 20),

                                                  ('댓글 1 - 게시글 40', 'password1', 21),
                                                  ('댓글 2 - 게시글 40', 'password2', 21),
                                                  ('댓글 3 - 게시글 40', 'password3', 21),
                                                  ('댓글 4 - 게시글 40', 'password4', 21),
                                                  ('댓글 5 - 게시글 40', 'password5', 21),

                                                  ('댓글 1 - 게시글 40', 'password1', 22),
                                                  ('댓글 2 - 게시글 40', 'password2', 22),
                                                  ('댓글 3 - 게시글 40', 'password3', 22),
                                                  ('댓글 4 - 게시글 40', 'password4', 22),
                                                  ('댓글 5 - 게시글 40', 'password5', 22),

                                                  ('댓글 1 - 게시글 40', 'password1', 23),
                                                  ('댓글 2 - 게시글 40', 'password2', 23),
                                                  ('댓글 3 - 게시글 40', 'password3', 23),
                                                  ('댓글 4 - 게시글 40', 'password4', 23),
                                                  ('댓글 5 - 게시글 40', 'password5', 23),

                                                  ('댓글 1 - 게시글 40', 'password1', 24),
                                                  ('댓글 2 - 게시글 40', 'password2', 24),
                                                  ('댓글 3 - 게시글 40', 'password3', 24),
                                                  ('댓글 4 - 게시글 40', 'password4', 24),
                                                  ('댓글 5 - 게시글 40', 'password5', 24),

                                                  ('댓글 1 - 게시글 40', 'password1', 25),
                                                  ('댓글 2 - 게시글 40', 'password2', 25),
                                                  ('댓글 3 - 게시글 40', 'password3', 25),
                                                  ('댓글 4 - 게시글 40', 'password4', 25),
                                                  ('댓글 5 - 게시글 40', 'password5', 25),

                                                  ('댓글 1 - 게시글 40', 'password1', 26),
                                                  ('댓글 2 - 게시글 40', 'password2', 26),
                                                  ('댓글 3 - 게시글 40', 'password3', 26),
                                                  ('댓글 4 - 게시글 40', 'password4', 26),
                                                  ('댓글 5 - 게시글 40', 'password5', 26),

                                                  ('댓글 1 - 게시글 40', 'password1', 27),
                                                  ('댓글 2 - 게시글 40', 'password2', 27),
                                                  ('댓글 3 - 게시글 40', 'password3', 27),
                                                  ('댓글 4 - 게시글 40', 'password4', 27),
                                                  ('댓글 5 - 게시글 40', 'password5', 27),

                                                  ('댓글 1 - 게시글 40', 'password1', 28),
                                                  ('댓글 2 - 게시글 40', 'password2', 28),
                                                  ('댓글 3 - 게시글 40', 'password3', 28),
                                                  ('댓글 4 - 게시글 40', 'password4', 28),
                                                  ('댓글 5 - 게시글 40', 'password5', 28),

                                                  ('댓글 1 - 게시글 40', 'password1', 29),
                                                  ('댓글 2 - 게시글 40', 'password2', 29),
                                                  ('댓글 3 - 게시글 40', 'password3', 29),
                                                  ('댓글 4 - 게시글 40', 'password4', 29),
                                                  ('댓글 5 - 게시글 40', 'password5', 29),

                                                  ('댓글 1 - 게시글 40', 'password1', 30),
                                                  ('댓글 2 - 게시글 40', 'password2', 30),
                                                  ('댓글 3 - 게시글 40', 'password3', 30),
                                                  ('댓글 4 - 게시글 40', 'password4', 30),
                                                  ('댓글 5 - 게시글 40', 'password5', 30),

                                                  ('댓글 1 - 게시글 40', 'password1', 31),
                                                  ('댓글 2 - 게시글 40', 'password2', 31),
                                                  ('댓글 3 - 게시글 40', 'password3', 31),
                                                  ('댓글 4 - 게시글 40', 'password4', 31),
                                                  ('댓글 5 - 게시글 40', 'password5', 31),

                                                  ('댓글 1 - 게시글 40', 'password1', 32),
                                                  ('댓글 2 - 게시글 40', 'password2', 32),
                                                  ('댓글 3 - 게시글 40', 'password3', 32),
                                                  ('댓글 4 - 게시글 40', 'password4', 32),
                                                  ('댓글 5 - 게시글 40', 'password5', 32),

                                                  ('댓글 1 - 게시글 40', 'password1', 33),
                                                  ('댓글 2 - 게시글 40', 'password2', 33),
                                                  ('댓글 3 - 게시글 40', 'password3', 33),
                                                  ('댓글 4 - 게시글 40', 'password4', 33),
                                                  ('댓글 5 - 게시글 40', 'password5', 33),

                                                  ('댓글 1 - 게시글 40', 'password1', 34),
                                                  ('댓글 2 - 게시글 40', 'password2', 34),
                                                  ('댓글 3 - 게시글 40', 'password3', 34),
                                                  ('댓글 4 - 게시글 40', 'password4', 34),
                                                  ('댓글 5 - 게시글 40', 'password5', 34),

                                                  ('댓글 1 - 게시글 40', 'password1', 35),
                                                  ('댓글 2 - 게시글 40', 'password2', 35),
                                                  ('댓글 3 - 게시글 40', 'password3', 35),
                                                  ('댓글 4 - 게시글 40', 'password4', 35),
                                                  ('댓글 5 - 게시글 40', 'password5', 35),

                                                  ('댓글 1 - 게시글 40', 'password1', 36),
                                                  ('댓글 2 - 게시글 40', 'password2', 36),
                                                  ('댓글 3 - 게시글 40', 'password3', 36),
                                                  ('댓글 4 - 게시글 40', 'password4', 36),
                                                  ('댓글 5 - 게시글 40', 'password5', 36),

                                                  ('댓글 1 - 게시글 40', 'password1', 37),
                                                  ('댓글 2 - 게시글 40', 'password2', 37),
                                                  ('댓글 3 - 게시글 40', 'password3', 37),
                                                  ('댓글 4 - 게시글 40', 'password4', 37),
                                                  ('댓글 5 - 게시글 40', 'password5', 37),

                                                  ('댓글 1 - 게시글 40', 'password1', 38),
                                                  ('댓글 2 - 게시글 40', 'password2', 38),
                                                  ('댓글 3 - 게시글 40', 'password3', 38),
                                                  ('댓글 4 - 게시글 40', 'password4', 38),
                                                  ('댓글 5 - 게시글 40', 'password5', 38),

                                                  ('댓글 1 - 게시글 40', 'password1', 39),
                                                  ('댓글 2 - 게시글 40', 'password2', 39),
                                                  ('댓글 3 - 게시글 40', 'password3', 39),
                                                  ('댓글 4 - 게시글 40', 'password4', 39),
                                                  ('댓글 5 - 게시글 40', 'password5', 39),
                                                  
                                                

                                                  ('댓글 1 - 게시글 40', 'password1', 40),
                                                  ('댓글 2 - 게시글 40', 'password2', 40),
                                                  ('댓글 3 - 게시글 40', 'password3', 40),
                                                  ('댓글 4 - 게시글 40', 'password4', 40),
                                                  ('댓글 5 - 게시글 40', 'password5', 40);