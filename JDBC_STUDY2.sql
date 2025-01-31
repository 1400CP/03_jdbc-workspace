SELECT * FROM MEMBER;
SELECT * FROM MEMBER WHERE USERNAME LIKE '%XXX%';

-- 회원 정보 변경 요청시 실행할 sql문
UPDATE MEMBER
    SET USERPWD = 'XXXX'
        , EMAIL = 'XXXX'
        , PHONE = 'XXXXXXXXX'
        , ADDRESS = 'XXXXXXX'
WHERE USERID = 'XXXX'

-- 회원 탈퇴 시 실행할 sql문
DELETE
FROM MEMBER
WHERE USERID = 'xxxx'
;
DELETE
FROM MEMBER
WHERE USERID = 'USER04';

SELECT * FROM MEMBER;
-- 3번. 회원 아이디로 검색 요청 시 실행될 sql문
SELECT * FROM MEMBER WHERE USERID = ?;

-- 4번. 회원 이름으로 검색 요청 시 실행될 sql문
SELECT * FROM MEMBER WHERE USERNAME LIKE '%차%'; -- 이게 될까?
--> 보안 방법이 무엇이 있을까?

-- 5번. 회원 정보 변경 요청 시 실행될 sql문
UPDATE MEMBER SET USERPWD = ?, EMAIL = ?, PHONE = ?, ADDRESS = ? WHERE USERID = ?;

-- 6번. 회원 탈퇴 요청 시 실행될 sql문
DELETE FROM MEMBER WHERE USERID = ?;