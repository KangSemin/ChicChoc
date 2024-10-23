SELECT _in.NAME, _in.DATETIME from ANIMAL_INS _in left join ANIMAL_OUTS _out on _in.ANIMAL_ID=_out.ANIMAL_ID
where _out.ANIMAL_ID is null order by 2 limit 3;