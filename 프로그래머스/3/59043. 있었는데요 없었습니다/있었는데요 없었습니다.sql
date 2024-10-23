SELECT _in.ANIMAL_ID, _in.NAME from ANIMAL_INS _in inner join ANIMAL_OUTS _out on _in.ANIMAL_ID=_out.ANIMAL_ID
where _out.DATETIME<_in.DATETIME order by _in.DATETIME