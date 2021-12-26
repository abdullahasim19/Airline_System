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

select count(*) as done from Admin a join User u on a.username=u.username where a.username='rasaal' and u.password="123123123"; 


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

select * from Customer;
select * from User;


create table Plane
(
   planeID int not null primary key,
   planeName varchar(50)
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


create table Feedback
( 
   username varchar(50) not null,
   FOREIGN KEY(username) REFERENCES Customer(username) on delete cascade,
    planeID int,
   FOREIGN KEY(planeID) REFERENCES Plane(planeID) on delete cascade,
   feedback varchar(300)

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
    FOREIGN KEY(tripID) REFERENCES Trip(tripID) on delete cascade
   
);

create table Packages
( 
   packageID int not null primary key
);

create table Family
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade
);

create table PopularDest
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade
);

create table PopularJourney
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade
);

create table Discounts
( 
   packageID int,
   FOREIGN KEY(packageID) REFERENCES Packages(packageID) on delete cascade
);

create Table Trip
(
	tripID int not null primary key,
  TripName varchar(50) 
);

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




