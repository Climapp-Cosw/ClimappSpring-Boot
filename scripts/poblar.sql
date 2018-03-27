insert into Users (email,name,password,img,confpasswd)
values("juan.arevalo.merchan@gmail.com","Juan Pablo","123","motos/esp/images/Moto2.png","123");

insert into Users (email,name,password,img,confpasswd)
values("prueba@mail.com","Laura","password","http://www.your3dsource.com/images/facepic1.jpeg","password");

insert into Users (email,name,password,img,confpasswd)
values("prueba2@mail.com","Lucas","password","http://www.your3dsource.com/images/facepic2.jpeg","password");

insert into Zones (id,name,number)
values(11,"Suba",11);

insert into Coordinate (id,latitude,longitude,Zone_id)
values(1,4.710988599999999,-74.072092,null);

insert into Coordinate (id,latitude,longitude,Zone_id)
values(2,4.711777486983153,-74.07104712948808,null);

insert into Coordinate (latitude,longitude,Zone_id)
values(4.836357, -74.084712,11);

insert into Coordinate (latitude,longitude,Zone_id)
values(4.828147, -74.033557,11);

insert into Coordinate (latitude,longitude,Zone_id)
values(4.741931, -74.134494,11);

insert into Coordinate (latitude,longitude,Zone_id)
values(4.686501, -74.057247,11);

insert into Report (datereport,img,comment,weather,User_id,Zone_id,Coordinate_id,Publication_id)
values ("2018-27-03","assets/img/rain","comment","rain",1,11,1,null);

insert into Report (datereport,img,comment,weather,User_id,Zone_id,Coordinate_id,Publication_id)
values ("2018-27-03","assets/img/rain","comment","rain",2,11,2,null);