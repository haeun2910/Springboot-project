
-- Insert articles for 자유 게시판 (Free Board)
INSERT INTO articles (title, content, password, board_id)
VALUES ('자유 게시판의 첫 번째 글', '이것은 자유 게시판의 첫 번째 글입니다.', 'pass123', 1);
INSERT INTO articles (title, content, password, board_id)
VALUES ('자유 게시판의 두 번째 글', '이것은 자유 게시판의 두 번째 글입니다.', 'pass456', 1);
INSERT INTO articles (title, content, password, board_id)
VALUES ('자유 게시판의 세 번째 글', '이것은 자유 게시판의 세 번째 글입니다.', 'pass789', 1);
INSERT INTO articles (title, content, password, board_id)
VALUES ('자유 게시판의 네 번째 글', '이것은 자유 게시판의 네 번째 글입니다.', 'pass101', 1);

-- Insert articles for 개발 게시판 (Development Board)
INSERT INTO articles (title, content, password, board_id)
VALUES ('개발 게시판의 첫 번째 글', '이것은 개발 게시판의 첫 번째 글입니다.', 'pass202', 2);
INSERT INTO articles (title, content, password, board_id)
VALUES ('개발 게시판의 두 번째 글', '이것은 개발 게시판의 두 번째 글입니다.', 'pass303', 2);
INSERT INTO articles (title, content, password, board_id)
VALUES ('개발 게시판의 세 번째 글', '이것은 개발 게시판의 세 번째 글입니다.', 'pass404', 2);
INSERT INTO articles (title, content, password, board_id)
VALUES ('개발 게시판의 네 번째 글', '이것은 개발 게시판의 네 번째 글입니다.', 'pass505', 2);

-- Insert articles for 일상 게시판 (Daily Life Board)
INSERT INTO articles (title, content, password, board_id)
VALUES ('일상 게시판의 첫 번째 글', '이것은 일상 게시판의 첫 번째 글입니다.', 'pass606', 3);
INSERT INTO articles (title, content, password, board_id)
VALUES ('일상 게시판의 두 번째 글', '이것은 일상 게시판의 두 번째 글입니다.', 'pass707', 3);
INSERT INTO articles (title, content, password, board_id)
VALUES ('일상 게시판의 세 번째 글', '이것은 일상 게시판의 세 번째 글입니다.', 'pass808', 3);

-- Insert articles for 사건사고 게시판 (Incident Board)
INSERT INTO articles (title, content, password, board_id)
VALUES ('사건사고 게시판의 첫 번째 글', '이것은 사건사고 게시판의 첫 번째 글입니다.', 'pass909', 4);
INSERT INTO articles (title, content, password, board_id)
VALUES ('사건사고 게시판의 두 번째 글', '이것은 사건사고 게시판의 두 번째 글입니다.', 'pass010', 4);

-- Insert comments for 자유 게시판 (Free Board)
INSERT INTO comments (content, password, article_id)
VALUES ('첫 번째 글에 대한 첫 번째 댓글입니다.', 'commentpass1', 1);
INSERT INTO comments (content, password, article_id)
VALUES ('첫 번째 글에 대한 두 번째 댓글입니다.', 'commentpass2', 1);
INSERT INTO comments (content, password, article_id)
VALUES ('두 번째 글에 대한 첫 번째 댓글입니다.', 'commentpass3', 2);
INSERT INTO comments (content, password, article_id)
VALUES ('세 번째 글에 대한 첫 번째 댓글입니다.', 'commentpass4', 3);
INSERT INTO comments (content, password, article_id)
VALUES ('세 번째 글에 대한 두 번째 댓글입니다.', 'commentpass5', 3);

-- Insert comments for 개발 게시판 (Development Board)
INSERT INTO comments (content, password, article_id)
VALUES ('첫 번째 개발 글에 대한 첫 번째 댓글입니다.', 'commentpass6', 5);
INSERT INTO comments (content, password, article_id)
VALUES ('두 번째 개발 글에 대한 첫 번째 댓글입니다.', 'commentpass7', 6);
INSERT INTO comments (content, password, article_id)
VALUES ('세 번째 개발 글에 대한 첫 번째 댓글입니다.', 'commentpass8', 7);
INSERT INTO comments (content, password, article_id)
VALUES ('네 번째 개발 글에 대한 첫 번째 댓글입니다.', 'commentpass9', 8);
INSERT INTO comments (content, password, article_id)
VALUES ('네 번째 개발 글에 대한 두 번째 댓글입니다.', 'commentpass10', 8);

-- Insert comments for 일상 게시판 (Daily Life Board)
INSERT INTO comments (content, password, article_id)
VALUES ('일상 글에 대한 첫 번째 댓글입니다.', 'commentpass11', 9);
INSERT INTO comments (content, password, article_id)
VALUES ('일상 글에 대한 두 번째 댓글입니다.', 'commentpass12', 10);
INSERT INTO comments (content, password, article_id)
VALUES ('일상 글에 대한 세 번째 댓글입니다.', 'commentpass13', 11);

-- Insert comments for 사건사고 게시판 (Incident Board)
INSERT INTO comments (content, password, article_id)
VALUES ('사건사고 글에 대한 첫 번째 댓글입니다.', 'commentpass14', 12);
INSERT INTO comments (content, password, article_id)
VALUES ('사건사고 글에 대한 두 번째 댓글입니다.', 'commentpass15', 13);
