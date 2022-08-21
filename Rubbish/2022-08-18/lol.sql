create or replace PROCEDURE add_flight(code in varchar2,name in varchar2,f_src in varchar2,f_dst in varchar2,f_time in varchar2,f_charge in varchar2,f_class in varchar2,status out varchar2)
as
status varchar(30);
begin
INSERT INTO  flight VALUES (code,name,f_src,f_dst,f_time,f_charge,f_class);
if (sql%found) then
status:='FLIGHT ADDED SUCCESSFULLY..!!';
ELSE 
status:='FLIGHT ADDED FAILED..!!';
END IF;
END;
/