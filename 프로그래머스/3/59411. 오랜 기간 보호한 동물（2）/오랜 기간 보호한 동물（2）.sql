SELECT _in.ANIMAL_ID, _in.NAME from ANIMAL_INS _in inner join ANIMAL_OUTS _out on _in.ANIMAL_ID=_out.ANIMAL_ID 
    order by _out.DATETIME-_in.DATETIME desc limit 2;