set serveroutput on
create or replace function flight_info1
(destination in varchar,code out varchar,name out varchar,source out varchar,desti out varchar)
return varchar
as
begin 
select * into code,name,source,desti from flight where dst='destination';
end;
/
show errors
CREATE OR REPLACE PROCEDURE cancel_ticket(t_id in int,status out varchar2 ) AS
BEGIN
    DELETE FROM ticket
    WHERE ticket_id=t_id;
    DELETE FROM reservation
    WHERE ticket_id=t_id;
    if(sql%found) then
    status:='TICKET CANCEL SUCCESSFULLY....!!';
    else 
    status:='NO TICKET FIND WITH THIS TICKET ID';
    END IF;
end;
/

Create Sequence ticket_id increment by 1 start with 1000 maxvalue 9999;
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
create or replace procedure 