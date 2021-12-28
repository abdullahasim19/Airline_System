create database airlinesystem;
drop database airlinesystem;
use airlinesystem;


create table User
(
	username varchar(50)  not null primary key,
    password varchar(50)
);



insert into User values ("rasaal","123123123");

create table Admin
(
	username varchar(50) not null,
    FOREIGN KEY(username) REFERENCES User(username) on delete cascade
);

insert into Admin Values("rasaal");

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

#select * from Customer;
#select * from User;

create table Airport
(
	airportID varchar(50) primary key not null,
	country varchar(50),
	city varchar(50)
);

insert into Airport values (12,'Pakistan','Lahore');


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
    foreign key (tripID) references Trip(tripID) on delete cascade
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

create table PrivatePlane
(
   planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade
);
create table GeneralPlane
(
   planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
   totalSeatsCount int,
   BusinessClassSeatsCount int,
   EconomicCLassSeatsCount int,
   FirstClassSeatsCount int
);

create table Packages
( 
   packageID int not null primary key,
   price int
);

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



create table Discounts
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade,
   discountedAmount float
);


create Table Trip
(
	tripID int not null primary key,
	TripName varchar(50),
    departure varchar(50),
	destination varchar(50)
);
select *from Trip;
select *from Plane;
ALTER TABLE Trip ADD COLUMN planeID int not null;
ALTER TABLE Trip ADD FOREIGN KEY (planeID) REFERENCES Plane(planeID);
insert into Trip values(1,'Karachi','Lahore','Karachi',123);


create Table RoundTrip
(
  tripID int,
   FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade
);

create Table SingleTrip
(
  tripID int,
    FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade
);




create table Booking
(
	bookingID varchar(30) not null primary key,
   username varchar(50) not null,
   FOREIGN KEY(username) REFERENCES Customer(username) on delete cascade,
   seatsCount int not null, 
    planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
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


create table Feedback
( 
   username varchar(50) not null,
   FOREIGN KEY(username) REFERENCES Customer(username) on delete cascade,
    planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
   feedback varchar(300)

);



select b.bookingID, c.fullName,f.departure ,f.destination  from Booking b join Customer c on b.username=c.username join Plane p on p.planeID=b.planeID
join Airport ar on ar.airportID=p.airportID join Packages pp on pp.packageID=b.packageID 
join Trip t on t.tripID=b.tripID join Flight f on f.flightID=b.flightID; 

 



