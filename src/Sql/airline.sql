create database airlinesystem;
drop database airlinesystem;
use airlinesystem;


create table User
(
	username varchar(50)  not null primary key,
    password varchar(50)
);



insert into User values ("rasaal","123123123");
insert into User values ('abdullah','123123');
insert into User values ('zubair','456789');
insert into User values ("sallahudin","124124124");
insert into User values ("amina","124124");
insert into User values ("seemal","212121");

create table Admin
(
	username varchar(50) not null,
    FOREIGN KEY(username) REFERENCES User(username) on delete cascade
);

insert into Admin Values("rasaal");


insert into Admin Values("abdullah");
insert into Admin Values("zubair");

#select count(*) as done from Admin a join User u on a.username=u.username where a.username='rasaal' and u.password="123123123"; 


create table Customer
(
	username varchar(50) not null,
    fullName varchar(50),
    Gender varchar(2),
    dob date,
    contact varchar(18),
    address varchar(300),
    FOREIGN KEY(username) REFERENCES User(username) on delete cascade
);


select Customer.fullname,Trip.departure,Trip.destination from Customer join History on Customer.username=History.username join Trip on History.tripID=Trip.tripID where History.username='abdullahlhe'; 

insert into Customer Values("sallahudin","Sallahudin Awan", "M","2001-01-07","03045852597","Faislabad");
insert into Customer Values("amina","Amina Qaiser", "F"," 2000-12-26","03334567890","Lahore");
insert into Customer Values("seemal","Seemal Arif", "F","2001-10-30","03045852597","Lahore");


#select * from Customer;
select * from User;

create table Airport
(
	airportID varchar(50) primary key not null,
	country varchar(50),
	city varchar(50)
);


insert into Airport Values("90001","Pakistan","Lahore");
insert into Airport Values("90002","France","Paris");
insert into Airport Values("90004","India","Banglore");
insert into Airport Values("90005","Germany","Barlin");
insert into Airport Values("90006","Italy","Rome");

select * from Plane;

create table Plane
(
   planeID int not null primary key,
   planeName varchar(50), 
   airportID varchar(50),
	FOREIGN KEY(airportID) REFERENCES Airport(airportID) on delete cascade
);


create table History
(
	username varchar(50),
	tripID int,
    foreign key (username) references User(username) on delete cascade,
    foreign key (tripID) references Trip(tripID) on delete cascade,
    primary key(username,tripID)
);
insert into History values ('abdullahlhe',1);
ALTER TABLE plane ADD COLUMN airportID varchar(50) NOT NULL;
ALTER TABLE plane ADD FOREIGN KEY (airportID) REFERENCES Airport(airportId);

drop table Plane;
insert into Plane values (123,'Jet','12');


select * from Airport;
select *from Plane;
select *from Trip;
select *from User;
insert into History values ('123',1);
select *from PrivatePlane;
insert into PrivatePlane values (123);
select departure,destination from Trip join Plane on Trip.planeID=Plane.planeID;

ALTER TABLE Trip ADD COLUMN availableseats int;
insert into Trip values (1,'KARACHI','LAHORE','KARACHI',123,13);
select *from Flight;
select *from Trip join Flight on Trip.planeID=Flight.planeID;
insert into Flight values(100,123,12,'2021-4-7','karachi','10:12:12');

select Trip.tripID,Trip.departure,Flight.destination,Flight.flightTime,Flight.flightDate,Trip.availableseats from Trip join Flight on Trip.planeID=Flight.planeID;

select * from Trip join Flight on Trip.planeID=Flight.planeID;

insert into Plane Values (1,"Shaheen","90001");
insert into Plane Values (2,"PIA","90001");
insert into Plane Values (3,"Air Blue","90004");
insert into Plane Values (4,"Emirated","90006");
insert into Plane Values (5,"Emirated","90001");
insert into Plane Values (6,"Emirated","90002");
insert into Plane Values (7,"Emirated","90004");

select * from Flight;

create table Flight
(
	flightID varchar(50) primary key not null,
     planeID int,
	FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
	airportID varchar(50),
	FOREIGN KEY(airportID) REFERENCES Airport(airportID) on delete cascade,
    flightdate date,
    destination varchar(50),
    flightTime time 
);


insert into Flight Values ('F-00001',1,'90001','2022-01-01','Jakarta','2:05:00');
insert into Flight Values ('F-00002',2,'90004','2022-01-02','Mount Everest','18:30:00');
insert into Flight Values ('F-00003',3,'90002','2022-01-02','Chille','6:00:00');
insert into Flight Values ('F-00004',4,'90004','2022-01-01','Malta','15:00:00');
insert into Flight Values ('F-00005',3,'90006','2022-01-03','Karela','13:30:00');

create table PrivatePlane
(
   planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade
);

insert into PrivatePlane Values (1);
insert into PrivatePlane Values (2);

select * from Plane;

create table GeneralPlane
(
   planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
   totalSeatsCount int,
   BusinessClassSeatsCount int,
   EconomicCLassSeatsCount int,
   FirstClassSeatsCount int
);
select * from GeneralPlane;

