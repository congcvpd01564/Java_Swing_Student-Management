--Tạo cơ sở dữ liệu quản lý sinh viên--
CREATE DATABASE Quanli_Sinhvien
GO
USE Quanli_Sinhvien;

GO
--Tạo bảng User trong quản lí Sinh viên--
CREATE TABLE Users
(
Username NVARCHAR(50) NOT NULL PRIMARY KEY,
Pass NVARCHAR(30)  NOT NULL,
Author NVARCHAR(5) NOT NULL,
Fullname NVARCHAR(30) NOT NULL,
Gender NVARCHAR(10) NOT NULL,
Email NVARCHAR(100),
Phone NVARCHAR(11) 
);
GO
--Tạo bảng Student trong quản lý sinh viên__
CREATE TABLE Student
(
ID NVARCHAR(10) NOT NULL PRIMARY KEY,
Class NVARCHAR(10) NOT NULL,
FullName NVARCHAR(50) NOT NULL,
Dateofbirth date NOT NULL,
Adress NVARCHAR(50),
Email NVARCHAR(100),
Phone NVARCHAR(11)
);
GO
--Tạo bảng Point trong quản lý sinh viên---
CREATE TABLE Point
(
ID NVARCHAR(10)  NOT NULL PRIMARY KEY,
Username NVARCHAR(50) NOT NULL, /* khóa ngoại tham chiếu đến bảng Users*/
TopNotch FLOAT NOT NULL,
Java FLOAT NOT NULL,
CSDL FLOAT NOT NULL,
Mang FLOAT NOT NULL
);
GO
------------------------------TẠO KHÓA NGOẠI CHO CÁC BẢNG---------------------------

----1-Tạo Khóa ngoại cho trường ID trong bảng Point tham chiếu đến bảng Student

ALTER TABLE Point ADD CONSTRAINT Fk_Point_ID FOREIGN KEY(ID) REFERENCES Student(ID);

--2.Tạo khóa ngoại cho trường Username trong bảng Point tham chiếu đến bảng Users

ALTER TABLE Point ADD CONSTRAINT Fk_Point_Username FOREIGN KEY(Username) REFERENCES Users(Username);

INSERT INTO Users VALUES
('Teacher',123,'gv','Cao Cuong','Nam','caocuong@fpt','0909113234'),
('Admin',123,'em','Tien Dat','Nam','tiendat@fpt','0909113234');

SELECT * FROM Users
GO
UPDATE Student SET ID ='',Class = '',FullName = '', Dateofbirth = '', Adress ='', Email = '', Phone = ''WHERE ID = '';
GO
DELETE FROM Student WHERE ID = ''

