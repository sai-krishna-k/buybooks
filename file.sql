drop database if EXISTS ecommerce;
create database ecommerce;
use ecommerce;
select * from Books;
insert into Books values(1,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/topten.jpg'),2700,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/topten.jpg',"TopTen","J.Peder Zane");
insert into Books values(2,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/the secret garden by pegasus.jpg'),1100,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/the secret garden by pegasus.jpg',"The Secret Garden","Pegasus");
insert into Books values(3,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/five.jpg'),2000,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/five.jpg',"The Famous Five","Grid Blyton");
insert into Books values(4,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/magic of lost temple by sudha murthy.jpg'),1900,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/magic of lost temple by sudha murthy.jpg',"The magic of the Lost Temple","Sudha murthy");
insert into Books values(5,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/buy-the-third-wheel-diary-of-a-wimpy-kid by jeff kinney.jpg'),1700,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/buy-the-third-wheel-diary-of-a-wimpy-kid by jeff kinney.jpg',"Diary of a wimpy kid","Jeff kinney");
insert into Books values(6,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/life of pi.jpg'),2100,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/life of pi.jpg',"Life of Pi","Yann Martel");
insert into Books values(7,load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/avelocityofbeing_cover-1.jpg'),1800,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/avelocityofbeing_cover-1.jpg',"A velocity of Being","Maria popova");

select * from Shirts;
insert into Books values(8, 1000,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adidas.jpg',"Neck t-shirt","Adidas",load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adidas.jpg'));
insert into Books values(9, 1500,'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/hackett.jpg',"Formal-shirt","Hackett london",load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/hackett.jpg'));
insert into Shirts values(10, 1100,"Neck t-shirt","Adidas",load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adi.jpg'),'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adi.jpg');
insert into Shirts values(11, 1400," t-shirt","Hackett london",load_file('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/hacket.jpg'),'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/hacket.jpg');
