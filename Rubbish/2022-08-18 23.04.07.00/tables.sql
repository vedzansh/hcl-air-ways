create and replace procedure add_revervation
( pnr_no in varchar2,  ticket_id in varchar2 ,  f_code in varchar2,  jny_date in varchar2,  jny_time in varchar2,  src in varchar2,  dst in varchar2);
as 
INSERT INTO  reservation values (pnr_no, ticket_id, f_code, jny_date, jny_time, src, dst);
end;
/