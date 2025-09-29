mysql> create DML database;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DML database' at line 1
mysql> create database DML;
Query OK, 1 row affected (0.01 sec)

mysql> create table employee (emp_id int primary key, first_name varchar(20) not null, last_name varchar(20) not null, Email varchar(20) unique, phone_no int unique, hire_date date , job_id int, salary float(7,2),commission int, m_id int, d_id int);
Query OK, 0 rows affected, 1 warning (0.06 sec)

mysql> create table department(dep_id int , dep_name varchar(20),manager_id int, location_id int, primary key(dep_id, manager_id));
ERROR 1050 (42S01): Table 'department' already exists
mysql> table department;
+--------+----------+------------+----------+
| dep_id | dep_name | manager_id | location |
+--------+----------+------------+----------+
|      0 | computer |          0 | pune     |
|      2 | entc     |          2 | pune     |
|      2 | entc     |          4 | pune     |
|    102 | IIT      |          2 | mubai    |
|    103 | entc     |        103 | nagar    |
|    104 | comp     |          6 | nashik   |
|    104 | eyy      |        103 | nashik   |
|    105 | eyy      |          7 | shirdi   |
+--------+----------+------------+----------+
8 rows in set (0.00 sec)

mysql> use dml;
Database changed
mysql> create table employee (emp_id int primary key, first_name varchar(20) not null, last_name varchar(20) not null, Email varchar(20) unique, phone_no int unique, hire_date date , job_id int, salary float(7,2),commission int, m_id int, d_id int);
Query OK, 0 rows affected, 1 warning (0.06 sec)

mysql>  create table department(dep_id int , dep_name varchar(20),manager_id int, location_id int, primary key(dep_id, manager_id));
Query OK, 0 rows affected (0.02 sec)

mysql> desc employee;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| emp_id     | int         | NO   | PRI | NULL    |       |
| first_name | varchar(20) | NO   |     | NULL    |       |
| last_name  | varchar(20) | NO   |     | NULL    |       |
| Email      | varchar(20) | YES  | UNI | NULL    |       |
| phone_no   | int         | YES  | UNI | NULL    |       |
| hire_date  | date        | YES  |     | NULL    |       |
| job_id     | int         | YES  |     | NULL    |       |
| salary     | float(7,2)  | YES  |     | NULL    |       |
| commission | int         | YES  |     | NULL    |       |
| m_id       | int         | YES  |     | NULL    |       |
| d_id       | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
11 rows in set (0.01 sec)

mysql> alter table employee
    -> drop m_id;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table employee
    -> drop d_id;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc employee;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| emp_id     | int         | NO   | PRI | NULL    |       |
| first_name | varchar(20) | NO   |     | NULL    |       |
| last_name  | varchar(20) | NO   |     | NULL    |       |
| Email      | varchar(20) | YES  | UNI | NULL    |       |
| phone_no   | int         | YES  | UNI | NULL    |       |
| hire_date  | date        | YES  |     | NULL    |       |
| job_id     | int         | YES  |     | NULL    |       |
| salary     | float(7,2)  | YES  |     | NULL    |       |
| commission | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
9 rows in set (0.00 sec)

mysql> desc table departmwnt;
ERROR 1146 (42S02): Table 'dml.departmwnt' doesn't exist
mysql> desc table departmnnt;
ERROR 1146 (42S02): Table 'dml.departmnnt' doesn't exist
mysql> desc table department;
+----+-------------+------------+------------+------+---------------+------+---------+------+------+----------+-------+
| id | select_type | table      | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
+----+-------------+------------+------------+------+---------------+------+---------+------+------+----------+-------+
|  1 | SIMPLE      | department | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    1 |   100.00 | NULL  |
+----+-------------+------------+------------+------+---------------+------+---------+------+------+----------+-------+
1 row in set, 1 warning (0.01 sec)

mysql> table department;
Empty set (0.00 sec)

mysql> desc department;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| dep_id      | int         | NO   | PRI | NULL    |       |
| dep_name    | varchar(20) | YES  |     | NULL    |       |
| manager_id  | int         | NO   | PRI | NULL    |       |
| location_id | int         | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> alter table employee
    -> add foreign key(d_id,m_id)
    -> references department(dep_id,manager_id);
