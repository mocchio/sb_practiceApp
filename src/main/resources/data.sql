INSERT INTO employee(id, name, age) VALUES('1', 'Kato', 10)

-- ユーザーマスタ --
INSERT INTO m_user (
  user_id
 ,password
 ,user_name
 ,birthday
 ,age
 ,gender
 ,department_id
 ,role
) VALUES ('system@co.jp', 'password', 'システム管理者', '2000-01-01', 21, 1, 1, 'ROLE_ADMIN'
),('user@co.jp', 'password', 'ユーザー1', '2001-02-02', 21, 2, 2, 'ROLE_GENERAL');

-- 部署マスタ --
INSERT INTO m_department (
  department_id
 ,department_name
) VALUES (1, 'システム管理部'),(2, '営業部');

-- 給料テーブル --
INSERT INTO t_salary (
  user_id
 ,year_month
 ,salary
) VALUES ('user@co.jp', '2022/05', 300000)
,('user@co.jp', '2022/05', 500000)
,('user@co.jp', '2022/05', 400000);