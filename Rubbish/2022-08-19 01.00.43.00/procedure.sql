
CREATE OR REPLACE PROCEDURE cancel_ticket(t_id in int,pnr in varchar2,c_date in varchar2,status out varchar2 )
AS
id number;
BEGIN
    DELETE FROM ticket
    WHERE ticket_id=t_id
    and pnr_no=pnr;
    DELETE FROM reservation
    WHERE ticket_id=t_id
    and pnr_no=pnr;
    if(sql%found) then
    status:='TICKET CANCELLED SUCCESSFULLY....!!';
    SELECT cancelltion_id.nextval INTO id FROM DUAL;
    insert into cancellation values (pnr,id,c_date,t_id);
    else 
    status:='NO TICKET FIND WITH THIS TICKET ID';
    END IF;
end;
/

Create Sequence cancelltion_id increment by 1 start with 1000 maxvalue 9999;
create or replace PROCEDURE ticket_add(pnr_no in varchar2,class in varchar2,charge in varchar2) 
as 
id number;
begin
    SELECT ticket_id.nextval INTO id FROM DUAL;
     insert into ticket values (id,pnr_no,class,charge);
end;
/
create or replace PROCEDURE add_flight(code in varchar2,name in varchar2,src in varchar2,dst in varchar2,f_time in varchar2,charge in varchar2,class in varchar2,status out varchar2)
as
begin
    INSERT INTO  flight VALUES (code,name,src,dst,f_time,charge,class);
    if (sql%found) then
    status:='FLIGHT ADDED SUCCESSFULLY..!!';
    else
    status:='FLIGHT ADDED FAILED..!!';
    end if;
end;
/
create or replace procedure delete_flight(code in varchar2,status out varchar2)
as 
begin 
delete from flight where f_code = code;
if(sql%found) then 
status:='FLIGHT DELETED SUCCESSFULLY..!!';
else
status:='FLIGHT DELETION FAILED..!!';
END IF;
end;
/
-- create or replace procedure cancel(pnr_no in varchar2,c_date in varchar2,ticket_id in number)
-- as 
-- id number;
-- begin
-- SELECT cancelltion_id.nextval INTO id FROM DUAL;
-- insert into cancellation values (pnr_no,id,c_date,ticket_id);

-- end;
-- /
create or replace procedure customer
(pnr_no in varchar2,  address in varchar2,  nationality  in varchar2,  name in varchar2,  gender in varchar2,  no in varchar2 ,  passport_no in varchar2 ,  f_code in varchar2 ,pnr_no in varchar2,  ticket_id in varchar2 ,  f_code in varchar2,  jny_date in varchar2,  jny_time in varchar2,  src in varchar2,  dst in varchar2)
as 
begin
INSERT INTO  passenger values  ( pnr_no ,  address ,  nationality ,  name ,  gender ,  no ,  passport_no ,  f_code );
INSERT INTO  reservation values ( pnr_no ,  ticket_id ,  f_code ,  jny_date ,  jny_time ,  src ,  dst );
end;
/
(pnr_no in varchar2,  address in varchar2,  nationality  in varchar2,  name in varchar2, 
 gender in varchar2,  no in varchar2 ,  passport_no in varchar2 ,  f_code in varchar2 pnr_no in varchar2,  
 ticket_id in varchar2 ,  f_code in varchar2, 
 jny_date in varchar2,  jny_time in varchar2,  src in varchar2,  dst in varchar2)



create or replace procedure add_reservation
( pnr_no in varchar2,  ticket_id in varchar2 ,  f_code in varchar2,  jny_date in varchar2,  jny_time in varchar2,  src in varchar2,  dst in varchar2)
as 
begin
INSERT INTO  reservation values ( pnr_no ,  ticket_id ,  f_code ,  jny_date ,  jny_time ,  src ,  dst );
end;
/