ERROR 1072 (42000): Key column 'd_id' doesn't exist in table
mysql> alter table employee
    -> add column d_id int;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table employee
    -> add column m_id int;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table employee
    -> add foreign key(d_id,m_id)
    -> references department(dep_id,manager_id);
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc employee;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| emp_id     | int         | NO   | PRI | NULL    |       |
| first_name | varchar(20) | NO   |     | NULL    |       |
| last_name  | varchar(20) | NO   |     | NULL    |       |
| Email      | varchar(20) | YES  | UNI | NULL    |       |
| phone_no   | int         | YES  | UNI | NULL    |       |
| hire_date  | date        | YES  |     | NULL    |       |
| job_id     | int         | YES  |     | NULL    |       |
| salary     | float(7,2)  | YES  |     | NULL    |       |
| commission | int         | YES  |     | NULL    |       |
| d_id       | int         | YES  | MUL | NULL    |       |
| m_id       | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
11 rows in set (0.00 sec)

mysql> insert into department
    -> values(10,"Administration",200,1700);
Query OK, 1 row affected (0.01 sec)

mysql> insert into department
    -> values(20,"Marketing",201,1800),
    -> (30,"Purchasing",114,1700);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> table deparment;
ERROR 1146 (42S02): Table 'dml.deparment' doesn't exist
mysql> table department;
+--------+----------------+------------+-------------+
| dep_id | dep_name       | manager_id | location_id |
+--------+----------------+------------+-------------+
|     10 | Administration |        200 |        1700 |
|     20 | Marketing      |        201 |        1800 |
|     30 | Purchasing     |        114 |        1700 |
+--------+----------------+------------+-------------+
3 rows in set (0.00 sec)

mysql> insert into department
    -> values(40,"HR",203,2400),
    -> (50,"Shipping",121,1500),
    -> (60,"IT",103,1400),
    -> (70,"Public FRelations",204,2700),
    -> (80,"sales",145,2500);
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> insert into employee
    -> values(100,"Steven","King","sk@gmail.com",23456789890,1987-06-17,01,240000,0,200,10);
ERROR 1264 (22003): Out of range value for column 'phone_no' at row 1
mysql> values(100,"Steven","King","sk@gmail.com",2345687,1987-06-17,01,240000,0,200,10);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(100,"Steven","King","sk@gmail.com",2345687,1987-06-17,01,240000,0,200,10)' at line 1
mysql> values(100,"Steven","King","sk@gmail.com",2345687,"1987-06-17",01,240000,0,200,10);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(100,"Steven","King","sk@gmail.com",2345687,"1987-06-17",01,240000,0,200,10)' at line 1
mysql> insert into employee
    -> values(100,"Steven","King","sk@gmail.com",2345670,"1987-06-17",01,240000,0,200,10);
ERROR 1264 (22003): Out of range value for column 'salary' at row 1
mysql> values(100,"Steven","King","sk@gmail.com",2345670,"1987-06-17",01,24000,0,200,10);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(100,"Steven","King","sk@gmail.com",2345670,"1987-06-17",01,24000,0,200,10)' at line 1
mysql> insert into employee
    -> values(100,"Steven","King","sk@gmail.com",2345670,"1987-06-17",01,24000,01,200,10);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`dml`.`employee`, CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`d_id`, `m_id`) REFERENCES `department` (`dep_id`, `manager_id`))
mysql> table department;
+--------+-------------------+------------+-------------+
| dep_id | dep_name          | manager_id | location_id |
+--------+-------------------+------------+-------------+
|     10 | Administration    |        200 |        1700 |
|     20 | Marketing         |        201 |        1800 |
|     30 | Purchasing        |        114 |        1700 |
|     40 | HR                |        203 |        2400 |
|     50 | Shipping          |        121 |        1500 |
|     60 | IT                |        103 |        1400 |
|     70 | Public FRelations |        204 |        2700 |
|     80 | sales             |        145 |        2500 |
+--------+-------------------+------------+-------------+
8 rows in set (0.00 sec)

mysql> insert into employee
    -> values(100,"Steven","King","sk@gmail.com",2345670,"1987-06-17",01,24000,01,10,200);
Query OK, 1 row affected (0.01 sec)

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_id | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 |      1 | 24000.00 |          1 |   10 |  200 |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
1 row in set (0.00 sec)

mysql> update employee set commission = 0.00 where emp_id = 100;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_id | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 |      1 | 24000.00 |          0 |   10 |  200 |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
1 row in set (0.00 sec)

mysql> insert into employee
    -> values(101,"Neena","Kocchar","nk@gmail.com",2334560,"1987-06-18",02,17000,0.0,10,200);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(101,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103);
