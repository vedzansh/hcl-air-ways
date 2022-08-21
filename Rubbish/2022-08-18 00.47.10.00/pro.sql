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
create or replace PROCEDURE add_flight(f_code in varchar2,f_name in varchar2,f_src in varchar2,f_dst in varchar2,f_time in varchar2,f_charge in varchar2,f_class in varchar2,status out varchar2)
as
status varchar(30);
begin
INSERT INTO  flight VALUES (f_code, f_name, f_src, f_dst,f_,'RS. 13,045','BUSINESS');