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
CREATE PROCEDURE cancel_ticket(t_id in int ) AS
BEGIN
    DELETE FROM flight
    WHERE ticket_id=
