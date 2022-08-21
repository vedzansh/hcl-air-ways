CREATE TABLE  cancellation  (
   pnr_no  varchar(30) NOT NULL,
   cancellation_no  varchar(30) NOT NULL,
   cancellation_date  varchar(30) NOT NULL,
   ticket_id  varchar(30) NOT NULL
);

CREATE TABLE  flight  (
   f_code  varchar(30) NOT NULL,
   f_name  varchar(30) NOT NULL,
   src  varchar(30) DEFAULT ,
   dst  varchar(30) NOT NULL,
   time varchar(30) NOT NULL,
   charge  varchar(30) not null,
   class varchar(30) not null
);


CREATE TABLE  login  (
   username  varchar(30) NOT NULL,
   password  varchar(30) NOT NULL
);


INSERT INTO  login  ( username ,  password ) VALUES
('admin', 'admin_123');


CREATE TABLE  passenger  (
   pnr_no  varchar(30) NOT NULL,
   address  varchar(40) NOT NULL,
   nationality  varchar(30) NOT NULL,
   name  varchar(30) NOT NULL,
   gender  varchar(30) NOT NULL,
   ph_no  varchar(30) NOT NULL,
   passport_no  varchar(30) NOT NULL,
   fl_code  varchar(30) NOT NULL
) ;


INSERT INTO  passenger  ( pnr_no ,  address ,  nationality ,  name ,  gender ,  ph_no ,  passport_no ,  fl_code ) VALUES
('01', 'Negros Occidental, Philippines', 'Filipino', '', 'male', '09272777334', 'SAR081119', 'f1005');



CREATE TABLE  reservation  (
   pnr_no  varchar(30) NOT NULL,
   ticket_id  varchar(30) NOT NULL,
   f_code  varchar(30) NOT NULL,
   jny_date  varchar(30) NOT NULL,
   jny_time  varchar(30) NOT NULL,
   src  varchar(30) NOT NULL,
   dst  varchar(30) NOT NULL
) ;


INSERT INTO  reservation  ( pnr_no ,  ticket_id ,  f_code ,  jny_date ,  jny_time ,  src ,  dst ) VALUES
('11', '111', 'f1005', '2022-05-05', '1:00 PM', 'Philippines', 'United States');

create table ticket (
   ticket_id number PRIMARY KEY,
   pnr_no varchar(30) not null,
   type varchar(30) not null,
   charge varchar(30) not null
);
