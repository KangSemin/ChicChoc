SELECT PT_NAME, PT_NO, GEND_CD, AGE, if(TLNO is null,'NONE',TLNO) from PATIENT where age<=12 and gend_cd='W'
order by 4 desc,1 asc;