SELECT * FROM MEMBER;
SELECT * FROM MEMBER WHERE USERNAME LIKE '%XXX%';

-- ȸ�� ���� ���� ��û�� ������ sql��
UPDATE MEMBER
    SET USERPWD = 'XXXX'
        , EMAIL = 'XXXX'
        , PHONE = 'XXXXXXXXX'
        , ADDRESS = 'XXXXXXX'
WHERE USERID = 'XXXX'

-- ȸ�� Ż�� �� ������ sql��
DELETE
FROM MEMBER
WHERE USERID = 'xxxx'
;
DELETE
FROM MEMBER
WHERE USERID = 'USER04';

SELECT * FROM MEMBER;
-- 3��. ȸ�� ���̵�� �˻� ��û �� ����� sql��
SELECT * FROM MEMBER WHERE USERID = ?;

-- 4��. ȸ�� �̸����� �˻� ��û �� ����� sql��
SELECT * FROM MEMBER WHERE USERNAME LIKE '%��%'; -- �̰� �ɱ�?
--> ���� ����� ������ ������?

-- 5��. ȸ�� ���� ���� ��û �� ����� sql��
UPDATE MEMBER SET USERPWD = ?, EMAIL = ?, PHONE = ?, ADDRESS = ? WHERE USERID = ?;

-- 6��. ȸ�� Ż�� ��û �� ����� sql��
DELETE FROM MEMBER WHERE USERID = ?;