DROP TABLE MEMBER;
DROP SEQUENCE SEQ_USERNO;

CREATE TABLE MEMBER (
    USERNO NUMBER PRIMARY KEY,                          -- 회원번호
    USERID VARCHAR2(15) NOT NULL UNIQUE,                -- 회원아이디
    USERPWD VARCHAR2(15) NOT NULL,                      -- 회원비밀번호
    USERNAME VARCHAR2(20) NOT NULL,                     -- 회원명  
    GENDER CHAR(1) CHECK(GENDER IN ('M', 'F')),         -- 성별
    AGE NUMBER,                                         -- 나이
    EMAIL VARCHAR2(30),                                 -- 이메일
    PHONE CHAR(11),                                     -- 연락처
    ADDRESS VARCHAR2(100),                              -- 주소
    HOBBY VARCHAR2(50),                                 -- 취미
    ENROLL_DATE DATE DEFAULT SYSDATE NOT NULL           -- 회원가입일
);

CREATE SEQUENCE SEQ_USERNO
NOCACHE;

INSERT INTO MEMBER
VALUES (SEQ_USERNO.NEXTVAL, 'admin', '1234', '관리자', 'M', 45, 'admin@iei.or.kr', '01012345555', '서울', null, '2025/01/02');

SELECT * FROM MEMBER;

INSERT INTO MEMBER
VALUES (SEQ_USERNO.NEXTVAL, 'user01', 'pass01', '차은우', NULL, 23, 'user01@iei.or.kr', '01022221111', '부산', '등산,영화보기', '2025-01-10');

COMMIT; -- 필수로 해야 합니다.

CREATE TABLE TEST(
    TNO NUMBER,
    TNAME VARCHAR2(20),
    TDATE DATE
);

SELECT * FROM TEST;




















































































