ERROR 1062 (23000): Duplicate entry '101' for key 'employee.PRIMARY'
mysql> values(102,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(102,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103)' at line 1
mysql> insert into employee
    -> values(102,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103);
Query OK, 1 row affected (0.01 sec)

mysql> values(101,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(101,"Lex","de haan","lx@gmail.com",233560,"1987-06-19",03,18000,0.0,60,103)' at line 1
mysql> insert into employee
    -> values(103,"Alexander","Hunnold","lx@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,103);
ERROR 1062 (23000): Duplicate entry 'lx@gmail.com' for key 'employee.Email'
mysql> values(103,"Alexander","Hunnold","ah@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,103);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(103,"Alexander","Hunnold","ah@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,' at line 1
mysql> insert into employee
    -> values(103,"Alexander","Hunnold","ah@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,103);
Query OK, 1 row affected (0.01 sec)

mysql> values(103,"Alexander","Hunnold","lx@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,103);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(103,"Alexander","Hunnold","lx@gmail.com",23356088,"1987-06-20",04,19000,0.0,60,' at line 1
mysql> insert into employee
    -> values(104,"Bruce","Ernst","be@gmail.com",2335608,"1987-06-21",04,20000,0.0,60,103);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(105,"David","Astin","da@gmail.com",11335608,"1987-06-22",05,48000,0.0,60,103);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(106,"Valli","Paraballa","vp@gmail.com",18835608,"1987-06-23",05,42000,0.0,60,103);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(107,"Diana","Lorentz","dl@gmail.com",188378,"1987-06-24",06,42000,0.0,30,114);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(108,"Nancy","Greenberg","ng@gmail.com",1768718,"1987-06-25",07,12000,0.0,80,145);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(109,"Deniel","Faviet","df@gmail.com",8968718,"1987-06-26",07,9000,0.0,80,145);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee
    -> values(110,"Krutika","Jagdale","kj@gmail.com",8999718,"1987-06-27",08,90000,0.0,80,145),
    -> values(111,"Nikita","Badakh","nb@gmail.com",8999111,"1987-06-28",09,80000,0.0,30,114),
    -> values(112,"Vijeta","Badakh","vb@gmail.com",8999159,"1987-06-29",10,70000,0.0,30,114);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'values(111,"Nikita","Badakh","nb@gmail.com",8999111,"1987-06-28",09,80000,0.0,30' at line 3
mysql> insert into employee
    -> values(110,"Krutika","Jagdale","kj@gmail.com",8999718,"1987-06-27",08,90000,0.0,80,145),
    -> (111,"Nikita","Badakh","nb@gmail.com",8999111,"1987-06-28",09,80000,0.0,30,114),
    -> (112,"Vijeta","Badakh","vb@gmail.com",8999159,"1987-06-29",10,70000,0.0,30,114);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_id | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 |      1 | 24000.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com |  2334560 | 1987-06-18 |      2 | 17000.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com |   233560 | 1987-06-19 |      3 | 18000.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com | 23356088 | 1987-06-20 |      4 | 19000.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com |  2335608 | 1987-06-21 |      4 | 20000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com | 11335608 | 1987-06-22 |      5 | 48000.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com | 18835608 | 1987-06-23 |      5 | 42000.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com |   188378 | 1987-06-24 |      6 | 42000.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | ng@gmail.com |  1768718 | 1987-06-25 |      7 | 12000.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | df@gmail.com |  8968718 | 1987-06-26 |      7 |  9000.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | kj@gmail.com |  8999718 | 1987-06-27 |      8 | 90000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com |  8999111 | 1987-06-28 |      9 | 80000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com |  8999159 | 1987-06-29 |     10 | 70000.00 |          0 |   30 |  114 |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> alter table employee
    -> modify column job_id int job_ID varchar(20);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'job_ID varchar(20)' at line 2
mysql> modify column job_ID varchar(20);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'modify column job_ID varchar(20)' at line 1
mysql> modify column job_id varchar(20);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'modify column job_id varchar(20)' at line 1
mysql> alter table employee
    -> modify column job_id int job_ID varchar(20);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'job_ID varchar(20)' at line 2
mysql> alter table employee
    -> modify column job_ID varchar(20);
Query OK, 13 rows affected (0.09 sec)
Records: 13  Duplicates: 0  Warnings: 0

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_ID | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 | 1      | 24000.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com |  2334560 | 1987-06-18 | 2      | 17000.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com |   233560 | 1987-06-19 | 3      | 18000.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com | 23356088 | 1987-06-20 | 4      | 19000.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com |  2335608 | 1987-06-21 | 4      | 20000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com | 11335608 | 1987-06-22 | 5      | 48000.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com | 18835608 | 1987-06-23 | 5      | 42000.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com |   188378 | 1987-06-24 | 6      | 42000.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | ng@gmail.com |  1768718 | 1987-06-25 | 7      | 12000.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | df@gmail.com |  8968718 | 1987-06-26 | 7      |  9000.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | kj@gmail.com |  8999718 | 1987-06-27 | 8      | 90000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com |  8999111 | 1987-06-28 | 9      | 80000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com |  8999159 | 1987-06-29 | 10     | 70000.00 |          0 |   30 |  114 |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> alter table employee
    -> modify column job_ID varchar(20);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update employee set job_id ="Adpres" where job_id = 1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_id ="AD_VP" where job_id = 2;
ERROR 1292 (22007): Truncated incorrect DOUBLE value: 'Adpres'
mysql> update employee set job_id ="ADORES" where job_id = 1;
ERROR 1292 (22007): Truncated incorrect DOUBLE value: 'Adpres'
mysql> update employee set job_ID -"ADRES" where job_id = 1;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '-"ADRES" where job_id = 1' at line 1
mysql> update employee set job_ID ="ADRES" where job_id = 1;
ERROR 1292 (22007): Truncated incorrect DOUBLE value: 'Adpres'
mysql> update employee set job_ID ="AD_VP" where job_id = 2;
ERROR 1292 (22007): Truncated incorrect DOUBLE value: 'Adpres'
mysql> update employee set job_ID ="AD_VP" where job_ID = 2;
ERROR 1292 (22007): Truncated incorrect DOUBLE value: 'Adpres'
mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_ID | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 | Adpres | 24000.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com |  2334560 | 1987-06-18 | 2      | 17000.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com |   233560 | 1987-06-19 | 3      | 18000.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com | 23356088 | 1987-06-20 | 4      | 19000.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com |  2335608 | 1987-06-21 | 4      | 20000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com | 11335608 | 1987-06-22 | 5      | 48000.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com | 18835608 | 1987-06-23 | 5      | 42000.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com |   188378 | 1987-06-24 | 6      | 42000.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | ng@gmail.com |  1768718 | 1987-06-25 | 7      | 12000.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | df@gmail.com |  8968718 | 1987-06-26 | 7      |  9000.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | kj@gmail.com |  8999718 | 1987-06-27 | 8      | 90000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com |  8999111 | 1987-06-28 | 9      | 80000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com |  8999159 | 1987-06-29 | 10     | 70000.00 |          0 |   30 |  114 |
+--------+------------+-----------+--------------+----------+------------+--------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> update employee set job_ID ="AD_VP" where emp_id = 102;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="AD_VP" where emp_id = 101;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="IT_PROG" where emp_id = 103;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="IT_PROG" where emp_id = 104;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="IT_PROG" where emp_id = 105;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="IT_PROG" where emp_id = 106;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="IT_PROG" where emp_id = 107;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="SA_MAN" where emp_id = 108;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="SA_MAN" where emp_id = 109;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="SA_MAN" where emp_id = 110;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="SA_MAN" where emp_id = 111;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set job_ID ="SA_MAN" where emp_id = 112;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 | Adpres  | 24000.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com |  2334560 | 1987-06-18 | AD_VP   | 17000.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com |   233560 | 1987-06-19 | AD_VP   | 18000.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com | 23356088 | 1987-06-20 | IT_PROG | 19000.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com |  2335608 | 1987-06-21 | IT_PROG | 20000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com | 11335608 | 1987-06-22 | IT_PROG | 48000.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com | 18835608 | 1987-06-23 | IT_PROG | 42000.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com |   188378 | 1987-06-24 | IT_PROG | 42000.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | ng@gmail.com |  1768718 | 1987-06-25 | SA_MAN  | 12000.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | df@gmail.com |  8968718 | 1987-06-26 | SA_MAN  |  9000.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | kj@gmail.com |  8999718 | 1987-06-27 | SA_MAN  | 90000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com |  8999111 | 1987-06-28 | SA_MAN  | 80000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com |  8999159 | 1987-06-29 | SA_MAN  | 70000.00 |          0 |   30 |  114 |
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> create table jobs(job_id int primary key,job_title varchar(20
    -> ),min_salary int(7,2), max_salary int(7,2));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',2), max_salary int(7,2))' at line 2
mysql> create table jobs(job_id int primary key,job_title varchar(20),
    -> min_salary int(7,2), max_salary int(7,2));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',2), max_salary int(7,2))' at line 2
mysql> create table jobs(job_id int primary key,job_title varchar(20),
    -> min_salary int, max_salary int);
Query OK, 0 rows affected (0.03 sec)

mysql> insert into jobs values( "Adpres","president",20000,40000);
ERROR 1366 (HY000): Incorrect integer value: 'Adpres' for column 'job_id' at row 1
mysql> alter table jobs
    -> modify column job_id varchar(20) primary key;
ERROR 1068 (42000): Multiple primary key defined
mysql> modify column job_id varchar(20) ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'modify column job_id varchar(20)' at line 1
mysql> alter table jobs
    -> modify column job_id varchar(20) primary key;
ERROR 1068 (42000): Multiple primary key defined
mysql> alter table jobs
    -> modify column job_id varchar(20) ;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> show create table jobs;
+-------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Table | Create Table                                                                                                                                                                                                                                                 |
+-------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| jobs  | CREATE TABLE `jobs` (
  `job_id` varchar(20) NOT NULL,
  `job_title` varchar(20) DEFAULT NULL,
  `min_salary` int DEFAULT NULL,
  `max_salary` int DEFAULT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |
+-------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.00 sec)

mysql> insert into jobs values( "Adpres","president",20000,40000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into jobs values( "AD_VP","Administration",15000,30000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into jobs values( "AD_ASST","Administration Assistant",3000,6000),
    -> ("FI_MGR","Finance Manager",8200,16000),
    -> ("FI_ACCOUNT","Accountant",4200,9000),
    -> ("AC_MGR","Account Manager",8200,16000),
    -> AC_ACCOUNT","Public Accountant",4200,9000),
    "> ^C
mysql> insert into jobs values( "AD_ASST","Administration Assistant",3000,6000),
    -> ("FI_MGR","Finance Manager",8200,16000),
    -> ("FI_ACCOUNT","Accountant",4200,9000),
    -> ("AC_MGR","Account Manager",8200,16000),
    -> ( "AC_ACCOUNT","Public Accountant",4200,9000),
    -> ("SA_MAN",sales Manager",10000,20000);
    ">
    "> ^C
mysql>
mysql> insert into jobs values( "AD_ASST","Administration Assistant",3000,6000),
    -> ("FI_MGR","Finance Manager",8200,16000);
ERROR 1406 (22001): Data too long for column 'job_title' at row 1
mysql> alter table jobs
    -> modify column job
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 2
mysql> alter table jobs
    -> modify column job_title varchar(60);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> insert into jobs values( "AD_ASST","Administration Assistant",3000,6000),
    -> ("FI_MGR","Finance Manager",8200,16000),
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 2
mysql> insert into jobs values( "AD_ASST","Administration Assistant",3000,6000),
    -> ("FI_MGR","Finance Manager",8200,16000);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> insert into jobs values("FI_ACCOUNT","Accountant",4200,9000),
    -> ("AC_MGR","Account Manager",8200,16000),
    -> ( "AC_ACCOUNT","Public Accountant",4200,9000),
    ->  ("SA_MAN",sales Manager",10000,20000);
    "> ^C
mysql> insert into jobs values("FI_ACCOUNT","Accountant",4200,9000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into jobs values ("AC_MGR","Account Manager",8200,16000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into jobs values ( "AC_ACCOUNT","Public Accountant",4200,9000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into jobs values  ("SA_MAN",sales Manager",10000,20000);
    ">
    "> insert into jobs values  ("SA_MAN",sales Manager",10000,20000);^C
mysql>
mysql> insert into jobs values  ("SA_MAN","sales Manager",10000,20000);
Query OK, 1 row affected (0.01 sec)

mysql> table jobs;
+------------+--------------------------+------------+------------+
| job_id     | job_title                | min_salary | max_salary |
+------------+--------------------------+------------+------------+
| AC_ACCOUNT | Public Accountant        |       4200 |       9000 |
| AC_MGR     | Account Manager          |       8200 |      16000 |
| AD_ASST    | Administration Assistant |       3000 |       6000 |
| AD_VP      | Administration           |      15000 |      30000 |
| Adpres     | president                |      20000 |      40000 |
| FI_ACCOUNT | Accountant               |       4200 |       9000 |
| FI_MGR     | Finance Manager          |       8200 |      16000 |
| SA_MAN     | sales Manager            |      10000 |      20000 |
+------------+--------------------------+------------+------------+
8 rows in set (0.00 sec)

mysql> update jobs set job_id = :"AD_PRES" where job_id = "Adpres"
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ':"AD_PRES" where job_id = "Adpres"' at line 1
mysql> update table jobs set job_id = :"AD_PRES" where job_id = "Adpres"
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table jobs set job_id = :"AD_PRES" where job_id = "Adpres"' at line 1
mysql> update jobs set job_id = :"AD_PRES" where job_id = "Adpres";
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ':"AD_PRES" where job_id = "Adpres"' at line 1
mysql> UPDATE jobs
    -> SET job_id = 'AD_PRES'
    -> WHERE job_id = 'Adpres';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> table jobs;
+------------+--------------------------+------------+------------+
| job_id     | job_title                | min_salary | max_salary |
+------------+--------------------------+------------+------------+
| AC_ACCOUNT | Public Accountant        |       4200 |       9000 |
| AC_MGR     | Account Manager          |       8200 |      16000 |
| AD_ASST    | Administration Assistant |       3000 |       6000 |
| AD_PRES    | president                |      20000 |      40000 |
| AD_VP      | Administration           |      15000 |      30000 |
| FI_ACCOUNT | Accountant               |       4200 |       9000 |
| FI_MGR     | Finance Manager          |       8200 |      16000 |
| SA_MAN     | sales Manager            |      10000 |      20000 |
+------------+--------------------------+------------+------------+
8 rows in set (0.00 sec)

mysql> alter table jobs
    -> modify column job_id
    -> first;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'first' at line 3
mysql> ALTER TABLE jobs
    -> MODIFY COLUMN job_id='AD_PRES' FIRST;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '='AD_PRES' FIRST' at line 2
mysql> mysql> ALTER TABLE jobs
    ->     -> MODIFY COLUMN job_id='AD_PRES' FIRST;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'mysql> ALTER TABLE jobs
    -> MODIFY COLUMN job_id='AD_PRES' FIRST' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '='AD_PRES' FIRST' at line 2
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> ALTER TABLE jobs
    -> MODIFY COLUMN job_id varchar(60) FIRST;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ALTER TABLE jobs
    -> MODIFY COLUMN job_id varchar(30) FIRST;
Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> ALTER TABLE jobs
    -> MODIFY COLUMN job_id varchar(60) FIRST;
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql>
mysql> ALTER TABLE jobs
    -> modify column job_id ='AD_PRES'
    -> after job_id = 'AC_ACCOUNT';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '='AD_PRES'
after job_id = 'AC_ACCOUNT'' at line 2
mysql> UPDATE jobs
    -> SET job_id = 'AD_PRES'
    -> WHERE job_id = 'AC_ACCOUNT';
ERROR 1062 (23000): Duplicate entry 'AD_PRES' for key 'jobs.PRIMARY'
mysql> update jobs set job_id='AC_ACCOUNT' where job_id='AD;
    '> ^C
mysql>
mysql> update employee
    -> set salary = salary*1.10;
Query OK, 13 rows affected (0.01 sec)
Rows matched: 13  Changed: 13  Warnings: 0

mysql> table employee;
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | Email        | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | ng@gmail.com |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | df@gmail.com |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | kj@gmail.com |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+--------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql>
mysql> update employee
    -> set Email='not available'
    -> and
    -> ';
    '> ^C
mysql> update employee
    -> set Email = 'Not Available;
    '> ;
    '> ^C
mysql> update employee
    -> set Email = 'Not Available'
    -> where d_id = 80
    -> and commission < 0.20;
ERROR 1062 (23000): Duplicate entry 'Not Available' for key 'employee.Email'
mysql> alter table  email
    -> modify column Email varchar(20);
ERROR 1146 (42S02): Table 'dml.email' doesn't exist
mysql> alter table  employee
    -> modify column Email varchar(20);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update employee
    -> set Email = 'Not Available'
    -> where d_id = 80
    -> and commission < 0.20;
ERROR 1062 (23000): Duplicate entry 'Not Available' for key 'employee.Email'
mysql> alter table employee
    -> modify culomn email vaychar(20) not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'email vaychar(20) not null' at line 2
mysql> alter table employee
    -> modify culomn email varchar(20) not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'email varchar(20) not null' at line 2
mysql> alter table employee
    -> modify column email varchar(20) not null;
Query OK, 0 rows affected (0.14 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update employee
    -> set Email = 'Not Available'
    -> where d_id = 80
    -> and commission < 0.20;
ERROR 1062 (23000): Duplicate entry 'Not Available' for key 'employee.Email'
mysql> show create table employee;
+----------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Table    | Create Table                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
+----------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| employee | CREATE TABLE `employee` (
  `emp_id` int NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone_no` int DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  `job_ID` varchar(20) DEFAULT NULL,
  `salary` float(7,2) DEFAULT NULL,
  `commission` int DEFAULT NULL,
  `d_id` int DEFAULT NULL,
  `m_id` int DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `Email` (`email`),
  UNIQUE KEY `phone_no` (`phone_no`),
  KEY `d_id` (`d_id`,`m_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`d_id`, `m_id`) REFERENCES `department` (`dep_id`, `manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |
+----------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.00 sec)

mysql> ALTER TABLE table_name
    -> DROP INDEX unique_email;
ERROR 1146 (42S02): Table 'dml.table_name' doesn't exist
mysql>
mysql> ALTER TABLE employee
    -> drop index email;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update employee
    -> set Email = 'Not Available'
    -> where d_id = 80
    -> and commission < 0.20;
Query OK, 3 rows affected (0.01 sec)
Rows matched: 3  Changed: 3  Warnings: 0

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com  |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com  |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com  |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com  | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com  |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com  | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com  | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | dl@gmail.com  |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | Not Available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | Not Available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | Not Available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | nb@gmail.com  |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | vb@gmail.com  |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> update employee
    -> set email = 'not avialable'
    -> where ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 3
mysql> table department;
+--------+-------------------+------------+-------------+
| dep_id | dep_name          | manager_id | location_id |
+--------+-------------------+------------+-------------+
|     10 | Administration    |        200 |        1700 |
|     20 | Marketing         |        201 |        1800 |
|     30 | Purchasing        |        114 |        1700 |
|     40 | HR                |        203 |        2400 |
|     50 | Shipping          |        121 |        1500 |
|     60 | IT                |        103 |        1400 |
|     70 | Public FRelations |        204 |        2700 |
|     80 | sales             |        145 |        2500 |
+--------+-------------------+------------+-------------+
8 rows in set (0.00 sec)

mysql> update employee
    -> set email = 'not avialable'
    -> where d_id = 30;
Query OK, 3 rows affected (0.01 sec)
Rows matched: 3  Changed: 3  Warnings: 0

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com  |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com  |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com  |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com  | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com  |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com  | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com  | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | not avialable |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | Not Available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | Not Available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | Not Available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | not avialable |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | not avialable |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> update employee
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> select email,commission from employee
    -> ;
+---------------+------------+
| email         | commission |
+---------------+------------+
| sk@gmail.com  |          0 |
| nk@gmail.com  |          0 |
| lx@gmail.com  |          0 |
| ah@gmail.com  |          0 |
| be@gmail.com  |          0 |
| da@gmail.com  |          0 |
| vp@gmail.com  |          0 |
| not avialable |          0 |
| Not Available |          0 |
| Not Available |          0 |
| Not Available |          0 |
| not avialable |          0 |
| not avialable |          0 |
+---------------+------------+
13 rows in set (0.00 sec)

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | sk@gmail.com  |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | nk@gmail.com  |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | lx@gmail.com  |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | ah@gmail.com  | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | be@gmail.com  |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | da@gmail.com  | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | vp@gmail.com  | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | not avialable |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | Not Available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | Not Available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | Not Available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | not avialable |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | not avialable |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> update employee
    -> set email='not available', commission = 0.10
    -> ;
Query OK, 13 rows affected (0.01 sec)
Rows matched: 13  Changed: 13  Warnings: 0

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | not available |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | not available |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | not available |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | not available | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | not available |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | not available | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | not available | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | not available |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | not available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | not available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | not available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | not available |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | not available |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> update employee
    -> set commission = 0.10;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 13  Changed: 0  Warnings: 0

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | not available |  2345670 | 1987-06-17 | Adpres  | 26400.00 |          0 |   10 |  200 |
|    101 | Neena      | Kocchar   | not available |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |          0 |   10 |  200 |
|    102 | Lex        | de haan   | not available |   233560 | 1987-06-19 | AD_VP   | 19800.00 |          0 |   60 |  103 |
|    103 | Alexander  | Hunnold   | not available | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |          0 |   60 |  103 |
|    104 | Bruce      | Ernst     | not available |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |          0 |   60 |  103 |
|    105 | David      | Astin     | not available | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |          0 |   60 |  103 |
|    106 | Valli      | Paraballa | not available | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |          0 |   60 |  103 |
|    107 | Diana      | Lorentz   | not available |   188378 | 1987-06-24 | IT_PROG | 46200.00 |          0 |   30 |  114 |
|    108 | Nancy      | Greenberg | not available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |          0 |   80 |  145 |
|    109 | Deniel     | Faviet    | not available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |          0 |   80 |  145 |
|    110 | Krutika    | Jagdale   | not available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |          0 |   80 |  145 |
|    111 | Nikita     | Badakh    | not available |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |          0 |   30 |  114 |
|    112 | Vijeta     | Badakh    | not available |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |          0 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql> show create table employee;
+----------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Table    | Create Table                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
+----------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| employee | CREATE TABLE `employee` (
  `emp_id` int NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone_no` int DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  `job_ID` varchar(20) DEFAULT NULL,
  `salary` float(7,2) DEFAULT NULL,
  `commission` int DEFAULT NULL,
  `d_id` int DEFAULT NULL,
  `m_id` int DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `phone_no` (`phone_no`),
  KEY `d_id` (`d_id`,`m_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`d_id`, `m_id`) REFERENCES `department` (`dep_id`, `manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |
+----------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.00 sec)

mysql> alter table employee
    -> modify commision float;
ERROR 1054 (42S22): Unknown column 'commision' in 'employee'
mysql> alter table employee
    -> modify column commision float;
ERROR 1054 (42S22): Unknown column 'commision' in 'employee'
mysql> alter table employee
    -> modify column commission float;
Query OK, 13 rows affected (0.09 sec)
Records: 13  Duplicates: 0  Warnings: 0

mysql> update employee
    -> set commission = 0.10;
Query OK, 13 rows affected (0.01 sec)
Rows matched: 13  Changed: 13  Warnings: 0

mysql> table employee;
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
| emp_id | first_name | last_name | email         | phone_no | hire_date  | job_ID  | salary   | commission | d_id | m_id |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
|    100 | Steven     | King      | not available |  2345670 | 1987-06-17 | Adpres  | 26400.00 |        0.1 |   10 |  200 |
|    101 | Neena      | Kocchar   | not available |  2334560 | 1987-06-18 | AD_VP   | 18700.00 |        0.1 |   10 |  200 |
|    102 | Lex        | de haan   | not available |   233560 | 1987-06-19 | AD_VP   | 19800.00 |        0.1 |   60 |  103 |
|    103 | Alexander  | Hunnold   | not available | 23356088 | 1987-06-20 | IT_PROG | 20900.00 |        0.1 |   60 |  103 |
|    104 | Bruce      | Ernst     | not available |  2335608 | 1987-06-21 | IT_PROG | 22000.00 |        0.1 |   60 |  103 |
|    105 | David      | Astin     | not available | 11335608 | 1987-06-22 | IT_PROG | 52800.00 |        0.1 |   60 |  103 |
|    106 | Valli      | Paraballa | not available | 18835608 | 1987-06-23 | IT_PROG | 46200.00 |        0.1 |   60 |  103 |
|    107 | Diana      | Lorentz   | not available |   188378 | 1987-06-24 | IT_PROG | 46200.00 |        0.1 |   30 |  114 |
|    108 | Nancy      | Greenberg | not available |  1768718 | 1987-06-25 | SA_MAN  | 13200.00 |        0.1 |   80 |  145 |
|    109 | Deniel     | Faviet    | not available |  8968718 | 1987-06-26 | SA_MAN  |  9900.00 |        0.1 |   80 |  145 |
|    110 | Krutika    | Jagdale   | not available |  8999718 | 1987-06-27 | SA_MAN  | 99000.00 |        0.1 |   80 |  145 |
|    111 | Nikita     | Badakh    | not available |  8999111 | 1987-06-28 | SA_MAN  | 88000.00 |        0.1 |   30 |  114 |
|    112 | Vijeta     | Badakh    | not available |  8999159 | 1987-06-29 | SA_MAN  | 77000.00 |        0.1 |   30 |  114 |
+--------+------------+-----------+---------------+----------+------------+---------+----------+------------+------+------+
13 rows in set (0.00 sec)

mysql>