insert into GeneralPlane Values (4,200,50,100,50);
insert into GeneralPlane Values (3,350,50,200,100);





create table Packages
( 
   packageID int not null primary key,
   price int
);


insert into Packages Values(1,300000);
insert into Packages Values(2,500000);
insert into Packages Values(3,600000);
insert into Packages Values(4,700000);
insert into Packages Values(5,800000);
insert into Packages Values(6,900000);
insert into Packages Values(7,200000);

select * from Packages;

insert into Family Values(1,2);
insert into Family Values(2,3);

create table Family
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade,
   members int
);

create table PopularDest
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade,
   departure varchar(50),
   destination varchar(50)
);

insert into PopularDest Values(1,"Rome", "Paris");
insert into PopularDest Values(2,"Lahore", "Makkah");


create table Discounts
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade,
   discountedAmount float
);

insert into Discounts Values(3,40000);
insert into Discounts Values(4,20000);

create Table Trip
(
	tripID int not null primary key,
	TripName varchar(50),
    departure varchar(50),
	destination varchar(50)
);
select *from Trip;
select *from GeneralPlane;
ALTER TABLE Trip ADD COLUMN planeID int not null;
ALTER TABLE Trip ADD FOREIGN KEY (planeID) REFERENCES Plane(planeID);
insert into Trip values(1,'Karachi','Lahore','Karachi',123);



insert into Trip Values (1000,"Adventure","Rome","Paris");
insert into Trip Values (1001,"The Royal Route","Lahore","Paris");
insert into Trip Values (1002,"Green Esapes","Kerela","London");
insert into Trip Values (1003,"The LandMark Tour","Berlin","Mombay");
insert into Trip Values (1004,"Hope-on","NewCastle","NewYork City");

create Table RoundTrip
(
  tripID int,
   FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade
);

insert into RoundTrip Values (1001);
insert into RoundTrip Values (1004);
insert into RoundTrip Values (1003);

select * from Trip;

select f.flightID, a.airportID, f.planeID ,a.city, f.destination,f.flightdate,f.flightTime 
from Flight f join Airport a on a.airportID=f.airportID ;

create Table SingleTrip
(
  tripID int,
    FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade
);


insert into SingleTrip Values (1000);
insert into SingleTrip Values (1002);



create table Booking
(
	bookingID varchar(30) not null primary key,
   username varchar(50) not null,
   FOREIGN KEY(username) REFERENCES Customer(username) on delete cascade,
   seatsCount int not null, 
   seatType varchar(2),
   # for Economic store E
   # for First class store F
   # for Business class store B
   packageId int,
   FOREIGN KEY(packageId) REFERENCES Packages(packageId) on delete cascade,
    tripID int,
    FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade,
    flightID varchar(50),
    FOREIGN KEY(flightID) REFERENCES Flight(flightID) on delete cascade
   
);

select *from Booking;
delete from Booking where bookingID='B-834';
select *from History;
delete from History where TripID=1;
insert into Booking values
("B-1001","amina",2,'E',null,null,"F-00001");
select *from Trip;
update Trip set availableseats=20 where tripID=1;

create table Feedback
( 
	feedbackID varchar(100) primary key,
   username varchar(50) not null,
   FOREIGN KEY(username) REFERENCES Customer(username) on delete cascade,
    tripID int,
   FOREIGN KEY(tripID) REFERENCES trip(tripID) on delete cascade,
   feedback varchar(300)

);
<<<<<<< HEAD
select *from Feedback;
delete from Feedback where tripID=1;
=======

>>>>>>> 525dd00708b7b6244daae85de369b47d96c03a63
select *from Trip;

select *from GeneralPlane;
select *from PrivatePlane;
select * from Trip join GeneralPlane on Trip.planeID=GeneralPlane.planeID where tripID=1;
select * from Trip join PrivatePlane on Trip.planeID=PrivatePlane.planeID where tripID=1;
<<<<<<< HEAD
=======


select * from Booking;

>>>>>>> 525dd00708b7b6244daae85de369b47d96c03a63

select b.bookingID, c.fullName,f.departure ,f.destination  from Booking b join Customer c on b.username=c.username join Plane p on p.planeID=b.planeID
join Airport ar on ar.airportID=p.airportID join Packages pp on pp.packageID=b.packageID 
join Trip t on t.tripID=b.tripID join Flight f on f.flightID=b.flightID; 

select b.bookingID, c.fullName,ar.country ,f.destination, pp.packageID, b.seatsCount, f.flightdate  from Booking b 
join Customer c on b.username=c.username  
left join Packages pp on pp.packageID=b.packageID 
left join Packages pp on pp.packageID=b.packageID  
left join Trip t on t.tripID=b.tripID 
join Flight f on f.flightID=b.flightID
join Airport ar on ar.airportID=f.airportID; 


 

create table Captain
(
	captainId varchar(30) not null primary key,
	username varchar(50) not null,
    FOREIGN KEY(username) REFERENCES User(username) on delete cascade,
    CaptainName varchar(50),
    age int,
    gender varchar(2)
);

delete from Captain where captainId="Cap-00958032";


select * from Captain;

